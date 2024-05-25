# 1 - Template de Reporte de Defeito
- *Data de Identificação:* 09/05/2024
- *Descrição do Defeito:* Verificar se manterá a barra superior de navegação
- *Nome do Sistema/Software:* Mercado Eletrônico
- *Ambiente:* STG (Testes)

- *Passos para Reproduzir o Defeito:*

1. Acessar o portal pelo Backoffice e substituir pelo usuário AA_ADM_TESTE;
2. Clicar em "... Mais", digitar "Personalizar Tela de Login" e clicar nessa opção;
3. Adicione no campo "Logo" a imagem [Logo UVV](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/logo_uvv.png);
4. Adicione no campo "Imagem de Fundo" a imagem [Imagem de Fundo](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/images/testes/wallpaper_uvv.png);
5. Clique em "Visualizar";
6. Repita os passos 3, 4 e 5;
7. **Resultado:** Na segunda vez ao clicar no botão "Visualizar", a barra superior desaparece, impedindo o usuário de navegar pelo portal.

- *Comportamento Esperado:*
A barra superior não deveria desaparecer.

- *Nível de Criticidade:* **GRAV-4**

- *Evidências:*

![Barra superior é mantida](images/evidencias/tela_login1.png)

![Barra superior ainda é mantida](images/evidencias/tela_login2.png)

![Barra superior desaparece](images/evidencias/tela_login3.png)


# 2 - Componentes

| Aluno                     | Professora                | Turma | Disciplina                     |
| ------------------------- | ------------------------- | ----- | ------------------------------ |
| Vinícius Frigulha Ribeiro | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software |

# 3 - Links do GitHub

Link da [parte 1](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte1.md)

Link da [parte 2](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte2.md)

Link da [parte 3](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/projeto_parte3.md)
