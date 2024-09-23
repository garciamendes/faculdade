const any = () => {
  return {
    get name() {
      return 'Testando'
    }
  }
}

console.log(any().name)