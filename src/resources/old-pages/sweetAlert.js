function displaySwal () {
  switch (document.getElementById('love').innerHTML) {
    case 'C\'est tout ?':
      swal("Non, ce n\'est pas tout ...");
      document.getElementById('love').innerHTML = 'Tu me manques ...';
      break;
    case 'Tu me manques ...':
      swal("J\'ai hâte de te revoir !!!");
      document.getElementById('love').innerHTML = 'Une dernière ...';
      break;
    case 'Une dernière ...':
      swal("Je te vois bientôt !");
      document.getElementById('love').innerHTML = 'Tu sais quoi ?';
      break;
    default:
      swal("Je t'aime !");
      document.getElementById('love').innerHTML = 'C\'est tout ?';
  }
}
