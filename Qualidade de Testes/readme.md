# Plano de Teste

<img src="https://newinstprod.me.com.br/images/mercado_eletronico_2-04-crop.png" width=300/>

## 1 - Introdução

Este documento descreve os requisitos a testar, os  tipos de testes definidos para cada iteração e os recursos de hardware e software a serem empregados no sistema do Mercado Eletrônico. As seções referentes aos requisitos e recursos servem para permitir o acompanhamento da evolução dos testes.

Com esse documento, você deve:
- Identificar informações de projeto existentes e os componentes de software que devem ser testados.
- Listar os Requisitos a testar.
- Recomendar e descrever as estratégias de teste a serem empregadas.
- Identificar os recursos necessários e prover uma estimativa dos esforços de teste.
- Listar os elementos resultantes do projeto de testes.

## 2 - Requisitos a Testar

Esta seção contém os requisitos funcionais identificados como objetos dos testes ao longo do desenvolvimento do projeto.

### Requisitos funcionais:

Requisito   | Descrição
------------|--------------------
REQ 1       | Carrinho de Compras
REQ 2       | Tela de criar Requisições de Compra


## 3 - Testes

Esta seção é dedicada a apresentar os testes realizados em cada unidade do sistema do Mercado Eletrônico identificadas nos requisitos acima.

### 3.1 - Quantidade de Itens no Carrinho de Compra (REQ 1)

Durante os testes realizados, ao se tentar digitar uma quantidade superior a 999.999.999, o sistema bloqueia novos dígitos e mantém esse valor de 9 dígitos.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se há um limite de valor no carrinho de compras
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Abordagem
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
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
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Responsável
        </th>
        <th colspan="4">
            Vinícius Frigulha
        </th>
    </tr>
</table>
<br/>

### 3.2 - Tela de criar Requisições de Compra (REQ 2)

Para teste de integridade de dados e do banco de dados.
Aqui deve-se verificar se os dados não se perdem ao desligar o programa. Se o programa consegue se recuperar em caso de falha ou fechamento repentino.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se ao editar uma requisição de compra manterá a nova tela de criação
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
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
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável
        </th>
        <th colspan="4">
            Vinícius Frigulha
        </th>
    </tr>
</table>
<br/>

## 4 - Recursos

Esta seção deve descrever os recursos humanos, de ambiente de teste (hardware e software) e de ferramentas de automatização de testes necessários para execução dos testes que devem ser descritos nas subseções que seguem.

### 4.1 - Ambiente de teste - Software e Hardware

Descreva aqui o hardware e sua configuração, e o software. Por exemplo, o sistema operacional, browsers, servidor web, etc.
### 4.2 - Ferramenta de teste

Descreva aqui as ferramentas específicas de teste usadas no projeto.


## 5 - Componentes

Aluno                      |       Professora          | Turma | Disciplina
---------------------------|---------------------------|-------|-------------------------------
Vinícius Frigulha Ribeiro  | Gabriela Martins de Jesus | CC5N  | Qualidade e Testes de Software
