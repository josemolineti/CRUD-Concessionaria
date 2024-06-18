function createCarBox(carro) {
    const carBoxes = document.getElementById('car-boxes');
    const divCarBox = document.createElement('div');
    divCarBox.classList.add("car-box");

    // BOX DA IMAGEM
    const imgDiv = document.createElement('div');
    const img = document.createElement('img');
    img.src = 'images/car-models/' + carro['cor'].toLowerCase() + '-car-example.png';
    img.alt = 'Imagem do Carro';
    imgDiv.appendChild(img);
    divCarBox.appendChild(imgDiv);

    // BOX DA DIREITA
    const infoBox = document.createElement('div');
    infoBox.id = 'info-box';
    divCarBox.appendChild(infoBox);

    // ITENS SUPERIOR BOX DIREITA
    const divSup = document.createElement('div');
    divSup.id = 'sup-model';
    infoBox.appendChild(divSup);
    var divText = document.createElement('div');
    divText.id = 'sup-model-text';
    var carBrand = document.createElement('h2');
    carBrand.textContent = carro['marca'].toUpperCase();
    var carModel = document.createElement('span');
    carModel.textContent = carro['modelo'].toUpperCase();
    carModel.classList.add('span-principal');
    divText.appendChild(carBrand);
    divText.appendChild(carModel);
    divSup.appendChild(divText);
    //logo
    var divImg = document.createElement('div');
    divImg.id = 'sup-model-img';
    var brandImg = document.createElement('img');
    brandImg.id = 'marca-pequena';
    brandImg.src = 'images/car-brands/test/' + carro['marca'].toLowerCase().replace(" ", "-") + '.png';
    divImg.appendChild(brandImg);
    divSup.appendChild(divImg);

    // ITENS MEIO BOX DIREITA
    const midBox = document.createElement('div');
    midBox.id = 'mid-box';
    infoBox.appendChild(midBox);
    // mid-box left
    const midBoxLeft = document.createElement('div');
    midBoxLeft.id = 'left';
    var spanColor = document.createElement('span');
    spanColor.textContent = carro['cor'];
    spanColor.classList.add('span-secundaria');
    var spanKM = document.createElement('span');
    spanKM.textContent = carro['quilometragem'].toLocaleString();
    spanKM.classList.add('span-secundaria');
    midBoxLeft.appendChild(spanColor);
    midBoxLeft.appendChild(spanKM);
    midBox.appendChild(midBoxLeft);
    // mid-box right
    const midBoxRight = document.createElement('div');
    midBoxRight.id = 'right';
    var carYear = document.createElement('h2');
    carYear.textContent = carro['ano_modelo'].substring(0, 4);
    midBoxRight.appendChild(carYear);
    midBox.appendChild(midBoxRight);

    // PRICE BUTTON 
    const priceButton = document.createElement('div');
    priceButton.id = 'price-button';
    const precoLabel = document.createElement('div');
    precoLabel.id = 'preco-label';
    var precoSpan = document.createElement('span');
    precoSpan.textContent = "R$ " + carro['preco'].toLocaleString();
    var buttonMais = document.createElement('button');
    buttonMais.id = 'button-mais';
    buttonMais.textContent = "Saiba Mais";
    buttonMais.value = carro['id'];
    buttonMais.onclick = function () {
        window.location.href = './car-informations?carId=' + buttonMais.value;
        saibaMaisCarro(carro['id']);
    };

    precoLabel.appendChild(precoSpan);
    precoLabel.appendChild(buttonMais);
    priceButton.appendChild(precoLabel);
    infoBox.appendChild(priceButton);

    carBoxes.appendChild(divCarBox);
}
function saibaMaisCarro(id) {
    /////// CONTINUAR DAQUI, ENVIAR O ID PARA information-script.js E PRINTAR TODOS OS DETALHES DO CARRO
    createDetalhes(id);
}

function listCarros() {
    fetch('/list/catalogo/carro')
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao obter carros');
            }
            return response.json();
        })
        .then(carros => {
            carros.forEach(carro => {
                createCarBox(carro);
            });

        })
        .catch(error => {
            console.error('Erro:', error);
        });
}

document.addEventListener("DOMContentLoaded", () => {
    listCarros();
});





