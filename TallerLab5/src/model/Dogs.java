package model;

import processing.core.PApplet;

public class Dogs implements Comparable<Dogs>{

	private int id,edad;
	private String nombre,raza,fecha;
	private PApplet app3;
	
	
	public Dogs(int id, String nombre, int edad, String raza, String fecha, PApplet app3) {
		this.id=id;
		this.nombre=nombre;
		this.edad=edad;
		this.raza=raza;
		this.fecha=fecha;
		this.app3=app3;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public int compareTo(Dogs o) {
	
		return this.id - o.getId();
	}


	public void draw(int posx, int posy) {
		app3.fill(255);
		app3.textSize(20);
		app3.text(id +" "+ nombre +" "+ edad +" "+ raza +" "+ fecha +" ",posx,posy);
		
	}

	
	
	
}
