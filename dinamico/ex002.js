class Funcionario {
  constructor(nome, idade, cargo) {
    this._nome = nome
    this._idade = idade
    this._cargo = cargo
  }

  seApresentar() {
    console.log(`Olá, meu nome é ${this._nome}, tenho ${this._idade} anos e trabalho como ${this._cargo}`)
  }

  trabalhar() {
    console.log(`Estou trabalhando no setor de ${this._cargo}.`)
  }
}

class Gerente extends Funcionario {
  constructor(nome, idade, cargo, departamento) {
    super(nome, idade, cargo)
    this._departamento = departamento
  }

  gerenciar() {
    console.log(`Estou gerenciando o departamento de ${this._departamento}.`)
  }
}

class Desenvolvedor extends Funcionario {
  constructor(nome, idade, cargo, linguagem) {
    super(nome, idade, cargo)
    this._linguagem = linguagem
  }

  programar() {
    console.log(`Estou programando em ${this._linguagem}.`)
  }
}

const gerente = new Gerente('Joe', 24, 'gerente', 'estoque')
const dev = new Desenvolvedor('Doeh', 24, 'desenvolvedor web fullstack', 'Django')

gerente.seApresentar()
gerente.trabalhar()
gerente.gerenciar()

console.log('======')

dev.seApresentar()
dev.trabalhar()
dev.programar()