const readline = require('readline')

const rdl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

const enter = {
  input: async (text) => {
    return new Promise((resolve) => {
      rdl.question(text, (answer) => {
        rdl.close()
        resolve(answer)
      })
    })
  }
}

const keyProduct = {
  coffee: 'coffee',
  milk: 'milk',
  tea: 'tea',
}

const products = {
  [keyProduct.coffee]: {
    product: 'Café',
    price: 15.00
  },
  [keyProduct.milk]: {
    product: 'Leite',
    price: 6.00
  },
  [keyProduct.tea]: {
    product: 'Chá',
    price: 3.40
  }
}

const casesPossibles = [
  { keys: ['cafe', 'coffee'], value: keyProduct.coffee },
  { keys: ['leite', 'milk'], value: keyProduct.milk },
  { keys: ['cha', 'tea'], value: keyProduct.tea }
]

function getValue(key) {
  for (let item of casesPossibles) {
    if (item.keys.includes(key)) {
      return item.value
    }
  }
  return ''
}

function formatMoney(value) {
  return new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(value)
}

const returnMessageProductSeleted = (productSelected) => {
  const { product, price } = products[productSelected]

  return `O ${product}, está com o valor de ${formatMoney(price)}`
}

const productsInStock = Object.values(products).map(({ product }) => (product)).join(', ')

const messageReturn = (message) => console.log(message)

async function shop() {
  const productSelect = await enter.input(`Em estoque: ${productsInStock} \nQual você vai querer?: `)
  const raw = String(productSelect).toLowerCase().normalize('NFD').replace(/[\u0300-\u036f]/g, '')
  const productSelected = getValue(raw)

  switch (productSelected) {
    case keyProduct.coffee:
      return messageReturn(returnMessageProductSeleted(keyProduct.coffee))
    case keyProduct.milk:
      return messageReturn(returnMessageProductSeleted(keyProduct.milk))
    case keyProduct.tea:
      return messageReturn(returnMessageProductSeleted(keyProduct.tea))
    default:
      return messageReturn(`Este produto não existe ou não está em estoque. \nOs produtos em estoque: ${productsInStock}`)
  }
}

shop()