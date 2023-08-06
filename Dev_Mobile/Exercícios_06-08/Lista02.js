/* Questão 01 */
let paresAndImpares = (quantidade) => {
  let pares = [];
  let impares = [];

  while (pares.length < quantidade || impares.length < quantidade){
    const numero = Math.floor(Math.random() * 100);
    if (numero % 2 == 0 && pares.length < quantidade && !pares.includes(numero)){
      pares.push(numero);
    } else if (numero % 2 != 0 && impares.length < quantidade && !impares.includes(numero)){
      impares.push(numero);
    }
  }

  return [pares, impares]
}

let [pares, impares] = paresAndImpares(10);
console.log('Questão 01:');
console.log('Pares:', pares, '\nImpares:', impares);

/* Questão 02 */
let [p1, p2, p3, ...restoPar] = pares;
console.log(`\nQuestão 02: \nPar 1: ${p1} \nPar 2: ${p2} \nPar 3: ${p3} \nResto: ${restoPar}`);

/* Questão 03 */
let [i1, i2, ...restoImpar] = impares;
console.log(`\nQuestão 03: \nImpar 1: ${i1} \nImpar 2: ${i2} \nResto: ${restoImpar}`);

/* Questão 04 */
let novoVetor = [...pares, ...impares];
console.log('\nQuestão 04: \nNovo Vetor:', novoVetor);

/* Questão 05 */
let nome1 = "Vinicius";
let nome2 = "Mariana";
let nome3 = "Waldemar";
let nome4 = "Glaucia";

let temp = nome1;
nome1 = nome2;
nome2 = nome3;
nome3 = nome4;
nome4 = temp;

console.log(`\nQuestão 05: \nNome1: ${nome1} \nNome2: ${nome2} \nNome3: ${nome3} \nNome4: ${nome4}`);

/* Questão 06 */
const pessoa = {
  nome: "Vinicius",
  idade: 23,
  endereco: {
    rua: "Rua Exemplo de Moraes",
    numero: 1234,
    bairro: "Coqueiral de Itaparica",
    cidade: "Vila Velha",
    uf: "ES"
  },
  telefone: "(27) 91234-5678",
  email: "email@email.com"
}

const informacoes = (objeto) => {
  console.log(`Nome: ${objeto.nome}`);
  console.log(`Idade: ${objeto.idade} anos`);
  console.log(`Telefone: ${objeto.telefone}`);
  console.log(`E-Mail: ${objeto.email}`);
  console.log("Endereco Completo:");
  console.log(`  ${objeto.endereco.rua}, ${objeto.endereco.numero}`);
  console.log(`  ${objeto.endereco.bairro}, ${objeto.endereco.cidade} - ${objeto.endereco.uf}`);
};

console.log("\nQuestão 06:")
informacoes(pessoa);
