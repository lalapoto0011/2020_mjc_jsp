package ex01;

import java.io.*; //그냥 기본으로 들어감. 자바 io->입출력에 대한 패키지
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet; //웹 프로토콜

@WebServlet(urlPatterns = "/ex01/ex01") //애노테이션은 뒤에 세미콜론 안 붙임.
//웹에 대한 기능을 불러오도록 클래스를 확장(Extencion?)
public class Ex01 extends HttpServlet { //웹 기능 담당하는거 호출

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html"); //이걸로 응답할거야~
		PrintWriter out = response.getWriter(); //출력 내용(사용자에게 응답할 구조체? 보관함?)을 out에 담음 - 선언해놨을 뿐 아직 쓰진 않음. 보관함에 내용 채워넣을거
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ex01</title>");
		out.println("</head>");
		out.println("<body>ex01</body>");
		out.println("<html>");
	}
	
}
