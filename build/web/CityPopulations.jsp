<%-- 
    Document   : CityPopulations.jsp
    Created on : 13 Jul, 2018, 11:37:00 AM
    Author     : Prasanna Venkatesh
--%>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Circles</title>
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
  </head>
  <body>
    <div id="map"></div>
    <script>
      // This example creates circles on the map, representing populations in North
      // America.

      // First, create an object containing LatLng and population for each city.
      var citymap = {
        chennai: {
          center: {lat: 13.0827, lng: 80.2707},
          population: 7090000
        },
        mumbai: {
          center: {lat: 19.0760, lng: 72.8777},
          population: 18400000,
          

        },
        delhi: {
          center: {lat: 28.7041, lng: 77.1025},
          population: 19000000

        },
        kolkata: {
          center: {lat: 22.5726, lng: 88.3639},
          population: 4500000
        }
      };
    
      function initMap() {
        // Create the map.
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: {lat: 20.5937, lng: 78.9629},
          mapTypeId: 'terrain',
        });
        
        var cityCircle= new Array(5);
        var i;

        // Construct the circle for each value in citymap.
        // Note: We scale the area of the circle based on the population.
        for (var i in citymap) {
          // Add the circle for this city to the map.
           cityCircle[i] = new google.maps.Circle({
            strokeColor: '#FF0000',
            strokeOpacity: 0.8,
            strokeWeight: 2,
            clickable:true,
            fillColor: '#FF0000',
            fillOpacity: 0.35,
            map: map,
            center: citymap[i].center,
            radius: Math.sqrt(citymap[i].population) * 100
          });
          
           var infowindow =  new google.maps.InfoWindow();
        
      google.maps.event.addListener(cityCircle[i], 'click', (function(cityCircle,i){
          return function(){
                infowindow.setContent("The population of this city is " + citymap[i].population);
		infowindow.setPosition(cityCircle[i].getCenter());
		infowindow.open(map);
            };
	})(cityCircle,i));
           i++;
        }
      }
      google.maps.event.addDomListener(window, 'load', initMap);
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD-L2fk-7Hpv4Rf23TKfTzV-wBBkoP6BZM&callback=initMap">
    </script>
  </body>
</html>