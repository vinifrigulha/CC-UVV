/* Questão 01 */
function geraVetor() {
  // Criando um vetor vazio
  let vetor = [];

  // Criando 10 objetos
  let obj1 = { nome: "Carlos", idade: 43 };
  let obj2 = { nome: "Amanda", idade: 28 };
  let obj3 = { nome: "Rodrigo", idade: 62 };
  let obj4 = { nome: "Bianca", idade: 19 };
  let obj5 = { nome: "Fernando", idade: 35 };
  let obj6 = { nome: "Camila", idade: 62 };
  let obj7 = { nome: "Gustavo", idade: 25 };
  let obj8 = { nome: "Letícia", idade: 30 };
  let obj9 = { nome: "Paulo", idade: 48 };
  let obj10 = { nome: "Mariana", idade: 25 };

  // Inserindo os objetos no vetor
  vetor.push(obj1);
  vetor.push(obj2);
  vetor.push(obj3);
  vetor.push(obj4);
  vetor.push(obj5);
  vetor.push(obj6);
  vetor.push(obj7);
  vetor.push(obj8);
  vetor.push(obj9);
  vetor.push(obj10);

  return vetor;
};

// Gerando um vetor com 10 objetos
let meuVetor = geraVetor();
console.log('Questão 01: Vetor original:');
console.log(meuVetor);

/* Questão 02 */
let ordenaNome = (vetor) => vetor.sort((obj1, obj2) => obj1.nome < obj2.nome ? -1 : obj1.nome > obj2.nome ? 1 : 0);
console.log('\nQuestão 02: a) Vetor ordenado pelo nome:');
console.log(ordenaNome(meuVetor));

// b) Ordenando o vetor por idade
let ordenaIdade = (vetor) => vetor.sort((obj1, obj2) => obj1.idade < obj2.idade ? -1 : obj1.idade > obj2.idade ? 1 : 0);
console.log('\nQuestão 02: b) Vetor ordenado pela idade:');
console.log(ordenaIdade(meuVetor));

/* Questão 03 */
let menorMaiorIdade = (vetor) => {
  // Verificando se o vetor está vazio
  if (vetor.length == 0){
    return [];
  }
  
  // Criando variáveis que recebrão os valores da primeira idade do vetor de entrada
  let menorIdade = maiorIdade = vetor[0].idade;
  // Criando variáveis que receberão o primeiro objeto do vetor de entrada
  let objetoMenorIdade = objetoMaiorIdade = [vetor[0]];
  
  for (i = 1; i < vetor.length; i++){         // Começa a contar do '1' por já estar armazenado o valor inicial '0'
    if (menorIdade > vetor[i].idade){         // Verificando se 'menorIdade' é o menor valor
      menorIdade = vetor[i].idade;
      objetoMenorIdade = [vetor[i]];
    } else if (menorIdade == vetor[i].idade){ // Verificando se tem mais objetos com a 'menorIdade'
      objetoMenorIdade.push(vetor[i]);
    }
    
    if (maiorIdade < vetor[i].idade){         // Verificando se 'maiorIdade' é o maior valor
      maiorIdade = vetor[i].idade;
      objetoMaiorIdade = [vetor[i]];
    } else if (maiorIdade == vetor[i].idade){ // Verificando se tem mais objetos com a 'maiorIdade'
      objetoMaiorIdade.push(vetor[i]);
    }
  }

  // Inserindo as variáveis no vetor criado
  return { menorIdade : objetoMenorIdade, maiorIdade : objetoMaiorIdade };
};
let vetorMenorMaiorIdade = menorMaiorIdade(meuVetor)
console.log('\nQuestão 03: Objetos com a menor e a maior idade:');
console.log(vetorMenorMaiorIdade);

/* Questão 04 */
let firstLastName = (vetor) => {
  // Verificando se o vetor está vazio
  if (vetor.length == 0){
    return [];
  }
  
  // Criando variáveis que receberão o primeiro objeto do vetor de entrada
  let objetoFirstName = objetoLastName = vetor[0];
  
  for (i = 1; i < vetor.length; i++){ 		   // Começa a contar do '1' por já estar armazenado o valor inicial '0'
    if (objetoFirstName.nome > vetor[i].nome){ // Verificando se 'firstName' é o menor valor
      objetoFirstName = vetor[i];
    }
    
    if (objetoLastName.nome < vetor[i].nome){ // Verificando se 'lastName' é o maior valor
      objetoLastName = vetor[i];
    }
  }
  
  return {primeiroNome: objetoFirstName, ultimoNome : objetoLastName};
};
let vetorFirstLastName = firstLastName(meuVetor)
console.log('\nQuestão 04: Primeiro nome e último nome do vetor:');
console.log(vetorFirstLastName);

/* Questão 05 */
let ordemQualquer = (vetor, choice) => {
  // Verificando se o vetor está vazio
  if (vetor.length == 0){
    return [];
  }
  
  let vetorOrdenado = (choice == 0) ? ordenaNome(vetor) : ((choice == 1) ? ordenaIdade(vetor) : "Opção inválida");

  return vetorOrdenado;
};
console.log('\nQuestão 05: Escolha uma ordenação');
console.log('[0] para ordenar por NOME');
console.log('[1] para ordenar por IDADE');
let escolha = prompt('\nDigite sua escolha aqui: ');
let vetorOrdenado = ordemQualquer(meuVetor, escolha);
console.log(vetorOrdenado);
