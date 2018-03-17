# mobile_application_development

#Exercise 1

Ex1: This exercise includes 2 parts.
You can visit https://lab1-mobile1028.herokuapp.com/ to test this exercise online.
Or you can download this source code and run at localhost:3333/
Part 1: You can get address from the existing latitude and longitude by requesting a GET request at /latlng2Place/$latitude&$longitude.
Part 2: You can calculate the distance between 2 points in the Earth supposed (latitude1, longitude1) and (latitude2, longitude2) by requesting a GET request at /getDistance/$latitude1&$longitude1$&latitude2&$longitude2.

For example:
  - Requesting https://lab1-mobile1028.herokuapp.com/latlng2Place/10.810583&106.709145 in order to get address from the defined coordinates (longitude and latitude), where 10.810583 is the latitude and 106.709145 is the longitude.
  - Requesting https://lab1-mobile1028.herokuapp.com/getDistance/10.810583&106.709145&10.863731&106.779495 to get the distance between 2 positions - (10.810583, 106.709145) and (10.863731, 106.779495).
  
