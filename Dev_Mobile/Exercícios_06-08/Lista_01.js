// Questão 01
/** 
* Esta função cria um vetor 10 objetos por padrao
* ou um vetor com uma quantidade definida pelo usuário de objetos
* com os atributos nome : String e idade : Number
*
*
* @param {number} n - o número de objetos dentro do vetor
* @returns {object} - o vetor com os objetos informados
*/
function geraVetor(n = 10){
  let vetor = [];
  
  for (i = 0; i < n; i++){
    console.log(`Objeto ${i+1}:`);
    let name = prompt('Nome: ');
    let age = prompt('Idade: ');

    let atributos = {
      nome: name,
      idade: age
    }

    vetor.push(atributos)
    console.log('\n');
  };

  return vetor;
};


let start = prompt('Digite um número maior que zero ou aperte "Enter": ')
let vetor = (start > 0 ? geraVetor(start) : (start == "" ? geraVetor() : 'Vetor não criado.'))

console.log(vetor);
