const request = require('request');

// request({
//   url: 'https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8605,151.1957&radius=500&types=food&name=cruise&key=AIzaSyD_jfH2rEUekKwSG1Lgs6VMP9Q1uJAV6Gw',
//   json: true
// }, (error, response, body) =>{
//   console.log(`A: ${body.results[0].vicinity}`);
// })
// function ll2PlaceGooglemaps(lat,lng){
//
// }
function toRadians(Value) {
    /** Converts numeric degrees to radians */
    return Value * Math.PI / 180;
}

var APIs = {
  latlng2Place: function(req,res){
    var lat = req.params.lat;
    var lng = req.params.lng;
    request({
      //url: 'https://maps.googleapis.com/maps/api/place/nearbysearch/json?location='+lat+','+lng+'&radius=50&key=AIzaSyD_jfH2rEUekKwSG1Lgs6VMP9Q1uJAV6Gw',
      url: 'https://maps.googleapis.com/maps/api/geocode/json?latlng='+lat+','+lng+'&key=AIzaSyCnbtMF-9wn55s1cXNJcYQjhenDRDK7o9Y',
      json: true
    }, (error, response, body) =>{
      console.log(`A: ${body.results}`);
      // re = "";
      // for (i in body.results){
      //   re += body.results[i].name;
      //   re += body.results[i].vicinity;
      // }
      // res.json(body.results[5])
      res.json(body.results[0].formatted_address)
    })
  },

  getDistance: function(req,res){
    var lat1 = req.params.lat1;
    var lng1 = req.params.lng1;
    var lat2 = req.params.lat2;
    var lng2 = req.params.lng2;

    var R = 6371e3; //metres
    var phi1 = toRadians(lat1);
    var phi2 = toRadians(lat2);
    var deltaPhi = toRadians(lat2 - lat1);
    var deltaLambda = toRadians(lng2 - lng1);

    var a = Math.sin(deltaPhi/2) * Math.sin(deltaPhi/2) +
            Math.cos(phi1)*Math.cos(phi2)*Math.sin(deltaLambda/2)*Math.sin(deltaLambda/2);
    var c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

    var d = R*c;

    res.json(`Distance: ${d}`)
  }
}




module.exports = APIs;
