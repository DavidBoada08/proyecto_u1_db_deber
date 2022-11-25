package com.example.demo.herencia;

import org.springframework.stereotype.Component;

@Component
public class AlumnoH {

	protected Integer carcularDescuento() {

		System.out.println("Sin Descuento");
		return 0;
	}

	private String nombreA;
	private String direccionA;
	private String cedulaA;
	private String edadA;
	private String genero;
	private String jornada;

	protected String getNombreA() {
		return nombreA;
	}

	protected void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	protected String getDireccionA() {
		return direccionA;
	}

	protected void setDireccionA(String direccionA) {
		this.direccionA = direccionA;
	}

	protected String getCedulaA() {
		return cedulaA;
	}

	protected void setCedulaA(String cedulaA) {
		this.cedulaA = cedulaA;
	}

	protected String getEdadA() {
		return edadA;
	}

	protected void setEdadA(String edadA) {
		this.edadA = edadA;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected String getJornada() {
		return jornada;
	}

	protected void setJornada(String jornada) {
		this.jornada = jornada;
	}

	@Override
	public String toString() {
		return "Alumno [nombreA=" + nombreA + ", direccionA=" + direccionA + ", cedulaA=" + cedulaA + ", edadA=" + edadA
				+ ", genero=" + genero + ", jornada=" + jornada + "]";
	}

}
