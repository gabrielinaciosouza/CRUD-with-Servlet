package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		PrintWriter writer = resp.getWriter();
		writer.println("<html> ");
		writer.println("<body> ");
		writer.println("Olá Mundo! ");
		writer.println("</body> ");
		writer.println("</html> ");
	}
	

}
