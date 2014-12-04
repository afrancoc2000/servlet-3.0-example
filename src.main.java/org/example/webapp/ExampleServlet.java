package org.example.webapp;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ExampleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 8103249312913079043L;
	private static Logger logger = Logger.getLogger("admin");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TreeMap<String, Object> datos = new TreeMap<String, Object>();
		datos.put("usuario", "Ana Franco");
		datos.put("saludar", true);
		datos.put("razaMascota", "Basset Hound");
		datos.put("nombreMascota", "Sara");
		
		req.setAttribute("datos", datos);
		
		logger.info("datos: " + datos);
		
		RequestDispatcher jspFile = req.getRequestDispatcher("inicio.jsp");
		jspFile.forward(req, resp);
	}
}
