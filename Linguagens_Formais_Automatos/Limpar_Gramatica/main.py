# Trabalho de Limpar Gramática
# Linguagens Formais e Autômatos - UVV
# Alunos: Isaque Ferreira, Maria Eduarda Pereira e Vinícius Frigulha
# Professor: Saulo Pereira Ribeiro
# Turma: CC6N
#
# Objetivo do trabalho: Implementar um algoritmo para simplificar (limpar a gramática):
# Podem-se remover todas as produções indesejáveis através da seguinte sequência de passos:
# 1º - Remover as produções-vazias (Símbolo: 'h')
# 2º - Remover as produções-unidade
# 3º - Remover as produções inúteis.
#
# Arquivo de entrada:
# 1ª linha: Variáveis separadas por espaço: S A B C D
# 2ª linha: Símbolo inicial: S
# 3ª linha em diante: As produções
# S->a
# S->Aa
# A->a
# A->Aa
# A->B
# B->h
#
# Arquivo de Saida:
# O mesmo de entrada, com a gramática limpa


# -=-=-=-=-=-=- FUNÇÕES DO PROGRAMA -=-=-=-=-=-=-

def remover_producoes_vazias(producoes):
    """
    Remover as produções que geram a cadeia vazia (A->h) e ajustar as produções de modo que, 
    sempre que uma variável que pode gerar a cadeia vazia for utilizada, ela seja substituída 
    por suas alternativas possíveis, excluindo a cadeia vazia.
    """
    # Identificar as variáveis que podem gerar a cadeia vazia ('h')
    anulaveis = set()

    # Itera sobre cada variável e suas produções
    for var, prods in producoes.items():
        for prod in prods:
            # Se a produção for a cadeia vazia 'h', marca a variável como anulável
            if prod == "h":
                anulaveis.add(var)
                break  # Não precisa verificar as outras produções, já que a variável já é anulável
    
    # Propagar as variáveis anuláveis até que não haja mais mudanças
    while True:
        novos_anulaveis = anulaveis.copy()
        for var, prods in producoes.items():
            for prod in prods:
                # Se todos os símbolos da produção são anuláveis, essa variável também é anulável
                if all(c in anulaveis for c in prod):
                    novos_anulaveis.add(var)
        # Se não houver novas variáveis anuláveis, termina a propagação
        if novos_anulaveis == anulaveis:
            break
        anulaveis = novos_anulaveis

    # Criar novas produções, removendo as produções que geram apenas a cadeia vazia
    novas_producoes = {}
    for var, prods in producoes.items():
        novas_producoes[var] = set()
        for prod in prods:
            if prod == "h":  # Ignorar produções vazias (h)
                continue
            # Gerar substituições considerando as variáveis anuláveis
            novas_producoes[var].update(gerar_substituicoes(prod, anulaveis))
    
    return novas_producoes


def gerar_substituicoes(prod, anulaveis):
    """
    Gerar todas as variações possíveis de uma produção, removendo símbolos 
    anuláveis sempre que possível. Símbolos não anuláveis são mantidos em 
    todas as variações. Produções vazias são removidas no final.
    """
    # Inicializar o conjunto de substituições com a produção vazia
    substituicoes = {""}
    for simbolo in prod:
        if simbolo in anulaveis:
            # Se o símbolo for anulável, adicionar tanto ele quanto uma versão sem ele
            nova_substituicoes = set()
            for substituicao in substituicoes:
                nova_substituicoes.add(substituicao + simbolo)  # Adiciona com o símbolo
                nova_substituicoes.add(substituicao)  # Adiciona a versão sem o símbolo
            substituicoes = nova_substituicoes
        else:
            # Caso contrário, apenas adicionar o símbolo à substituição
            nova_substituicoes = set()
            for substituicao in substituicoes:
                nova_substituicoes.add(substituicao + simbolo)  # Adiciona o símbolo
            substituicoes = nova_substituicoes
    
    # Remover as substituições vazias
    nova_substituicoes = set()
    for substituicao in substituicoes:
        if substituicao:  # Adiciona apenas substituições não vazias
            nova_substituicoes.add(substituicao)
    substituicoes = nova_substituicoes
    
    return substituicoes


def remover_producoes_unitarias(producoes):
    """
    Remover produções unitárias (A->B)
    e substituir por outras produções diretamente.
    """
    novas_producoes = {}  # Inicializa o dicionário vazio
    for var in producoes:
        novas_producoes[var] = set()  # Cria um conjunto vazio para cada variável

    # Para cada variável, separa as produções unitárias e não unitárias
    for var, prods in producoes.items():
        unitarias = set()
        for p in prods:
            if len(p) == 1 and p.isupper():
                unitarias.add(p)
        nao_unitarias = prods - unitarias  # Produções que não são unitárias
        novas_producoes[var].update(nao_unitarias)

        # Substitui as produções unitárias pelas produções das variáveis unitárias
        while unitarias:
            unitaria = unitarias.pop()
            
            # Filtra as produções não unitárias
            novas_nao_unitarias = set()
            for producao in producoes[unitaria]:
                if len(producao) > 1 or not producao.isupper():
                    novas_nao_unitarias.add(producao)
            
            # Filtra as produções unitárias e atualiza 'unitarias'
            novas_unitarias = set()
            for producao in producoes[unitaria]:
                if len(producao) == 1 and producao.isupper() and producao not in novas_producoes[var]:
                    novas_unitarias.add(producao)
            
            unitarias.update(novas_unitarias)
            
            # Atualiza as produções não unitárias para a variável
            novas_producoes[var].update(novas_nao_unitarias)

    return novas_producoes


def remover_producoes_inuteis(producoes, simbolo_inicial):
    """
    Função que remove produções inúteis de uma gramática, considerando as variáveis 
    que geram terminais e as variáveis alcançáveis a partir do símbolo inicial.
    """
    # Passo 1: Identificar as variáveis que geram apenas terminais (não geram variáveis não-terminais)
    gera_terminais = set()
    for var, prods in producoes.items():
        for prod in prods:
            if all(c.islower() for c in prod):  # Verifica se todos os caracteres da produção são minúsculos
                gera_terminais.add(var)
                break  # Se encontrar uma produção que gera apenas terminais, sai do loop
    while True:
        novos_gera_terminais = gera_terminais.copy()
        for var, prods in producoes.items():
            for prod in prods:
                if all(c in gera_terminais or c.islower() for c in prod):
                    novos_gera_terminais.add(var)
        if novos_gera_terminais == gera_terminais:
            break
        gera_terminais = novos_gera_terminais

    # Passo 2: Encontrar as variáveis alcançáveis a partir do símbolo inicial
    alcancaveis = {simbolo_inicial}
    while True:
        novos_alcancaveis = alcancaveis.copy()
        for var in alcancaveis:
            for prod in producoes.get(var, []):
                novos_alcancaveis.update(c for c in prod if c.isupper())
        if novos_alcancaveis == alcancaveis:
            break
        alcancaveis = novos_alcancaveis

    # Passo 3: Combinar as variáveis geradoras de terminais com as alcançáveis para encontrar as variáveis úteis
    uteis = gera_terminais & alcancaveis

    # Passo 4: Eliminar as produções que envolvem variáveis inúteis ou produções que geram a cadeia vazia
    novas_producoes = {}
    for var, prods in producoes.items():
        if var in uteis:  # Se a variável for útil, processa suas produções
            novas_producoes[var] = set()
            for prod in prods:
                # Remover produções que geram apenas a cadeia vazia 'h'
                if prod != "h" and all(c in uteis or c.islower() for c in prod):
                    novas_producoes[var].add(prod)

    # Passo 5: Remover variáveis que não são acessíveis a partir do símbolo inicial
    novas_producoes_filtradas = {}
    for var, prods in novas_producoes.items():
        if var in alcancaveis:  # Verifica se a variável é alcançável
            novas_producoes_filtradas[var] = prods
    novas_producoes = novas_producoes_filtradas

    return novas_producoes


def limpar_gramatica(input_file, output_file):
    """
    Função que limpa uma gramática a partir de um arquivo de entrada, removendo produções vazias,
    unitárias e inúteis, e gerando um arquivo de saída com a gramática limpa.
    """
    # Leitura do arquivo de entrada com a gramática
    with open(input_file, "r") as file:
        linhas = [linha.strip() for linha in file.readlines()]

    simbolo_inicial = linhas[1]  # Símbolo inicial
    producoes = {}

    # Leitura das produções da gramática
    for linha in linhas[2:]:
        var, prod = linha.split("->")
        if var not in producoes:
            producoes[var] = set()
        producoes[var].add(prod)

    # Aplicar as limpezas: remoção de produções vazias, unitárias e inúteis (produções em loop ou que não são chamadas)
    producoes = remover_producoes_vazias(producoes)
    producoes = remover_producoes_unitarias(producoes)
    producoes = remover_producoes_inuteis(producoes, simbolo_inicial)

    # Ordenar as variáveis de forma consistente (mantenha 'S' como a primeira)
    variaveis_ordenadas = ["S"] + sorted(set(producoes.keys()) - {"S"})

    # Gerar o arquivo de saída com a gramática limpa
    with open(output_file, "w") as file:
        file.write(" ".join(variaveis_ordenadas) + "\n")
        file.write(simbolo_inicial + "\n")
        for var in variaveis_ordenadas:
            if var in producoes:
                for prod in sorted(producoes[var]):
                    file.write(f"{var}->{prod}\n")

# -=-=-=-=-=-=- INICIANDO O PROGRAMA -=-=-=-=-=-=-
# Iniciando o código com o arquivo 'input.txt' com a gramática suja
# e gerando o arquivo 'output.txt' já com a gramática limpa
limpar_gramatica("input.txt", "output.txt")
