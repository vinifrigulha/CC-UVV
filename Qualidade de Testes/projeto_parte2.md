# Requisitos Funcionais (RF):

## RF001 - Carrinho de Compras
- **Cenário de Teste 01 - Campo de Quantidade**
  - CT 01: [Dígitos numéricos], [Quantidade alterada com sucesso]
  - CT 02: [Dígitos alfabéticos], [Não reconhece entrada alfabética]
  - CT 03: [Ponto flutuante], [Não reconhece ponto flutuante]
  - CT 04: [Caracteres especiais], [Não reconhece caracteres especiais]

- **Cenário de Teste 02 - Valores aceitos**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]
  - CT 02: [Valor igual a zero], [O sistema retorna automaticamente para 1]
  - CT 03: [Número maior que 999.999.999], [O sistema altera automaticamente para 999.999.999 e bloqueia novos dígitos]
  - CT 04: [Números negativos], [O sistema não reconhece o símbolo '-' que indica valores negativos]
  - CT 05: [Deixar em branco], [Não acontece nada a princípio, mas ao minimizar o carrinho, ele retorna o valor antes de apagar tudo]

- **Cenário de Teste 03 - Botões de '+' e '-'**
  - CT 01: [Valor atual igual a 1], [Botão '-' fica desabilitado e o botão '+' fica habilitado]
  - CT 02: [Valor atual igual a 999.999.999], [O botão '+' fica desabilitado e o botão '-' fica habilitado]
  - CT 03: [Valor entre 1 e 999.999.999, excluindo-os], [A quantidade é adicionada de 1 em 1 pelo botão '+' e subtraída de 1 em 1 pelo botão '-']
  - CT 04: [Clicar no botão desabilitado], [Nada acontece com a quantidade]
  - CT 05: [Digitar uma quantidade válida e apertar um dos botões], [É adicionada/subtraída de 1 em 1 a partir da quantidade digitada]

## RF002 - Personalizar Tela de Login


# Requisitos Não Funcionais (RNF):

## RNF001 - 

## RNF002 - 
