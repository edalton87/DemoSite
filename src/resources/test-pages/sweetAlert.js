function displaySwal () {
  switch (document.getElementById('love').innerHTML) {
    case 'C\'est tout ?':
      swal('Non, ce n\'est pas tout ...');
      document.getElementById('love').innerHTML = 'Tu me manques ...';
      break;
    case 'Tu me manques ...':
      swal('J\'ai hâte de te revoir !!!');
      document.getElementById('love').innerHTML = 'T\'es jalouse ?';
      break;
    case 'T\'es jalouse ?':
      swal('Eh ben, tu as maintenant 2 boutons !');
      document.getElementById('love').innerHTML = 'Cliques moi !';
      document.getElementById('love2').innerHTML = 'Non, pas lui. Moi !';
      document.getElementById('love2').style.display = 'inline-block';
      break;
    case 'Cliques moi !':
      swal('En tout cas ils font tous les 2 la même chose\n^^\'');
      document.getElementById('love').innerHTML = 'Une dernière ...';
      document.getElementById('love2').style.display = 'none';
      break;
    case 'Une dernière ...':
      swal("Je te vois bientôt !");
      document.getElementById('love').innerHTML = 'On recommence ?';
      break;
    default:
      swal("Je t'aime !");
      document.getElementById('love').innerHTML = 'C\'est tout ?';
  }
}

function displayMessage () {
  switch (document.getElementById('button').innerHTML) {
    case 'PA + PI = ?':
      swal('"PAI", obviamente');
      document.getElementById('title').innerHTML = 'Este es para el Goody';
      document.getElementById('button').innerHTML = 'Vamos a comer "arroz con ..."';
      break;
    case 'Vamos a comer "arroz con ..."':
      swal('"Arroz con pollo"');
      document.getElementById('title').innerHTML = 'Este es para el Goody';
      document.getElementById('button').innerHTML = 'Adónde ?';
      break;
    case 'Adónde ?':
      swal("En Salcoatitán");
      document.getElementById('title').innerHTML = 'Ahora el Tin';
      document.getElementById('button').innerHTML = '5 x 8 ?';
      break;
    case '5 x 8 ?':
      swal('40');
      document.getElementById('title').innerHTML = 'Ahora el Tin';
      document.getElementById('button').innerHTML = '8 x 5 ?';
      break;
    case '8 x 5 ?':
      swal('Ta-cuaren\n(chistes Mami)');
      document.getElementById('title').innerHTML = 'Y para recordar a Tachi';
      document.getElementById('button').innerHTML = 'Qué es un pedómetro ?';
      break;
    case 'Qué es un pedómetro ?':
      swal('No, no es un medidor de gases');
      document.getElementById('title').innerHTML = 'Les mandó saludos';
      document.getElementById('button').innerHTML = 'Quién ?';
    break;
    case 'Quién ?':
      swal('Ñengo, quién más ?');
      document.getElementById('title').innerHTML = 'Fin';
      document.getElementById('button').innerHTML = 'Volver a empezar';
      break;
    default:
      swal('Comenzamos pues');
      document.getElementById('title').innerHTML = 'Se acuerdan ?';
      document.getElementById('button').innerHTML = 'PA + PI = ?';
  }
}
