function revealMessage(chore, done) {
  var message
  if (done) {
    switch(chore) {
    case 'dishes':
      swal({
        text: 'Thank you for doing the dishes',
        icon: "success"
      })
        break;
    case 'room':
      swal({
        text: 'Thank you for cleaning your room',
        icon: "success"
      })
      break;
    case 'trash':
      swal({
        text: 'Thank you for taking out the trash',
        icon: "success"
      })
    break;
    default:
      swal({
        text: 'Good job!',
        icon: "success"
      })
      break;
    }
  } else {
    switch(chore) {
    case 'dishes':
      swal({
        text: 'Don\'t eat like a pig!',
        icon: 'warning'
      })
      break;
    case 'room':
      swal({
        text: 'Don\'t live like a hobo!',
        icon: 'warning'
      })
      break;
    case 'trash':
        swal({
          text: 'Don\'t be a bum!',
          icon: 'warning'
        })
        break;
    default:
      swal({
        text: 'Go do it!',
        icon: 'warning'
      })
      break;
    }
  }
}

function strikeSuggestion(activity) {
  switch(activity) {
    case 'callFriend':
      swal({
        text: 'You could call another one',
        icon: 'success'
      })
      break;
    case 'rideBike':
      swal({
        text: 'That\'s good exercice',
        icon: 'success'
      })
      break;
    case 'watchTv':
      swal({
        text: 'Watching TV is a waste of time anyway',
        icon: 'success'
      })
      break;
    default:
      swal({
        text: 'Great!',
        icon: 'success'
      })
      break;
  }
  document.getElementById(activity).style.textDecorationLine = 'line-through'
  document.getElementById(activity + 'Button').disabled = true
}

function displaySomething() {
  swal({
    text: 'Pas mal!',
    icon: 'success'
  })
}
