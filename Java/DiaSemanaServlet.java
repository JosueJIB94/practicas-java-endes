

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numeroSemana = Integer.parseInt(request.getParameter("numeroSemana"));
		PrintWriter out = response.getWriter();
		
		
			if (numeroSemana==1) {
				out.println("<h1>LUNES<h1>");
			} else if (numeroSemana==2) {
				out.println("MARTES");
			} else if (numeroSemana==3) {
				out.println("MIERCOLES");
			} else if (numeroSemana==4) {
				out.println("JUEVES");
			} else if (numeroSemana==5) {
				out.println("VIERNES");
			} else if (numeroSemana==6) {
				out.println("SABADO");
			} else if (numeroSemana==7) {
				out.println("DOMINGO");
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
