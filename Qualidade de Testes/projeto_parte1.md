# Plano de Teste

<img src="images/logo_me.png" width=300>


## 1 - Introdução

Este documento descreve os requisitos a testar, os tipos de testes definidos para cada iteração e os recursos de hardware e software a serem empregados no sistema do Mercado Eletrônico.

Com esse documento, você conseguirá:

- Identificar informações de projeto existentes e os componentes de software que foram testados.
- Visualizar a listagem dos Requisitos testados.
- Listar os elementos resultantes do projeto de testes.


## 2 - Sobre o Mercado Eletrônico

O Mercado Eletrônico é uma empresa brasileira líder em soluções de comércio eletrônico B2B (business-to-business). Fundada em 1994, a empresa se destaca por oferecer uma plataforma robusta e abrangente para facilitar transações comerciais entre empresas.

A missão do Mercado Eletrônico é simplificar e otimizar as compras corporativas por meio de tecnologia avançada. Eles oferecem uma variedade de serviços e soluções para ajudar empresas de todos os portes a melhorar seus processos de compras, desde a busca por fornecedores até a gestão de contratos e pagamentos.

O Mercado Eletrônico tem sido reconhecido por sua inovação e compromisso em impulsionar a transformação digital no mercado B2B. Sua ampla experiência e presença no mercado brasileiro o tornam um parceiro confiável para empresas que buscam modernizar e aprimorar suas operações de compras e relacionamento com fornecedores.


## 3 - Requisitos de Teste

Esta seção contém os requisitos identificados como objetos dos testes ao longo do desenvolvimento do projeto.

| Requisito | Descrição                  |
| --------- | -------------------------- |
| REQ-1     | Carrinho de Compras        |
| REQ-2     | Personalizar Tela de Login |


## 4 - Testes

Esta seção é dedicada a apresentar os critérios de testes realizados em cada unidade do sistema do Mercado Eletrônico identificadas nos requisitos acima.

### 4.1 - Quantidade de Itens no Carrinho de Compra (REQ 1)

Durante os testes realizados, ao se tentar digitar uma quantidade com número de dígitos superior a 9, o sistema automaticamente converte a quantidade para 999.999.999 e bloqueia o acréscimo de novos dígitos, mantendo esse valor. Entretanto, ao navegar para a próxima tela, onde também é possível alterar a quantidade, foi observado o rompimento do limite do carrinho de compras.

<br/>
<table>
    <tr>
        <th>
            Objetivo:
        </th>
        <th colspan="4">
            Verificar se há um limite de valor no carrinho de compras
        </th>
    </tr>
    <tr>
        <th>
            Método de Execução:
        </th>
        <th colspan="2">
            Manual (x) 
        </th>
        <th colspan="2">
            Automática ( ) 
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            Teste Estrutural ( )
        </th>
        <th colspan="2">
            Teste Funcional (x)
        </th>
    </tr>
    <tr>
        <th>
            Nível de Teste:
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável:
        </th>
        <th colspan="4">
            Vinícius Frigulha
        </th>
    </tr>
</table>

#### **Observação geral:**

_Ambiente de Teste:_ Os testes foram realizados em um ambiente de teste dedicado que replica as condições do ambiente de produção.

### 4.2 - Personalizar Tela de Login (REQ-2)

Durante os testes realizados, ao se clicar duas vezes no botão "Visualizar" na tela personalizar a tela de login, a barra superior de navegação desaparece, sendo necessário utilizar o botão de retorno do próprio navegador para retornar à tela anterior ou sair dessa tela de personalização.

<br/>
<table>
    <tr>
        <th>
            Objetivo:
        </th>
        <th colspan="4">
            Verificar se manterá a barra superior de navegação
        </th>
    </tr>
    <tr>
        <th>
            Método de Execução:
        </th>
        <th colspan="2">
            Manual (x) 
        </th>
        <th colspan="2">
            Automática ( )
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            Teste Estrutural ( )
        </th>
        <th colspan="2">
            Teste Funcional (x)
        </th>
    </tr>
    <tr>
        <th>
            Nível de Teste:
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável:
        </th>
        <th colspan="4">
            Vinícius Frigulha
        </th>
    </tr>
</table>

#### **Observação geral:**

_Ambiente de Teste:_ Os testes foram realizados em um ambiente de teste dedicado que replica as condições do ambiente de produção.


## 5 - Recursos

Esta seção descreve os recursos de ambiente de teste (hardware e software) necessários para execução dos testes que serão descritos nas subseções que seguem.

### 5.1 - Hardware

<table>
    <tr>
        <th>
        Modelo do Notebook:
        </th>
        <th>
        Dell Inspiron 15 5510
        </th>
    </tr>
    <tr>
        <th>
        Processador:
        </th>
        <th>
        Intel Core i5 11ª Geração 
        </th>
    </tr>
    <tr>
        <th>
        Memória RAM:
        </th>
        <th>
        16 GB 
        </th>
    </tr>
</table>

### 5.2 - Software

<table>
    <tr>
        <th colspan="3">
        Sistema Operacional:
        </th>
        <th colspan=3>
        Windows 11 Pro 64-bit
        </th>
    </tr>
    <tr>
        <th colspan=3>
        Navegador(es):
        </th>
        <th>
        Google Chrome (x)
        </th>
        <th>
        Microsoft Edge (x)
        </th>
        <th>
        Mozilla Firefox (x)
        </th>
    </tr>
</table>


## 6 - Níveis de Criticidades de Defeito

| Nível de Criticidade de Defeito | Descrição | Tempo de Resolução | Atualização de Status | Compensação do Cliente |
| :-----------------------------: | :-------- | :----------------: | :-------------------- | :--------------------- |
| GRAV-1 | Defeito que causa parada total do sistema ou impede o uso da funcionalidade principal. | 2-4 horas | A cada 30 minutos | 30% de desconto na próxima fatura ou extensão de serviço gratuito equivalente a 1 semana de uso. | 
| GRAV-2 | Defeito que causa perda significativa de funcionalidade, mas permite que o sistema continue operando com limitações importantes. | 1 dia útil | A cada 2 horas | 20% de desconto na próxima fatura |
| GRAV-3 | Defeito que causa inconveniência ou redução de desempenho, mas possui uma solução alternativa temporária. | 3-5 dias úteis | Diariamente | 10% de desconto na próxima fatura |
| GRAV-4 | Um incidente leve que afeta a usabilidade do produto, mas não o interrompe. | 1 mês | Semanalmente | 5% de desconto na próxima fatura |
| GRAV-5 | Bugs ou problemas de suporte que não afetam a usabilidade do produto. | 2-3 meses | Mensalmente | Sem compensação |


## 7 - Componentes

| Aluno                     | Professora                | Turma | Disciplina                     |
| ------------------------- | ------------------------- | ----- | ------------------------------ |
| Vinícius Frigulha Ribeiro | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software |

## 8 - Links do GitHub

[Plano de Testes](https://github.com/vinifrigulha/UVV/blob/main/Qualidade%20de%20Testes/readme.md)
