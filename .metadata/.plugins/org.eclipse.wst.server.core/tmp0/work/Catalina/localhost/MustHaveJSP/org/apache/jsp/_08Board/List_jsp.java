/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.30
 * Generated at: 2024-10-31 08:37:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._08Board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model1.board.BoardDTO;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import model1.board.BoardDAO;

public final class List_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model1.board.BoardDTO");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("model1.board.BoardDAO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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

// DAO를 생성해 DB에 연결
BoardDAO dao = new BoardDAO(application);

// 사용자가 입력한 검색 조건을 Map에 저장
Map<String, Object> param = new HashMap<String, Object>();
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
if (searchWord != null) {
	param.put("searchField", searchField);
	param.put("serchWord", searchWord);
}

int totalCount = dao.selectCount(param);   // 게시물 수 확인
List<BoardDTO> boardLists = dao.selectList(param);   // 게시물 목록 받기
dao.close();   // DB 연결 닫기

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원제 게시판</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Common/Link.jsp", out, false);
      out.write("   <!-- 공통 링크 -->\r\n");
      out.write("	<h2>목록 보기(List)</h2>\r\n");
      out.write("	<!-- 검색폼 -->\r\n");
      out.write("	<form method=\"get\">\r\n");
      out.write("	<table border=\"1\" width=\"90%\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">\r\n");
      out.write("			<select name=\"searchField\">\r\n");
      out.write("				<option value=\"title\">제목</option>\r\n");
      out.write("				<option value=\"content\">내용</option>\r\n");
      out.write("			</select>\r\n");
      out.write("			<input type=\"text\" name=\"searchWord\" />\r\n");
      out.write("			<input type=\"submit\" value=\"검색하기\" />\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	<!-- 게시물 목록 테이블(표) -->\r\n");
      out.write("	<table border=\"1\" width=\"90%\">\r\n");
      out.write("		<!-- 각 컬럼의 이름 -->\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=\"10%\">번호</th>\r\n");
      out.write("			<th width=\"50%\">제목</th>\r\n");
      out.write("			<th width=\"15%\">작성자</th>\r\n");
      out.write("			<th width=\"10%\">조회수</th>\r\n");
      out.write("			<th width=\"15%\">작성일</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<!-- 목록의 내용 -->\r\n");

if (boardLists.isEmpty()) {
	// 게시물이 하나도 없을 때

      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"5\" align=\"center\">\r\n");
      out.write("				등록된 게시물이 없습니다^^*\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");

}
else {
	// 게시물이 있을 때
	int virtualNum = 0;   // 화면상에서의 게시물 번호
	for (BoardDTO dto : boardLists)
	{
		virtualNum = totalCount--;   // 전체 게시물 수에서 시작해 1씩 감소

      out.write("\r\n");
      out.write("		<tr align=\"center\">\r\n");
      out.write("			<td>");
      out.print( virtualNum );
      out.write("</td> <!-- 게시물 번호 -->\r\n");
      out.write("			<td align=\"left\"> <!-- 제목(+ 하이퍼링크) -->\r\n");
      out.write("				<a href=\"View.jsp?num=");
      out.print( dto.getNum() );
      out.write('"');
      out.write('>');
      out.print( dto.getTitle() );
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getId() );
      out.write("</td>   <!-- 작성자 아이디 -->\r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getVisitcount() );
      out.write("</td>   <!-- 조회수 -->\r\n");
      out.write("			<td align=\"center\">");
      out.print( dto.getPostdate() );
      out.write("</td>   <!-- 작성일 -->\r\n");
      out.write("		</tr>\r\n");

	}
}

      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		<!-- 목록 하단의 [글쓰기] 버튼 -->\r\n");
      out.write("		<table border=\"1\" width=\"90%\">\r\n");
      out.write("			<tr align=\"right\">\r\n");
      out.write("				<td><button type=\"button\" onclick=\"location.href='Write.jsp';\">글쓰기</button></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
