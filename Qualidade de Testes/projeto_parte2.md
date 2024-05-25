# 1 - Requisitos Funcionais (RF):

## RF001: Carrinho de Compras
- **Cenário de Teste 01: Validação do Tipo de Entrada do Campo de Quantidade**
  - CT 01: [Inserir "1" no campo quantidade], [Valor aceito]
  - CT 02: [Digitar "a"], [Erro: Não reconhece entrada alfabética]
  - CT 03: [Digitar "1.5"], [Erro: Não reconhece ponto flutuante]
  - CT 04: [Digitar "#"], [Erro: Não reconhece caracteres especiais]


- **Cenário de Teste 02: Validação dos Valores Aceitos do Campo de Quantidade**
  - CT 01: [Digitar "1"], [Valor aceito]
  - CT 02: [Digitar "0"], [Erro: O sistema retorna automaticamente para 1]
  - CT 03: [Digitar "1111111111" (10 números '1')], [Erro: O sistema altera automaticamente para 999.999.999 e bloqueia novos dígitos]
  - CT 04: [Digitar "-1"], [Erro: O sistema não reconhece o símbolo '-']
  - CT 05: [Apagar a quantidade e deixar o campo de quantidade em branco], [Erro: Não acontece nada a princípio, mas ao minimizar o carrinho, ele retorna ao valor que estava antes de apagar tudo]


## RF002: Personalizar Tela de Login
- **Cenário de Teste 01: Validação do Formatos de Imagem para Upload**
  - CT 01: [Enviar a imagem do formato [PNG](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/imagens/imagem_png.png) nos campos "Imagem de Fundo" e "Logo"], [Formato aceito]
  - CT 02: [Enviar a imagem do formato [JPG](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/imagens/imagem_jpg.jpg) nos campos "Imagem de Fundo" e "Logo"], [Formato aceito]
  - CT 03: [Enviar a imagem do formato [GIF](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/imagens/imagem_gif.gif) nos campos "Imagem de Fundo" e "Logo"], [Formato aceito]
  - CT 04: [Enviar a imagem do formato [SVG](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/imagens/imagem_svg.svg) nos campos "Imagem de Fundo" e "Logo"], [Erro: Formato não aceito]
  - CT 05: [Enviar a imagem do formato [WEBP](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/imagens/imagem_webp.webp) nos campos "Imagem de Fundo" e "Logo"], [Erro: Formato não aceito]
  - CT 06: [Enviar os arquivos a seguir: [PDF](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/arquivos/arquivo_pdf.pdf), [DOCX](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/arquivos/arquivo_docx.docx), [XLSX](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/arquivos/arquivo_xlsx.xlsx) e [PPTX](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/arquivos/arquivo_pptx.pptx) nos campos "Imagem de Fundo" e "Logo"], [Erro: Formatos não aceitos]
  - CT 07: [Enviar os vídeos a seguir: [MP4](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/videos/video_mp4.mp4), [MOV](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/videos/video_mov.mov) e [WMV](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/videos/video_wmv.wmv) nos campos "Imagem de Fundo" e "Logo"], [Erro: Formatos não aceitos]
  - CT 08: [Enviar formatos de áudio como [MP3](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/audios/audio_mp3.mp3), [WMA](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/audios/audio_wma.wma) e [WAV](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/audios/audio_wav.wav) nos campos "Imagem de Fundo" e "Logo"], [Erro: Formatos não aceitos]

- **Cenário de Teste 02: Dimensão da imagem**
  - CT 01: [Enviar imagens com dimensões entre 1x1 e 9.000x9.000], [Dimensões aceitas]
  - **OBS<sub>1</sub>:** Não foram encontrados exemplos o suficiente para realizar os testes, mas para dimensões usuais o sistema se mostrou capaz de suportá-las.
  - **OBS<sub>2</sub>:** Algumas dimensões, por não serem no padrão da tela do navegador, acabaram desformatando as imagens.

- **Cenário de Teste 03: Tamanho da imagem**
  - CT 01: [Enviar imagens de 8,53MB], [Dimensão aceita]
  - **OBS:** Não foram encontrados exemplos o suficiente para realizar os testes, mas para tamanhos usuais o sistema se mostrou capaz de suportá-los.


# 2 - Requisitos Não Funcionais (RNF):

## RNF001: Compatibilidade de Navegadores
- **Cenário de Teste 01: Acessar o portal**
  - CT 01: [Acessar o portal via Google Chrome], [Acesso feito com sucesso]
  - CT 02: [Acessar o portal via Microsoft Edge], [Acesso feito com sucesso]
  - CT 03: [Acessar o portal via Mozilla Firefox], [Acesso feito com sucesso]
  - CT 04: [Acessar o portal via Safari], [Acesso feito com sucesso]
  - CT 05: [Acessar o portal via Opera GX], [Acesso feito com sucesso]
  - **OBS:** Não foi realizado em todos os navegadores existentes, mas os citados acima são os mais comuns e funcionaram.

- **Cenário de Teste 02: Uso de diferentes guias**
  - CT 01: [Abrir uma tela interna em uma nova guia], [Mantém o login atual]
  - CT 02: [Duplicar a guia], [Mantém a mesma tela e progresso de um determinado processo na guia que foi duplicada]
  - CT 03: [Abrir uma tela interna em uma guia anônima], [A opção fica desabilitada]
  - CT 04: [Fazer login em outro cliente em uma nova guia], [A sessão anterior é desconectada, mantêm-se a nova]
  - CT 05: [Abrir o mesmo cliente ou outro cliente em uma guia anônima], [Não interrompe nem atrapalha a navegação que não é anônima]

- **Cenário de Teste 03: Navegadores distintos**
  - CT 01: [Fazer o mesmo login em navegadores distintos], [Mantém a mesma conta logada nos diferentes navegadores]
  - CT 02: [Abrir outro cliente em um navegador diferente], [A sessão anterior no primeiro navegador não é atrapalhada]
  - CT 03: [Abrir o mesmo cliente ou outro cliente em uma guia anônima], [Não interrompe nem atrapalha a navegação no primeiro navagador]


## RNF002: Integração
- **Cenário de Teste 01: Integração via SOAP/API Rest (SoapUI/Postman) - externo à plataforma**
  - CT 01: [Enviar usuário e senha de integração corretos], [Código 200 (OK)]
  - CT 02: [Enviar usuário correto e senha em branco], [Erro: Código 401 (Unauthorized)]
  - CT 03: [Enviar usuário em branco e senha correta], [Erro: Código 401 (Unauthorized)]
  - CT 04: [Não preencher as credenciais], [Erro: Código 401 (Unauthorized)]
  - CT 05: [Não enviar a tag de integração], [Nos programas aparece código 200 (OK), porém a integração não é feita na plataforma]
    - **Resposta da plataforma:** "Não existe ID relacionado à TAG:"
  - CT 06: [Enviar um valor não válido na tag de integração], [Nos programas aparece código 200 (OK), porém a integração não é feita na plataforma]
    - **Resposta da plataforma:** "Não existe ID relacionado à TAG: TESTE"
  - CT 07: [Não enviar uma tag obrigatória (Ex.: REQUISICAOCLIENTE)], [Nos programas aparece código 200 (OK), porém a integração não é feita na plataforma]
    - **Resposta da plataforma:** "Erro na entrada de requisição 0: Numero da requisicao cliente não informado."
  - CT 08: [Enviar uma tag incorreta], [Erro: Código 400 (Bad Request)]
  - CT 09: [Enviar uma tag que não existe], [A integração é feita com sucesso (Código 200), logo a plataforma apenas ignorou a tag inexistente]

- **Cenário de Teste 02: Integração via Planilhas do Excel (Cargas) - interno à plataforma**
  - CT 01: [Enviar todas as colunas e abas com os devidos nomes e valores válidos e aceitos], [Status Processado]
    - **OBS:** A plataforma utiliza a terminologia *"Processado"* para indicar sucesso no envio da carga.
  - CT 02: [Enviar com dados inválidos], [Erro: Status Erro]
  - CT 03: [Enviar sem abas obrigatórias], [Erro: Status Erro]
  - CT 04: [Enviar sem colunas obrigatórias], [Erro: Status Erro]
  - CT 05: [Enviar tipo de dado incorretos em determinadas colunas], [Erro: Status Erro]
  - CT 06: [Enviar coluna inexistente], [Erro: Status Erro]


# 3 - Componentes:

| Aluno                     | Professora                | Turma | Disciplina                     |
| ------------------------- | ------------------------- | ----- | ------------------------------ |
| Vinícius Frigulha Ribeiro | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software |

# 4 - Links do GitHub

Link da [parte 1](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte1.md)

Link da [parte 2](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte2.md)

Link da [parte 3](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte3.md)
