const containerRoot = document.querySelector('div.container-root')
const mainPage = document.querySelector('main')

function initialLoadScript() {

  const animationLoadProject = document.createElement('div')
  animationLoadProject.classList.add('animation-load-project')
  animationLoadProject.innerHTML = `<dotlottie-player src="https://lottie.host/b24b85ff-c27e-44f4-8ae3-eb69e623b407/ky4XVwpFdI.json"
    background="transparent" speed="1" style="width: 500px; height: 500px;" loop='false' autoplay></dotlottie-player>`

  containerRoot.appendChild(animationLoadProject)
  setTimeout(() => {
    containerRoot.removeChild(animationLoadProject)
    setTimeout(() => {
      load()
    }, 200)
  }, 8100)
}

function load() {
  const loading = document.createElement('div')
  loading.classList.add('content-load')
  loading.innerHTML = '<div class="lds-ring"><div></div><div></div><div></div><div></div></div>'

  containerRoot.appendChild(loading)

  setTimeout(() => {
    containerRoot.removeChild(loading)
    mainPage.classList.remove('hidden-page')
  }, 1500)
}

const Selectinstallments = document.querySelector('select#installments')
function installmentsOptions() {
  const valueTravel = 10000

  for (let i = 1; i <= 12; i++) {
    const newOption = document.createElement('option')

    newOption.value = '833'
    newOption.text = `${i} - R$ 833`

    if (i > 4) {
      newOption.value = 833
      let percent = (833 * 2) / 100
      newOption.text = `${i} - R$ ${833 + percent} + 2%`
    }

    Selectinstallments.appendChild(newOption)
  }
}
installmentsOptions()