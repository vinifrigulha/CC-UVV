// Questão 01
function geraVetor() {
  /* Criando um vetor vazio */
  let vetor = [];

  /* Criando 10 objetos */
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

  /* Inserindo os objetos no vetor */
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
console.log('Vetor original:');
console.log(meuVetor);

// Questão 02
// a) Ordenando o vetor pelo nome
let ordVetorNome = (meuVetor) => {
  return meuVetor.sort((a, b) => {
    return a.nome < b.nome ? -1 : a.nome > b.nome ? 1 : 0
  })
};
console.log('\nVetor ordenado pelo nome:');
console.log(ordVetorNome(meuVetor));

// b) Ordenando o vetor por idade
let ordVetorIdade = (meuVetor) => {
  return meuVetor.sort((a, b) => {
    return a.idade < b.idade ? -1 : a.idade > b.idade ? 1 : 0
  })
};
console.log('\nVetor ordenado pela idade:');
console.log(ordVetorIdade(meuVetor));
