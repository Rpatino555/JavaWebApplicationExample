package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<head><title>HTML Forms</title></head>");
		out.println("<body>");
		out.println("<form action=/MyServlet2>");
  		out.println("<label for=fname>Nombre:</label>");
  		out.println("<input type=text id=fname name=fname value=><br>");
  		out.println("<label for=lname>Apellidos:</label>");
				out.println("<input type=text id=lname name=lname value=>");
 		out.println("<input type=submit value=Enviar>");
		out.print("</form>");

		out.println("<p>Escribe tu nombre y haz clic en Enviar</p>");

				out.println("</body></html>");
	}

}