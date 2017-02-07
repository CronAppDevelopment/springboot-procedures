

app.userEvents.mostrarQuantidadeAdultos = function(event) {
    $.ajax({
      dataType: "json",
      method: "POST",
      url: "api/rest/events/PessoaEventREST/mostrarquantidadeadultos",
      headers: {
        'Content-Type' : 'application/json'
      },
      success: function(data) {
        
        this.$apply(function() {
          
          alert(JSON.stringify(data));
          
        }.bind(this));
        
      }.bind(this)
    });
}