package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CityPopulations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Circles</title>\n");
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
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("      // This example creates circles on the map, representing populations in North\n");
      out.write("      // America.\n");
      out.write("\n");
      out.write("      // First, create an object containing LatLng and population for each city.\n");
      out.write("      var citymap = {\n");
      out.write("        chennai: {\n");
      out.write("          center: {lat: 13.0827, lng: 80.2707},\n");
      out.write("          population: 7090000\n");
      out.write("        },\n");
      out.write("        mumbai: {\n");
      out.write("          center: {lat: 19.0760, lng: 72.8777},\n");
      out.write("          population: 18400000,\n");
      out.write("          \n");
      out.write("\n");
      out.write("        },\n");
      out.write("        delhi: {\n");
      out.write("          center: {lat: 28.7041, lng: 77.1025},\n");
      out.write("          population: 19000000\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        kolkata: {\n");
      out.write("          center: {lat: 22.5726, lng: 88.3639},\n");
      out.write("          population: 4500000\n");
      out.write("        }\n");
      out.write("      };\n");
      out.write("    \n");
      out.write("      function initMap() {\n");
      out.write("        // Create the map.\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          zoom: 4,\n");
      out.write("          center: {lat: 20.5937, lng: 78.9629},\n");
      out.write("          mapTypeId: 'terrain',\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        var cityCircle= new Array(5);\n");
      out.write("        var i;\n");
      out.write("\n");
      out.write("        // Construct the circle for each value in citymap.\n");
      out.write("        // Note: We scale the area of the circle based on the population.\n");
      out.write("        for (var i in citymap) {\n");
      out.write("          // Add the circle for this city to the map.\n");
      out.write("           cityCircle[i] = new google.maps.Circle({\n");
      out.write("            strokeColor: '#FF0000',\n");
      out.write("            strokeOpacity: 0.8,\n");
      out.write("            strokeWeight: 2,\n");
      out.write("            clickable:true,\n");
      out.write("            fillColor: '#FF0000',\n");
      out.write("            fillOpacity: 0.35,\n");
      out.write("            map: map,\n");
      out.write("            center: citymap[i].center,\n");
      out.write("            radius: Math.sqrt(citymap[i].population) * 100\n");
      out.write("          });\n");
      out.write("          \n");
      out.write("           var infowindow =  new google.maps.InfoWindow();\n");
      out.write("        \n");
      out.write("      google.maps.event.addListener(cityCircle[i], 'click', (function(cityCircle,i){\n");
      out.write("          return function(){\n");
      out.write("                infowindow.setContent(\"The population of this city is \" + citymap[i].population);\n");
      out.write("\t\tinfowindow.setPosition(cityCircle[i].getCenter());\n");
      out.write("\t\tinfowindow.open(map);\n");
      out.write("            };\n");
      out.write("\t})(cityCircle,i));\n");
      out.write("           i++;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      google.maps.event.addDomListener(window, 'load', initMap);\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyD-L2fk-7Hpv4Rf23TKfTzV-wBBkoP6BZM&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
