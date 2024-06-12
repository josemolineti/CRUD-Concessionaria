const precoInput = document.getElementById('preco');

  // Adiciona um ouvinte de eventos de digitação ao input
  precoInput.addEventListener('input', function(event) {
    // Remove qualquer caractere que não seja número ou vírgula
    let valorAtual = event.target.value.replace(/[^0-9,]/g, '');

    // Se o valor não for uma string vazia
    if (valorAtual) {
      // Se o último caractere for uma vírgula
      if (valorAtual.slice(-1) === ',') {
        // Remova todas as vírgulas exceto a última
        valorAtual = valorAtual.replace(/,/g, '').slice(0, -1) + ',';
      } else {
        // Remova todas as vírgulas
        valorAtual = valorAtual.replace(/,/g, '');
      }

      // Transforma a string em um número e formata com duas casas decimais
      const numeroFormatado = Number(valorAtual).toFixed(2);

      // Formata o valor com vírgula como separador decimal e duas casas decimais
      const valorFormatado = numeroFormatado.toLocaleString('pt-BR', { minimumFractionDigits: 2 });

      // Atualiza o valor do input com a máscara
      precoInput.value = valorFormatado;
    }
  });