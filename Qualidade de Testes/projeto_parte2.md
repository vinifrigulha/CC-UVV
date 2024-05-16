# 1 - Requisitos Funcionais (RF):

## RF001: Carrinho de Compras
- **Cenário de Teste 01: Campo de Quantidade**
  - CT 01: [Dígitos numéricos], [Quantidade alterada com sucesso]
  - CT 02: [Dígitos alfabéticos], [Não reconhece entrada alfabética]
  - CT 03: [Ponto flutuante], [Não reconhece ponto flutuante]
  - CT 04: [Caracteres especiais], [Não reconhece caracteres especiais]


- **Cenário de Teste 02: Valores aceitos**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]
  - CT 02: [Valor igual a zero], [O sistema retorna automaticamente para 1]
  - CT 03: [Número maior que 999.999.999], [O sistema altera automaticamente para 999.999.999 e bloqueia novos dígitos]
  - CT 04: [Números negativos], [O sistema não reconhece o símbolo '-' que indica valores negativos]
  - CT 05: [Deixar em branco], [Não acontece nada a princípio, mas ao minimizar o carrinho, ele retorna o valor antes de apagar tudo]

- **Cenário de Teste 03: Botões de '+' e '-'**
  - CT 01: [Valor atual igual a 1], [Botão '-' fica desabilitado e o botão '+' fica habilitado]
  - CT 02: [Valor atual igual a 999.999.999], [O botão '+' fica desabilitado e o botão '-' fica habilitado]
  - CT 03: [Valor entre 1 e 999.999.999, excluindo-os], [A quantidade é adicionada de 1 em 1 pelo botão '+' e subtraída de 1 em 1 pelo botão '-']
  - CT 04: [Clicar no botão desabilitado], [Nada acontece com a quantidade]
  - CT 05: [Digitar uma quantidade válida e apertar um dos botões], [É adicionada/subtraída de 1 em 1 a partir da quantidade digitada]


## RF002: Personalizar Tela de Login
- **Cenário de Teste 01: Formatos de imagem**
  - CT 01: [Formato PNG], [Formato aceito]
  - CT 02: [Formato JPG], [Formato aceito]
  - CT 03: [Formato GIF], [Formato aceito]
  - CT 04: [Formato SVG], [Formato não aceito]
  - CT 05: [Formato WEBP], [Formato não aceito]
  - CT 06: [Formatos de texto como PDF, DOCX, XLSX, PPTX, etc.], [Formatos não aceitos]
  - CT 07: [Formatos de vídeo como MP4, MOV, WMV, etc.], [Formatos não aceitos]
  - CT 08: [Formatos de áudio como MP3, WMA, WAV, etc.], [Formatos não aceitos]

- **Cenário de Teste 02: Tamanhos de imagem**
  - CT 01: [O sistema suportou todos os tamanhos, desde 1x1 até 9.000x9.000], [Tamanho aceito]
  - **OBS: Não foram encontrados exemplos os suficiente para realizar os testes, mas para tamanhos usuais o sistema se mostrou capaz de suportá-los** 


# 2 - Requisitos Não Funcionais (RNF):

## RNF001: Compatibilidade de Navegadores
- **Cenário de Teste 01: Mesmo navegador**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]


- **Cenário de Teste 02: Navegadores distintos**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]


## RNF002: Integração
- **Cenário de Teste 01: Integração via SOAP**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]

- **Cenário de Teste 02: Integração via JSON**
  - CT 01: [Números entre 1 e 999.999.999, incluindo-os], [Quantidade aceita]


# 3 - Componentes:

| Aluno                     | Professora                | Turma | Disciplina                     |
| ------------------------- | ------------------------- | ----- | ------------------------------ |
| Vinícius Frigulha Ribeiro | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software |

## 4 - Link do GitHub

[Projeto de Testes](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/readme.md)
