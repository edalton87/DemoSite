function revealMessage(chore, done) {
  var message;
  if (done) {
    switch(chore) {
    case 'dishes':
        message = 'Thank you for doing the dishes'
        break;
    case 'room':
        message = 'Thank you for cleaning your room'
        break;
    case 'trash':
        message = 'Thank you for taking out the trash'
        break;
    default:
        message = 'That\'s great!'
    }
    document.getElementById('hiddenMessageGood').innerHTML = message;
    document.getElementById('hiddenMessageGood').style.display = 'block';
    document.getElementById('hiddenMessageBad').style.display = 'none';
  } else {
    switch(chore) {
    case 'dishes':
        message = 'Don\'t eat like a pig!'
        break;
    case 'room':
        message = 'Don\'t live like a hobo!'
        break;
    case 'trash':
        message = 'Don\'t be a bum!'
        break;
    default:
        message = 'That\'s great!'
    }
    document.getElementById('hiddenMessageBad').innerHTML = message;
    document.getElementById('hiddenMessageGood').style.display = 'none';
    document.getElementById('hiddenMessageBad').style.display = 'block';
  }
}
