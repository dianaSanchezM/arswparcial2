
var ConsultControllerModule = (function () {
    var showInfo = function(){
         
        
        
        var callback = {
            
            onSuccess: function(response){
                alert("entra");
                var output = document.getElementById('output');
                for (x in response){
                    var node = document.createTextNode(x);
                    output.appendChild(node);
                    var show= document.getElementById("div1");
                    console.log(show);
                    //show.appendChild(output);
                    alert(show);
                }
            },
            onFailed: function(exception){
                console.log(exception);
                alert("There is a problem with our servers. We apologize for the inconvince, please try again later");  
            }
         };
        RestControllerModule.getInfo("london",callback);

    };
   
  

  return {
    showInfo: showInfo
  };
})();



