

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/count777")
public class count777 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スリーセブン</title>");
		out.println("</head>");
		out.println("<body>");
		Random rand=new Random();
		int num=0;
		int count=0;
		while(true) {
			num=rand.nextInt(899)+100;
			count++;
			out.println("<p>"+num+"</p>");
			if(num==777) {
				break;
			}

		}
		out.println(count+"回目に出ました！");
		out.println("</body>");
		out.println("</html>");
	}
}
