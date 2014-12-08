package org.example.webapp;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MascotaServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TreeMap<String, Object> mascota = new TreeMap<String, Object>();
		mascota.put("nombre", "Sara");
		mascota.put("raza", "Basset Hound");
		mascota.put("fechaNac", "11/09/2001");
		mascota.put("colores", "Cafe y negro");
		
		req.setAttribute("mascota", mascota);
		
		RequestDispatcher jspFile = req.getRequestDispatcher("mascota.jsp");
		jspFile.forward(req, resp);
	}	
	
}
