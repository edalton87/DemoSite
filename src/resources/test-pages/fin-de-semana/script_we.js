function estimateWeekend() {
  var message;
  var d = new Date();
  var n = d.getDay();
  if (n <= 4) {
    message = 'No es fin de semana.';
  } else if (n == 5) {
    message = 'Ya casi es fin de semana !';
  } else {
    message = 'Es fin de semana !!';
  }
  document.getElementById("message").innerHTML = message;
}
