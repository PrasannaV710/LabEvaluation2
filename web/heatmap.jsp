<%-- 
    Document   : heatmap.jsp
    Created on : 13 Jul, 2018, 10:43:46 AM
    Author     : Prasanna Venkatesh
--%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Heatmaps</title>
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
      #floating-panel {
        position: absolute;
        top: 10px;
        left: 25%;
        z-index: 5;
        background-color: #fff;
        padding: 5px;
        border: 1px solid #999;
        text-align: center;
        font-family: 'Roboto','sans-serif';
        line-height: 30px;
        padding-left: 10px;
      }
      #floating-panel {
        background-color: #fff;
        border: 1px solid #999;
        left: 25%;
        padding: 5px;
        position: absolute;
        top: 10px;
        z-index: 5;
      }
    </style>
  </head>

  <body>
    <div id="floating-panel">
      <button onclick="toggleHeatmap()">Toggle Heatmap</button>
      <button onclick="changeGradient()">Change gradient</button>
      <button onclick="changeRadius()">Change radius</button>
      <button onclick="changeOpacity()">Change opacity</button>
    </div>
    <div id="map"></div>
    <script>

      // This example requires the Visualization library. Include the libraries=visualization
      // parameter when you first load the API. For example:
      // <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=visualization">

      var map, heatmap;

      function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
          zoom: 5,
          center: {lat: 20.5937, lng: 78.9629},
          mapTypeId: 'satellite'
        });

        heatmap = new google.maps.visualization.HeatmapLayer({
          data: getPoints(),
          map: map
        });
      }

      function toggleHeatmap() {
        heatmap.setMap(heatmap.getMap() ? null : map);
      }

      function changeGradient() {
        var gradient = [
          'rgba(0, 255, 255, 0)',
          'rgba(0, 255, 255, 1)',
          'rgba(0, 191, 255, 1)',
          'rgba(0, 127, 255, 1)',
          'rgba(0, 63, 255, 1)',
          'rgba(0, 0, 255, 1)',
          'rgba(0, 0, 223, 1)',
          'rgba(0, 0, 191, 1)',
          'rgba(0, 0, 159, 1)',
          'rgba(0, 0, 127, 1)',
          'rgba(63, 0, 91, 1)',
          'rgba(127, 0, 63, 1)',
          'rgba(191, 0, 31, 1)',
          'rgba(255, 0, 0, 1)'
        ]
        heatmap.set('gradient', heatmap.get('gradient') ? null : gradient);
      }

      function changeRadius() {
        heatmap.set('radius', heatmap.get('radius') ? null : 50);
      }

      function changeOpacity() {
        heatmap.set('opacity', heatmap.get('opacity') ? null : 0.2);
      }

      // Heatmap data: 500 Points
      function getPoints() {
        return [
          {location: new google.maps.LatLng(10.21, 79.2507), weight: 14},
          {location: new google.maps.LatLng(8.43, 77.2707), weight: 140},
          {location: new google.maps.LatLng(21.50, 78.45), weight: 980},
          {location: new google.maps.LatLng(10.24, 76.4007), weight: 342},
          {location: new google.maps.LatLng(13.0567, 79.43), weight: 432},
          {location: new google.maps.LatLng(10.10, 79.02), weight: 13},
          {location: new google.maps.LatLng(12.56, 79.2407), weight: 155},
          {location: new google.maps.LatLng(12.40, 79.19), weight: 140},
          {location: new google.maps.LatLng(9.31,78.08), weight: 242},
          {location: new google.maps.LatLng(11.361,78.39), weight: 79},
          {location: new google.maps.LatLng(10.1726,77.5339), weight: 342},
          {location: new google.maps.LatLng(10.01,77.2439), weight: 148},
          {location: new google.maps.LatLng(10.1726,79.5339), weight: 258},
          {location: new google.maps.LatLng(12.00,80.00), weight: 15},
          {location: new google.maps.LatLng(11.24,79.44), weight: 453},
          {location: new google.maps.LatLng(12.426,80.01), weight: 43},
          {location: new google.maps.LatLng(11.00,77.0), weight: 654},
          {location: new google.maps.LatLng(8.04,77.5339), weight: 345},
          {location: new google.maps.LatLng(12.00,80.30), weight: 754},
          {location: new google.maps.LatLng(11.43,79.4939), weight: 754},
          {location: new google.maps.LatLng(9.57,78.53), weight: 875},
          {location: new google.maps.LatLng(9.10,79.28), weight: 973},
          {location: new google.maps.LatLng(10.45,77.339), weight: 145},
          {location: new google.maps.LatLng(12.08,78.1339), weight: 456},
          {location: new google.maps.LatLng(10.226,78.00), weight: 655},
          {location: new google.maps.LatLng(11.26,76.46), weight: 165},
          {location: new google.maps.LatLng(13.14,80.22), weight: 134},
          {location: new google.maps.LatLng(11.1726,77.469), weight: 654},
          {location: new google.maps.LatLng(11.46,79.50), weight: 232},
          {location: new google.maps.LatLng(13.04,80.17), weight: 453},
          {location: new google.maps.LatLng(12.57,78.539), weight: 544},
          {location: new google.maps.LatLng(12.44,77.529), weight: 234},
          {location: new google.maps.LatLng(12.34,78.39), weight: 887},
          {location: new google.maps.LatLng(12.40,78.39), weight: 908},
          {location: new google.maps.LatLng(12.50,79.4539), weight: 453},
          {location: new google.maps.LatLng(10.5726,78.09), weight: 765},
          {location: new google.maps.LatLng(11.1726,77.50), weight: 234},
          {location: new google.maps.LatLng(8.34,78.10), weight: 158},
          {location: new google.maps.LatLng(9.146,78.5339), weight: 453},
          {location: new google.maps.LatLng(10.136,77.32), weight: 164},
          {location: new google.maps.LatLng(12.326,78.19), weight: 654},
          {location: new google.maps.LatLng(10.56,79.25), weight: 232},
          {location: new google.maps.LatLng(13.04,80.19), weight: 453},
          {location: new google.maps.LatLng(9.57,78.13), weight: 158},
          {location: new google.maps.LatLng(12.26,79.5339), weight: 165},
          {location: new google.maps.LatLng(12.37,80.1339), weight: 764},
          {location: new google.maps.LatLng(10.26,79.29), weight: 324},
          {location: new google.maps.LatLng(11.06,79.42), weight: 238},
          {location: new google.maps.LatLng(11.1726,76.5339), weight: 654},
          {location: new google.maps.LatLng(11.526,77.50), weight: 154},
          {location: new google.maps.LatLng(16.6,79.3), weight: 854},
          {location: new google.maps.LatLng(11.1326,78.1339), weight: 654},
          {location: new google.maps.LatLng(8.26,77.44), weight: 234},
          {location: new google.maps.LatLng(10.31,79.24), weight: 242},
          {location: new google.maps.LatLng(11.1526,78.3), weight: 153},
          {location: new google.maps.LatLng(9.06,76.5339), weight: 564},
          {location: new google.maps.LatLng(8.43,77.46), weight: 112},
          {location: new google.maps.LatLng(10.59,77.2), weight: 190},
          {location: new google.maps.LatLng(12.58,80.13), weight: 125},
          {location: new google.maps.LatLng(9.55,77.0), weight: 90},
          {location: new google.maps.LatLng(10.0,77.0), weight: 1232},
          {location: new google.maps.LatLng(11.47,79.35), weight: 124},
          {location: new google.maps.LatLng(9.31,78.39), weight: 123},
          {location: new google.maps.LatLng(10.26,79.22), weight: 654},
          {location: new google.maps.LatLng(11.14,78.56), weight: 765},
          {location: new google.maps.LatLng(10.07,77.39), weight: 564},
          {location: new google.maps.LatLng(10.39,77.03), weight: 657},
          {location: new google.maps.LatLng(13.2,80.15), weight: 765},
          {location: new google.maps.LatLng(11.26,79.48), weight: 876},
          {location: new google.maps.LatLng(10.26,78.52), weight: 565},
          {location: new google.maps.LatLng(13.26,80.21), weight: 865},
          {location: new google.maps.LatLng(9.27,77.39), weight: 594},
          {location: new google.maps.LatLng(9.22,78.52), weight: 76},
          {location: new google.maps.LatLng(9.17,79.22), weight: 456},
          {location: new google.maps.LatLng(11.39,78.12), weight: 765},
          {location: new google.maps.LatLng(9.1,77.39), weight: 187},
          {location: new google.maps.LatLng(9.21,77.59), weight: 158},
          {location: new google.maps.LatLng(11.26,77.15), weight: 134},
          {location: new google.maps.LatLng(12.37,80.1339), weight: 176},
          {location: new google.maps.LatLng(8.59,77.19), weight: 876},
          {location: new google.maps.LatLng(12.0,78.3), weight: 1231},
          {location: new google.maps.LatLng(13.0,80.14), weight: 152},
          {location: new google.maps.LatLng(8.57,77.21), weight: 543},
          {location: new google.maps.LatLng(10.47,79.10), weight: 345},
          {location: new google.maps.LatLng(12.14,79.39), weight: 643},
          {location: new google.maps.LatLng(10.50,78.46), weight: 543},
          {location: new google.maps.LatLng(8.26,78.11), weight: 643},
          {location: new google.maps.LatLng(11.26,77.56), weight: 765},
          {location: new google.maps.LatLng(11.58,79.15), weight: 764},
          {location: new google.maps.LatLng(9.49,79.01), weight: 164},
          {location: new google.maps.LatLng(8.44,77.44), weight: 1242},
          {location: new google.maps.LatLng(11.06,77.20), weight: 456},
          {location: new google.maps.LatLng(13.09,79.59), weight: 768},
          {location: new google.maps.LatLng(12.15,79.09), weight: 877},
          {location: new google.maps.LatLng(9.46,79.05), weight: 808},
          {location: new google.maps.LatLng(11.01,79.5339), weight: 657},
          {location: new google.maps.LatLng(11.09,78.39), weight: 966},
          {location: new google.maps.LatLng(8.47,78.11), weight: 187},
          {location: new google.maps.LatLng(11.26,76.44), weight: 456},
          {location: new google.maps.LatLng(10.36,77.17), weight: 878},
          {location: new google.maps.LatLng(11.11,79.20), weight: 546},
          {location: new google.maps.LatLng(12.17,78.35), weight: 567},
          {location: new google.maps.LatLng(12.41,78.39), weight: 897},
          {location: new google.maps.LatLng(12.56,79.11), weight: 356},
          {location: new google.maps.LatLng(11.57,79.32), weight: 986},
          {location: new google.maps.LatLng(9.35,77.57), weight: 453},
          {location: new google.maps.LatLng(11.32,79.24), weight: 1865},
          {location: new google.maps.LatLng(12.3,79.3), weight: 458},
          {location: new google.maps.LatLng(11.48,78.13), weight: 158},
        ];
      }
    </script>
    <script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCq_hlTBLSJ4wFU6tUqMY65-ByTFeUmWis&libraries=visualization&callback=initMap">
    </script>
  </body>
</html>
