package com.example.demo.tradicional;

public class Alumno {
	
	private String nombreA;
	private String direccionA;
	private String cedulaA;
	private String edadA;
	private String genero;
	private String jornada;
	public String getNombreA() {
		return nombreA;
	}
	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	public String getDireccionA() {
		return direccionA;
	}
	public void setDireccionA(String direccionA) {
		this.direccionA = direccionA;
	}
	public String getCedulaA() {
		return cedulaA;
	}
	public void setCedulaA(String cedulaA) {
		this.cedulaA = cedulaA;
	}
	public String getEdadA() {
		return edadA;
	}
	public void setEdadA(String edadA) {
		this.edadA = edadA;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getJornada() {
		return jornada;
	}
	public void setJornada(String jornada) {
		this.jornada = jornada;
	}
	@Override
	public String toString() {
		return "Alumno [nombreA=" + nombreA + ", direccionA=" + direccionA + ", cedulaA=" + cedulaA + ", edadA=" + edadA
				+ ", genero=" + genero + ", jornada=" + jornada + "]";
	}
	
	


}
