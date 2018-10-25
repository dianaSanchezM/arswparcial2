
var RestControllerModule = (function () {
  
  var getInfo = function (city,callback) {
    axios.get("/weather/"+city)
            .then(function(info){
                callback.onSuccess(info.data);
                console.log(info);
            })
            .catch(function(error){
                callback.onFailed(error);
                console.log(error);
            });
  };
  
  

  return {
    getInfo: getInfo
  };
  
  

})();
