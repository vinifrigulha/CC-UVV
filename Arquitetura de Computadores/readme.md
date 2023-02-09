# Aula 01 - 06/02/23
# Introdução

## Lei de Moore
- A cada dois anos, o número de transistores dobrava.

#

## Código Fonte ao Executável:
### **Texto:**
1. **Hello.c**
    - Código Fonte

2. *Pré-processador*

3. **Hello.i**
    - Pré-processado

4. *Compilador*

5. **Hello.s**
    - Assembly (linguagem de programação)

6. *Assembler*

### **Binário:**
7. **Hello.o**
    - Objeto (binário) NÃO executável

8. *Linker*

9. **Hello.exe**
    - Binário executável

10. *Loader*

11. *Executa*

#

## Memórias (Hierarquia):
1. Registradores
    - A mais rápida
    - Ficam no processador
    - São extremamente pequenas
    - 32 bits

2. Cache:
    - A segunda mais rápida
    - Existem 3: L1, L2 e L3
    - L1 e L2 ficam no processador, já a L3 fica na placa-mãe.

3. Continua em outras aulas...

#

## Livros:
1. Computer Organization and Design, RISC-V Edition (2ª ed. 2021)

2. Digital Design and Computer Architecture (2ª ed.)

#

## As 7 Grandes Idéias
1. **Abstrações** - fugir do pensamento real, e buscar simplificar o complicado.
2. **Caso comum** - não focar nos casos raros, mas nos comuns.
3. **Paralelismo** - executar mais de uma função ao mesmo tempo.
4. **Pipelining** - mais operações simultâneas aceleram o processo do que um executar todo o trabalho sozinho.
5. **Predição** - prever os próximos lançamentos
6. **Hierarquia** - ter o mais rápido e menor, e o mais lento e maior.
7. **Redundância** - garantir que determinada operação seja executada por mais de um componente, embora apenas um já fosse suficiente.
