package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MayorServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int numero1 = Integer.parseInt(request.getParameter("numero1"));
		int numero2 = Integer.parseInt(request.getParameter("numero2"));
		int numero3 = Integer.parseInt(request.getParameter("numero3"));
		
		PrintWriter out = response.getWriter();
		
		if (numero1>numero2 && numero1>numero3) {
			out.println("El numero mayor es: " + numero1);
		} else if (numero2 > numero3) {
			out.println("El numero mayor es: " + numero2);
		} else {
			out.println("El numero mayor es: " + numero3);
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
