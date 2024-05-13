algoritmo "Nome do Programa"

procedimento mult(n1,n2: inteiro)

var
  res: inteiro

inicio
  res <- n1 * n2

  escreva("A multiplição de ", n1, " e ", n2, " é: ", res)

fimprocedimento

var
  num1, num2: inteiro

inicio
  escreva ("Digite o primeiro valor: ")
  leia(num1)

  escreva("Digite o segundo valor: ")
  leia(num2)

  escreva(mult(num1, num2))

fimalgoritmo