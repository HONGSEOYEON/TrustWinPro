/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-04-07 07:21:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.action.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

import com.Trustwin.Admin.Project.Category.LangUtil;

public final class pieChartHour_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	dbData dD = new dbData();
	String[] places = dD.getPlace();	
	int placeCnt = dD.getPlaceCnt();
	String SDate = (String) request.getParameter("selectDate");
	String SPlace = (String) request.getParameter("selectPlace");

      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\" src=\"/sdffJSP/action/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/sdffJSP/action/js/calendar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://www.google.com/jsapi\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    google.load('visualization', '1', {packages: ['corechart'],'language':'ko'});\r\n");
      out.write("     \r\n");
      out.write("    \tfunction fn_submit2() { \r\n");
      out.write("    \tdocument.chartOption.submit(); \r\n");
      out.write("    \t} \r\n");
      out.write("    \r\n");
      out.write("    function drawVisualization2(dataFromAjax) {\r\n");
      out.write("         var data = google.visualization.arrayToDataTable(dataFromAjax);\r\n");
      out.write("         new google.visualization.ColumnChart(document.getElementById('map')).\r\n");
      out.write("         draw(data, {fontName: \"留��� 怨���, Malgon Gothic\", \r\n");
      out.write("                fontSize: 11,\r\n");
      out.write("                forceIFrame: false,\r\n");
      out.write("                title:\"異��� �몄��\",\r\n");
      out.write("                vAxis: {maxValue: 20},\r\n");
      out.write("         \t\thAxis: {textStyle: {fontSize:8}}\r\n");
      out.write("         \t\t}\r\n");
      out.write("           );\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function drawInit2()\r\n");
      out.write("    {\r\n");
      out.write("         var data = null;\r\n");
      out.write("         var table_data = null;\r\n");
      out.write("\r\n");
      out.write("         $.ajax({\r\n");
      out.write("             url:'chartProc.jsp',\r\n");
      out.write("             data: 'date=");
      out.print(SDate);
      out.write("&place=");
      out.print(SPlace);
      out.write("',\r\n");
      out.write("             success: function(res) {\r\n");
      out.write("                 table_data = eval(\"(\" + res + \")\");\r\n");
      out.write("                 drawVisualization2(table_data);\r\n");
      out.write("             }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    google.setOnLoadCallback(drawInit2);\r\n");
      out.write(" \r\n");
      out.write("    setInterval(function() { drawInit2(); }, 60000);\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t\r\n");
      out.write("\t<div  style=\"width:600px; height:1px; font-size:0; line-height:2; padding:2;\" >\r\n");
      out.write("\t<form action=\"index.jsp\" name=\"chartOption\" id=\"chartOption\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tplace: <select name=\"selectPlace\" >\r\n");
      out.write("\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t");
for(int i=0;i<placeCnt;i++){ 
      out.write("\r\n");
      out.write("\t\t<option value=\"");
      out.print(places[i] );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(places[i] );
      out.write("</option>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\r\n");
      out.write("\t\tDate : <input type=\"text\" name=\"selectDate\" id=\"selectDate\" readonly=\"readOnly\" value=\"");
      out.print(LangUtil.Empty(SDate));
      out.write("\" readonly=\"readOnly\" onclick=\"fnPopUpCalendar(selectDate,selectDate,'yyyy-mm-dd')\" /> \r\n");
      out.write("\t\t<button onclick=\"fn_submit2();\" form=\"chartOption\">sumit</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"barChartOption.jsp\" onClick=\"return show_hide_box(this,500,300,'1px solid')\"><img  src=\"/sdffJSP/action/image/setting.png\" style=\"width:15px; height:15px;float:right\" ></a>\r\n");
      out.write("\t\t<a href=\"barChartDesc.html\" onClick=\"return show_hide_box(this,500,300,'1px solid')\"><img  src=\"/sdffJSP/action/image/spam.png\" style=\"width:15px; height:15px;float:right\" ></a>\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<br><br>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"map\"style=\"border-top:1px groove; border-bottom:1px groove; border-left:1px groove; border-right:1px groove;width: 600px; height: 250px; \" ></div>\r\n");
      out.write("\t\r\n");
      out.write("</html>");
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
