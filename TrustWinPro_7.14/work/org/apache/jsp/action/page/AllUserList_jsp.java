/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2015-12-23 07:25:55 UTC
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
import java.util.*;
import com.Trustwin.Admin.Project.Category.*;
import com.Trustwin.Admin.Project.User.*;
import com.Trustwin.Admin.Project.Language.*;
import com.Trustwin.Admin.Project.Access.*;
import com.Trustwin.Admin.Project.Device.*;

public final class AllUserList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var change = 0;\r\n");
      out.write("function allUserInfoCheck(){\r\n");
      out.write("\tvar check = document.userInfo.check;\r\n");
      out.write("\tif(check.value != 'undefine'){\r\n");
      out.write("\t\tif(change == 0){\r\n");
      out.write("\t\t\tcheck.checked = true;\t\r\n");
      out.write("\t\t\tchange = 1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tcheck.checked = false;\r\n");
      out.write("\t\t\tchange = 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif(change == 0){\r\n");
      out.write("\t\t\tfor(var i = 0 ; i < check.length;i++ ){\r\n");
      out.write("\t\t\t\tcheck[i].checked = true;\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tchange = 1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tfor(var i = 0 ; i < check.length;i++ ){\r\n");
      out.write("\t\t\t\tcheck[i].checked = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tchange = 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkedF(num,v){\r\n");
      out.write("\tvar count = 0;\r\n");
      out.write("\tvar array = new Array();\r\n");
      out.write("\tvar check = document.userInfo.check;\r\n");
      out.write("\tfor(var i = 0; i< check.length; i++){\r\n");
      out.write("\t\tif(check[i].checked){\r\n");
      out.write("\t\t\tarray[count] = check[i].value;\r\n");
      out.write("\t\t\tcount++;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(v==1){ // 전송\r\n");
      out.write("\t\tif(num==count){\r\n");
      out.write("\t\t\tEnroll('S,U,E,0,E');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar value = 'S,U,E,1,';\r\n");
      out.write("\t\t\tfor(var i=0;i<count;i++){\r\n");
      out.write("\t\t\t\tvalue = value + array[i] + ',';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvalue = value + 'E';\r\n");
      out.write("\t\t\tEnroll(value);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(v==2){\t// 삭제\r\n");
      out.write("\t\tif(num==count){\r\n");
      out.write("\t\t\tDelete('S,U,D,0,E');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar value = 'S,U,D,1,';\r\n");
      out.write("\t\t\tfor(var i=0;i<count;i++){\r\n");
      out.write("\t\t\t\tvalue = value + array[i] + ',';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvalue = value + 'E';\r\n");
      out.write("\t\t\tDelete(value);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\t// 수신\r\n");
      out.write("\t\tif(num==count){\r\n");
      out.write("\t\t\tRecive('S,U,R,0,E');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar value = 'S,U,R,1,';\r\n");
      out.write("\t\t\tfor(var i=0;i<count;i++){\r\n");
      out.write("\t\t\t\tvalue = value + array[i] + ',';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvalue = value + 'E';\r\n");
      out.write("\t\t\tRecive(value);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"userdata\">\r\n");

	request.setCharacterEncoding("utf-8");
	Connection conn = null;
	String FirstName = (String)request.getParameter("searchFirstName");
	if(FirstName != null){
		FirstName = new String(FirstName .getBytes("8859_1"), "UTF-8");	
	}
	String MiddleName = (String)request.getParameter("searchMiddleName");
	if(MiddleName != null){
		MiddleName = new String(MiddleName .getBytes("8859_1"), "UTF-8");	
	}
	
	String LastName = (String)request.getParameter("searchLastName");
	if(LastName != null){
		LastName = new String(LastName .getBytes("8859_1"), "UTF-8");	
	}
	
	int Department = 0;
	if((String)request.getParameter("searchDepartment")!=null){
		String temp = (String)request.getParameter("searchDepartment");
		if(!temp.equals("")){
			Department = Integer.parseInt((String)request.getParameter("searchDepartment"));
		}
	}
	
	String UserClass = (String)request.getParameter("searchUserClass");
	String CompanyID = (String)request.getParameter("searchCompanyID");
	
	CategoryFunc Catefunc = new CategoryFunc();
	UserFunc Userfunc = new UserFunc();
	LanguageFunc Lanfunc = new LanguageFunc();
	AccessFunc Accfunc = new AccessFunc();
	DeviceFunc Devfunc = new DeviceFunc();
	
	User[] users = Userfunc.searchUser(FirstName,MiddleName,LastName,Department,UserClass,CompanyID);
	String lan = (String)session.getAttribute("nation");
	
	int top = 0;
	
	if(request.getParameter("Num")==null){
		top = 100;
	}else{
	 	top = Integer.parseInt(request.getParameter("Num"));
	}
	
	Category[] catagory = null;
	
	catagory = Catefunc.CategoryDefind();
	
	int length = catagory.length;
	Category[] cata = new Category[length];	
	cata = Catefunc.SortCategoryOne(catagory);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\t<section class = \"sectionji\">\r\n");
      out.write("\t\t\t<ul class = \"ulji\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("<!--  class=\"searchForm\" !-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<form action=\"/TrustWinPro/action/index.jsp\" name=\"allUser\" id=\"allUser\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"User\" name=\"left\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"AllUser\" name=\"content\" />\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 26));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class = \"inputt\" name=\"searchFirstName\" value=\"");
      out.print(LangUtil.Empty(FirstName));
      out.write("\" /> \r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 27));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class = \"inputt\" name=\"searchMiddleName\" value=\"");
      out.print(LangUtil.Empty(MiddleName));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 28));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class = \"inputt\" name=\"searchLastName\" value=\"");
      out.print(LangUtil.Empty(LastName));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 38));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class = \"inputt\" name=\"searchCompanyID\" value=\"");
      out.print(LangUtil.Empty(CompanyID));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 29));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class = \"inputt\" name=\"searchUserClass\" value=\"");
      out.print(LangUtil.Empty(UserClass));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p><div class = \"headerji\">\r\n");
      out.write("\t\t\t\t");
      out.print(Lanfunc.language(lan, 39));
      out.write(" : \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<select name=\"searchDepartment\" class = \"hourselect\">>\r\n");
      out.write("\t\t\t\t\t<option value=\"\">== Select Option ==</option>\r\n");

	for(int i=0;i<cata.length;i++){

      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(cata[i].getIdx());
      out.write('"');
      out.write(' ');
      out.print(cata[i].getIdx() == Department ? "selected" : "" );
      out.write('>');
      out.print(cata[i].getName() );
      out.write("</option>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"");
      out.print(Lanfunc.language(lan, 182));
      out.write("\" class=\"ct-btn white\" />\r\n");
      out.write("\t\t\t\t<div style=\"float:right; margin-right:20px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#a\" onclick=\"UserPrint();\"><img src=\"/TrustWinPro/action/image/interface/printImage.jpg\" alt=\"\" ></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</section>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"\" name=\"userInfo\" id=\"userInfo\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t<div class = \"tablebor\">\r\n");
      out.write("\t\t<table cellspacing=\"0\" class=\"titleEx1\">\r\n");
      out.write("\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t</colgroup>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 85));
      out.write(" <input type=\"checkbox\" name=\"allcheck\" onclick=\"allUserInfoCheck();\" style=\"z-index:100;\"></th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 26));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 27));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 28));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 29));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 38));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 30));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 31));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 5));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 39));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 81));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>");
      out.print(Lanfunc.language(lan, 82));
      out.write("</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<table cellspacing=\"0\"  class=\"ex1\">\r\n");
      out.write("\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t\t<col width=\"8%\">\r\n");
      out.write("\t\t\t</colgroup>\r\n");
      out.write("\t\t\t<tbody>\r\n");

		for(int i=0;i<users.length;i++){

      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class='date1'><input type=\"checkbox\" name=\"check\" value=\"");
      out.print(users[i].getId());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'><a href=\"#a\" onclick=\"submitUser('User','");
      out.print(users[i].getUserId() );
      out.write("')\">");
      out.print(users[i].getFirstName() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'><a href=\"#a\" onclick=\"submitUser('User','");
      out.print(users[i].getUserId() );
      out.write("')\">");
      out.print(users[i].getMiddleName() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'><a href=\"#a\" onclick=\"submitUser('User','");
      out.print(users[i].getUserId() );
      out.write("')\">");
      out.print(users[i].getLastName() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'><a href=\"#a\" onclick=\"submitUser('User','");
      out.print(users[i].getUserId() );
      out.write("')\">");
      out.print(users[i].getUserId() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>");
      out.print(users[i].getCompanyID() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>\r\n");

	if(users[i].getUserClass()==null){

      out.write("\r\n");
      out.write("\t\t\t\t\t\tUser\r\n");
 
	}else if(users[i].getUserClass().equals("")){

      out.write("\r\n");
      out.write("\t\t\t\t\t\tUser\r\n");

	}else if(users[i].getUserClass().equals("1")){

      out.write("\r\n");
      out.write("\t\t\t\t\t\tUser\r\n");

	}else if(users[i].getUserClass().equals("128")){

      out.write("\r\n");
      out.write("\t\t\t\t\t\tAdmin\r\n");

	}

      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>");
      out.print(users[i].getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>");
      out.print(users[i].getPassWord() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>\r\n");

					String Name = Catefunc.selCategory(users[i].getDepartment());
					out.println(Name);


      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>\r\n");

			AccessUser[] accessUser = Accfunc.SelAccessUserId(Integer.parseInt(users[i].getId()));
			for(int j=0;j<accessUser.length;j++){
				AccessGroup accessGroup = Accfunc.SelAccessGroup(accessUser[j].getAccess());
				out.println(accessGroup.getName());
			}		

      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class='date1'>\r\n");
	
			for(int j=0;j<accessUser.length;j++){
				AccessGroup accessGroup = Accfunc.SelAccessGroup(accessUser[j].getAccess());
				AccessDevice[] ad = Accfunc.SelAccessDevice(accessGroup.getIdx());
				for(int k=0;k<ad.length;k++){
					Device device = Devfunc.selDevice(Integer.parseInt(ad[k].getDevice()));
					out.print("<p style='margin:0;padding:0;'>"+device.getControllerName()+"</p>");
				}
			}

      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");

		}

      out.write("\t\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"bottom\" id=\"web-buttons-idrmij3\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Enroll\" onclick=\"checkedF(");
      out.print(users.length );
      out.write(",3);\">");
      out.print(Lanfunc.language(lan, 184));
      out.write("</a>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Delete\" onclick=\"checkedF(");
      out.print(users.length );
      out.write(",2);\">");
      out.print(Lanfunc.language(lan, 88));
      out.write("</a>\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Recive\" onclick=\"checkedF(");
      out.print(users.length );
      out.write(",1);\">");
      out.print(Lanfunc.language(lan, 183));
      out.write("</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<form action=\"/TrustWinPro/action/index.jsp\" name=\"User\" id=\"User\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" value=\"User\" name=\"left\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"\" name=\"userID\" />\r\n");
      out.write("\t<input type=\"hidden\" value=\"UserInfo\" name=\"content\" />\r\n");
      out.write("</form>\r\n");
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
