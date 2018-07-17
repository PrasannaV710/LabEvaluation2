package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class heatmap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Heatmaps</title>\n");
      out.write("    <style>\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\n");
      out.write("       * element that contains the map. */\n");
      out.write("      #map {\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      #floating-panel {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 10px;\n");
      out.write("        left: 25%;\n");
      out.write("        z-index: 5;\n");
      out.write("        background-color: #fff;\n");
      out.write("        padding: 5px;\n");
      out.write("        border: 1px solid #999;\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: 'Roboto','sans-serif';\n");
      out.write("        line-height: 30px;\n");
      out.write("        padding-left: 10px;\n");
      out.write("      }\n");
      out.write("      #floating-panel {\n");
      out.write("        background-color: #fff;\n");
      out.write("        border: 1px solid #999;\n");
      out.write("        left: 25%;\n");
      out.write("        padding: 5px;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 10px;\n");
      out.write("        z-index: 5;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div id=\"floating-panel\">\n");
      out.write("      <button onclick=\"toggleHeatmap()\">Toggle Heatmap</button>\n");
      out.write("      <button onclick=\"changeGradient()\">Change gradient</button>\n");
      out.write("      <button onclick=\"changeRadius()\">Change radius</button>\n");
      out.write("      <button onclick=\"changeOpacity()\">Change opacity</button>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("      // This example requires the Visualization library. Include the libraries=visualization\n");
      out.write("      // parameter when you first load the API. For example:\n");
      out.write("      // <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=visualization\">\n");
      out.write("\n");
      out.write("      var map, heatmap;\n");
      out.write("\n");
      out.write("      function initMap() {\n");
      out.write("        map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          zoom: 5,\n");
      out.write("          center: {lat: 20.5937, lng: 78.9629},\n");
      out.write("          mapTypeId: 'satellite'\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        heatmap = new google.maps.visualization.HeatmapLayer({\n");
      out.write("          data: getPoints(),\n");
      out.write("          map: map\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function toggleHeatmap() {\n");
      out.write("        heatmap.setMap(heatmap.getMap() ? null : map);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function changeGradient() {\n");
      out.write("        var gradient = [\n");
      out.write("          'rgba(0, 255, 255, 0)',\n");
      out.write("          'rgba(0, 255, 255, 1)',\n");
      out.write("          'rgba(0, 191, 255, 1)',\n");
      out.write("          'rgba(0, 127, 255, 1)',\n");
      out.write("          'rgba(0, 63, 255, 1)',\n");
      out.write("          'rgba(0, 0, 255, 1)',\n");
      out.write("          'rgba(0, 0, 223, 1)',\n");
      out.write("          'rgba(0, 0, 191, 1)',\n");
      out.write("          'rgba(0, 0, 159, 1)',\n");
      out.write("          'rgba(0, 0, 127, 1)',\n");
      out.write("          'rgba(63, 0, 91, 1)',\n");
      out.write("          'rgba(127, 0, 63, 1)',\n");
      out.write("          'rgba(191, 0, 31, 1)',\n");
      out.write("          'rgba(255, 0, 0, 1)'\n");
      out.write("        ]\n");
      out.write("        heatmap.set('gradient', heatmap.get('gradient') ? null : gradient);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function changeRadius() {\n");
      out.write("        heatmap.set('radius', heatmap.get('radius') ? null : 50);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function changeOpacity() {\n");
      out.write("        heatmap.set('opacity', heatmap.get('opacity') ? null : 0.2);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Heatmap data: 500 Points\n");
      out.write("      function getPoints() {\n");
      out.write("        return [\n");
      out.write("          {location: new google.maps.LatLng(10.21, 79.2507), weight: 14},\n");
      out.write("          {location: new google.maps.LatLng(8.43, 77.2707), weight: 140},\n");
      out.write("          {location: new google.maps.LatLng(21.50, 78.45), weight: 980},\n");
      out.write("          {location: new google.maps.LatLng(10.24, 76.4007), weight: 342},\n");
      out.write("          {location: new google.maps.LatLng(13.0567, 79.43), weight: 432},\n");
      out.write("          {location: new google.maps.LatLng(10.10, 79.02), weight: 13},\n");
      out.write("          {location: new google.maps.LatLng(12.56, 79.2407), weight: 155},\n");
      out.write("          {location: new google.maps.LatLng(12.40, 79.19), weight: 140},\n");
      out.write("          {location: new google.maps.LatLng(9.31,78.08), weight: 242},\n");
      out.write("          {location: new google.maps.LatLng(11.361,78.39), weight: 79},\n");
      out.write("          {location: new google.maps.LatLng(10.1726,77.5339), weight: 342},\n");
      out.write("          {location: new google.maps.LatLng(10.01,77.2439), weight: 148},\n");
      out.write("          {location: new google.maps.LatLng(10.1726,79.5339), weight: 258},\n");
      out.write("          {location: new google.maps.LatLng(12.00,80.00), weight: 15},\n");
      out.write("          {location: new google.maps.LatLng(11.24,79.44), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(12.426,80.01), weight: 43},\n");
      out.write("          {location: new google.maps.LatLng(11.00,77.0), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(8.04,77.5339), weight: 345},\n");
      out.write("          {location: new google.maps.LatLng(12.00,80.30), weight: 754},\n");
      out.write("          {location: new google.maps.LatLng(11.43,79.4939), weight: 754},\n");
      out.write("          {location: new google.maps.LatLng(9.57,78.53), weight: 875},\n");
      out.write("          {location: new google.maps.LatLng(9.10,79.28), weight: 973},\n");
      out.write("          {location: new google.maps.LatLng(10.45,77.339), weight: 145},\n");
      out.write("          {location: new google.maps.LatLng(12.08,78.1339), weight: 456},\n");
      out.write("          {location: new google.maps.LatLng(10.226,78.00), weight: 655},\n");
      out.write("          {location: new google.maps.LatLng(11.26,76.46), weight: 165},\n");
      out.write("          {location: new google.maps.LatLng(13.14,80.22), weight: 134},\n");
      out.write("          {location: new google.maps.LatLng(11.1726,77.469), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(11.46,79.50), weight: 232},\n");
      out.write("          {location: new google.maps.LatLng(13.04,80.17), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(12.57,78.539), weight: 544},\n");
      out.write("          {location: new google.maps.LatLng(12.44,77.529), weight: 234},\n");
      out.write("          {location: new google.maps.LatLng(12.34,78.39), weight: 887},\n");
      out.write("          {location: new google.maps.LatLng(12.40,78.39), weight: 908},\n");
      out.write("          {location: new google.maps.LatLng(12.50,79.4539), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(10.5726,78.09), weight: 765},\n");
      out.write("          {location: new google.maps.LatLng(11.1726,77.50), weight: 234},\n");
      out.write("          {location: new google.maps.LatLng(8.34,78.10), weight: 158},\n");
      out.write("          {location: new google.maps.LatLng(9.146,78.5339), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(10.136,77.32), weight: 164},\n");
      out.write("          {location: new google.maps.LatLng(12.326,78.19), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(10.56,79.25), weight: 232},\n");
      out.write("          {location: new google.maps.LatLng(13.04,80.19), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(9.57,78.13), weight: 158},\n");
      out.write("          {location: new google.maps.LatLng(12.26,79.5339), weight: 165},\n");
      out.write("          {location: new google.maps.LatLng(12.37,80.1339), weight: 764},\n");
      out.write("          {location: new google.maps.LatLng(10.26,79.29), weight: 324},\n");
      out.write("          {location: new google.maps.LatLng(11.06,79.42), weight: 238},\n");
      out.write("          {location: new google.maps.LatLng(11.1726,76.5339), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(11.526,77.50), weight: 154},\n");
      out.write("          {location: new google.maps.LatLng(16.6,79.3), weight: 854},\n");
      out.write("          {location: new google.maps.LatLng(11.1326,78.1339), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(8.26,77.44), weight: 234},\n");
      out.write("          {location: new google.maps.LatLng(10.31,79.24), weight: 242},\n");
      out.write("          {location: new google.maps.LatLng(11.1526,78.3), weight: 153},\n");
      out.write("          {location: new google.maps.LatLng(9.06,76.5339), weight: 564},\n");
      out.write("          {location: new google.maps.LatLng(8.43,77.46), weight: 112},\n");
      out.write("          {location: new google.maps.LatLng(10.59,77.2), weight: 190},\n");
      out.write("          {location: new google.maps.LatLng(12.58,80.13), weight: 125},\n");
      out.write("          {location: new google.maps.LatLng(9.55,77.0), weight: 90},\n");
      out.write("          {location: new google.maps.LatLng(10.0,77.0), weight: 1232},\n");
      out.write("          {location: new google.maps.LatLng(11.47,79.35), weight: 124},\n");
      out.write("          {location: new google.maps.LatLng(9.31,78.39), weight: 123},\n");
      out.write("          {location: new google.maps.LatLng(10.26,79.22), weight: 654},\n");
      out.write("          {location: new google.maps.LatLng(11.14,78.56), weight: 765},\n");
      out.write("          {location: new google.maps.LatLng(10.07,77.39), weight: 564},\n");
      out.write("          {location: new google.maps.LatLng(10.39,77.03), weight: 657},\n");
      out.write("          {location: new google.maps.LatLng(13.2,80.15), weight: 765},\n");
      out.write("          {location: new google.maps.LatLng(11.26,79.48), weight: 876},\n");
      out.write("          {location: new google.maps.LatLng(10.26,78.52), weight: 565},\n");
      out.write("          {location: new google.maps.LatLng(13.26,80.21), weight: 865},\n");
      out.write("          {location: new google.maps.LatLng(9.27,77.39), weight: 594},\n");
      out.write("          {location: new google.maps.LatLng(9.22,78.52), weight: 76},\n");
      out.write("          {location: new google.maps.LatLng(9.17,79.22), weight: 456},\n");
      out.write("          {location: new google.maps.LatLng(11.39,78.12), weight: 765},\n");
      out.write("          {location: new google.maps.LatLng(9.1,77.39), weight: 187},\n");
      out.write("          {location: new google.maps.LatLng(9.21,77.59), weight: 158},\n");
      out.write("          {location: new google.maps.LatLng(11.26,77.15), weight: 134},\n");
      out.write("          {location: new google.maps.LatLng(12.37,80.1339), weight: 176},\n");
      out.write("          {location: new google.maps.LatLng(8.59,77.19), weight: 876},\n");
      out.write("          {location: new google.maps.LatLng(12.0,78.3), weight: 1231},\n");
      out.write("          {location: new google.maps.LatLng(13.0,80.14), weight: 152},\n");
      out.write("          {location: new google.maps.LatLng(8.57,77.21), weight: 543},\n");
      out.write("          {location: new google.maps.LatLng(10.47,79.10), weight: 345},\n");
      out.write("          {location: new google.maps.LatLng(12.14,79.39), weight: 643},\n");
      out.write("          {location: new google.maps.LatLng(10.50,78.46), weight: 543},\n");
      out.write("          {location: new google.maps.LatLng(8.26,78.11), weight: 643},\n");
      out.write("          {location: new google.maps.LatLng(11.26,77.56), weight: 765},\n");
      out.write("          {location: new google.maps.LatLng(11.58,79.15), weight: 764},\n");
      out.write("          {location: new google.maps.LatLng(9.49,79.01), weight: 164},\n");
      out.write("          {location: new google.maps.LatLng(8.44,77.44), weight: 1242},\n");
      out.write("          {location: new google.maps.LatLng(11.06,77.20), weight: 456},\n");
      out.write("          {location: new google.maps.LatLng(13.09,79.59), weight: 768},\n");
      out.write("          {location: new google.maps.LatLng(12.15,79.09), weight: 877},\n");
      out.write("          {location: new google.maps.LatLng(9.46,79.05), weight: 808},\n");
      out.write("          {location: new google.maps.LatLng(11.01,79.5339), weight: 657},\n");
      out.write("          {location: new google.maps.LatLng(11.09,78.39), weight: 966},\n");
      out.write("          {location: new google.maps.LatLng(8.47,78.11), weight: 187},\n");
      out.write("          {location: new google.maps.LatLng(11.26,76.44), weight: 456},\n");
      out.write("          {location: new google.maps.LatLng(10.36,77.17), weight: 878},\n");
      out.write("          {location: new google.maps.LatLng(11.11,79.20), weight: 546},\n");
      out.write("          {location: new google.maps.LatLng(12.17,78.35), weight: 567},\n");
      out.write("          {location: new google.maps.LatLng(12.41,78.39), weight: 897},\n");
      out.write("          {location: new google.maps.LatLng(12.56,79.11), weight: 356},\n");
      out.write("          {location: new google.maps.LatLng(11.57,79.32), weight: 986},\n");
      out.write("          {location: new google.maps.LatLng(9.35,77.57), weight: 453},\n");
      out.write("          {location: new google.maps.LatLng(11.32,79.24), weight: 1865},\n");
      out.write("          {location: new google.maps.LatLng(12.3,79.3), weight: 458},\n");
      out.write("          {location: new google.maps.LatLng(11.48,78.13), weight: 158},\n");
      out.write("        ];\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("        src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCq_hlTBLSJ4wFU6tUqMY65-ByTFeUmWis&libraries=visualization&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
