package org.example.webapp.mascota;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MascotaDescServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		String idStr = req.getParameter("id");
		long id = Long.parseLong(idStr);
		
		ArrayList<MascotaPOJO> mascotas = MascotaPOJO.getListaMascotas(); 
		MascotaPOJO mascota = null;
		
		for(MascotaPOJO masc: mascotas){
			if(masc.getId() == id){
				mascota = masc;
			}
		}
		
		if(mascota == null){
			RequestDispatcher jspFile = req.getRequestDispatcher("../mascota/notfound.jsp");
			jspFile.forward(req, resp);
		}
		
		req.setAttribute("mascota", mascota);
		
		RequestDispatcher jspFile = req.getRequestDispatcher("../mascota/desc.jsp");
		jspFile.forward(req, resp);
	}	

}
