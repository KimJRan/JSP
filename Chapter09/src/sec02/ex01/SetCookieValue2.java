package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/set2")
public class SetCookieValue2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date();
		
		//Cookie 객체를 생성한 후 cookieTest 이름으로 한글 정보를 인코딩해서 쿠키에 저장한다.
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP Programming.", "utf-8"));
		
		//유효 시간을 음수로 지정하여 Session 쿠키를 만든다.
		//브라우저 종료시 종료
		c.setMaxAge(-1);
		
		//생성된 쿠키를 브라우저로 전송한다.
		response.addCookie(c);
		
		out.println("현재시간 : " + d);
		out.println("문자열을 Cookie에 저장합니다.");
	}

}
