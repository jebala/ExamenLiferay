package com.ejemplo;

public class Usuario {
	private String id;
	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return id;
	}
	public void setDireccion(String direccion) {
		this.id = id;
	}
	
	
	public Usuario(String nombre, String ciudad, String direccion, String estado) {
		super();
		this.nombre = nombre;
		this.id = id;
		
	}
}
