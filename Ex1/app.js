var app = require("express")();
var bodyParser = require("body-parser");
var controllers = require("./controllers/controllers");


app.use(bodyParser.urlencoded());

app.route('/latlng2Place/:lat&:lng')
  .get(controllers.latlng2Place);

app.route('/getDistance/:lat1&:lng1&:lat2&:lng2')
  .get(controllers.getDistance);

app.listen(process.env.PORT || 3333)
