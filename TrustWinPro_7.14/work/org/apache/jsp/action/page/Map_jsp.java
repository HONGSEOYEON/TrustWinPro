/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-12-01 06:43:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.action.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import com.Trustwin.Admin.Project.Language.*;
import com.Trustwin.Admin.Project.Device.*;
import com.Trustwin.Admin.Project.Map.*;

public final class Map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String ID = (String)request.getParameter("mapID");
	if(ID == null){

	}else{
		DeviceFunc devFunc = new DeviceFunc();
		Device[] dev = devFunc.deviceList();
		MapFunc mapFunc = new MapFunc();
		Map map = mapFunc.selMap(ID);
		MapDevice[] mapDev = mapFunc.selMapDev(ID);
		String imageFile = "";
		ServletContext scontext = getServletContext();
		imageFile = request.getContextPath() + "/upload/image/Map/";
		if(map == null){
			
		}else{
			imageFile = imageFile + map.getImage();
		}

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("jQuery(function($){\r\n");
      out.write("\t$('.drag')\r\n");
      out.write("\t\t.drag(function( ev, dd ){\r\n");
      out.write("\t\t\t$( this ).css({\r\n");
      out.write("\t\t\t\ttop: dd.offsetY,\r\n");
      out.write("\t\t\t\tleft: dd.offsetX\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#status\"+$(this).attr('id')).css({\r\n");
      out.write("\t\t\t\ttop: dd.offsetY+40,\r\n");
      out.write("\t\t\t\tleft: dd.offsetX-80\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},{ relative:true })\r\n");
      out.write("\t\t.drag(\"end\",function( ev, dd ){\r\n");
      out.write("\t\t\t$.ajax({      \r\n");
      out.write("\t\t\t    type:\"post\",  \r\n");
      out.write("\t\t\t    url:\"/TrustWinPro/action/ajax/UpdateMapXY.jsp\",   \r\n");
      out.write("\t\t\t    data: \"X=\"+dd.offsetX+\"&Y=\"+dd.offsetY+\"&idx=\"+$( this ).attr('id'),\r\n");
      out.write("\t\t\t    success:function(args){\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    },   \r\n");
      out.write("\t\t\t    error:function(e){  \r\n");
      out.write("\t\t\t        alert(e.responseText);  \r\n");
      out.write("\t\t\t    }  \r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function MapDeviceInfo(x,y){\r\n");
      out.write("\t$.ajax({      \r\n");
      out.write("\t    type:\"post\",  \r\n");
      out.write("\t    url:\"/TrustWinPro/action/ajax/MapDeviceInfo.jsp\",   \r\n");
      out.write("\t    data: \"deviceID=\"+x,\r\n");
      out.write("\t    success:function(args){\r\n");
      out.write("\t    \t$(\"#status\"+y).html(args);\r\n");
      out.write("\t    \tif(args == null){\r\n");
      out.write("\t    \t\t$(\"#status\"+y).css(\"display\",\"none\");\r\n");
      out.write("\t    \t}else{\r\n");
      out.write("\t    \t\t$(\"#status\"+y).css(\"display\",\"inline\");\t\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t    \r\n");
      out.write("\t    },   \r\n");
      out.write("\t    error:function(e){  \r\n");
      out.write("\t        alert(e.responseText);  \r\n");
      out.write("\t    }  \r\n");
      out.write("\t}); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");

	for(int i=0;i<mapDev.length;i++){

      out.write("\r\n");
      out.write("\tsetInterval(function(){MapDeviceInfo('");
      out.print(mapDev[i].getDeviceID());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(mapDev[i].getIdx());
      out.write("');},1000);\r\n");

	}

      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"MapInfo\">\r\n");
      out.write("\t<div class=\"basic\">\r\n");

		for(int i=0;i<mapDev.length;i++){

      out.write("\r\n");
      out.write("\t\t<img src=\"/TrustWinPro/action/image/MapClosedDoor.bmp\" class=\"drag\" id=\"");
      out.print(mapDev[i].getIdx() );
      out.write("\" style=\"top:");
      out.print(mapDev[i].getY());
      out.write("px;left:");
      out.print(mapDev[i].getX());
      out.write("px;\">\r\n");
      out.write("\t\t<div class=\"status\" id=\"status");
      out.print(mapDev[i].getIdx());
      out.write("\" style=\"top:");
      out.print(mapDev[i].getY()+40);
      out.write("px;left:");
      out.print(mapDev[i].getX()-80);
      out.write("px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");

		}

      out.write("\r\n");
      out.write("\t\t<img src=\"");
      out.print(imageFile);
      out.write("\" class=\"mapImage\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"bottom\" id=\"web-buttons-idrmij3\">\r\n");
      out.write("\t\t<a href=\"#a\" title=\"Enroll\" onclick=\"setupMove()\">MapSetup</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"mapsetup\" id=\"mapsetup\" method=\"post\" action=\"/TrustWinPro/action/index.jsp\" >\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.print(ID);
      out.write("\"  name=\"mapID\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"Monitoring\" name=\"left\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"MapSetup\" name=\"content\" />\r\n");
      out.write("</form>\r\n");

	}

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}