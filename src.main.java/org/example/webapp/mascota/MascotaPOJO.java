package org.example.webapp.mascota;

import java.util.ArrayList;
import java.util.Calendar;

public class MascotaPOJO {
	
	private String nombre;
	private String raza;
	private Calendar fechaNac;
	private String colores;
	private int id;
	
	private static ArrayList<MascotaPOJO> listaMascotas;
	
	public static ArrayList<MascotaPOJO> getListaMascotas() {
		return listaMascotas;
	}

	static{
		listaMascotas = new ArrayList<MascotaPOJO>();
		
		MascotaPOJO sara = new MascotaPOJO();
		sara.setNombre("Sara");
		sara.setRaza("Basset Hound");
		Calendar fechaSara = Calendar.getInstance();
		fechaSara.set(2001, 8, 11, 0, 0, 0);
		sara.setFechaNac(fechaSara);
		sara.setColores("Cafe y negro");
		sara.setId(0);
		listaMascotas.add(sara);
		
		MascotaPOJO pia = new MascotaPOJO();
		pia.setNombre("Pia");
		pia.setRaza("Siberiana");
		Calendar fechaPia = Calendar.getInstance();
		fechaPia.set(2009, 2, 14, 0, 0, 0);
		pia.setFechaNac(fechaPia);
		pia.setColores("Gris y blanco");
		pia.setId(1);
		listaMascotas.add(pia);
		
		MascotaPOJO sandi = new MascotaPOJO();
		sandi.setNombre("Sandi");
		sandi.setRaza("French puddle");
		Calendar fechaSandi = Calendar.getInstance();
		fechaSandi.set(1996, 7, 26, 0, 0, 0);
		sandi.setFechaNac(fechaSandi);
		sandi.setColores("Blanco mugre");
		sandi.setId(2);
		listaMascotas.add(sandi);
		
		MascotaPOJO teo = new MascotaPOJO();
		teo.setNombre("Teo");
		teo.setRaza("Maltes");
		Calendar fechaTeo = Calendar.getInstance();
		fechaTeo.set(2008, 10, 15, 0, 0, 0);
		teo.setFechaNac(fechaTeo);
		teo.setColores("Blanco y negro");
		teo.setId(3);
		listaMascotas.add(teo);
		
		MascotaPOJO yoyo = new MascotaPOJO();
		yoyo.setNombre("Yoyo");
		yoyo.setRaza("French puddle");
		Calendar fechaYoyo = Calendar.getInstance();
		fechaYoyo.set(2010, 2, 16, 0, 0, 0);
		yoyo.setFechaNac(fechaYoyo);
		yoyo.setColores("Blanco mugre");
		yoyo.setId(4);
		listaMascotas.add(yoyo);
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public Calendar getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getColores() {
		return colores;
	}
	
	public void setColores(String colores) {
		this.colores = colores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
