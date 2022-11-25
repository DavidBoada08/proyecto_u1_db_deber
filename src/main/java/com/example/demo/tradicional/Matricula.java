package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Matricula {
	
	 private String numeroM;
	 private LocalDateTime fechaM;
	 private Representante representante;
	 private Alumno alumno;

	 public void matricular (String numeroM , 
			 				 LocalDateTime fechaM,
			 				 String nombreR, 
			 				 String cedulaR,
			 				String nombreA,
			 				String direccionA,
			 				String cedulaA,
			 				String edadA,
			 				String genero,
			 				String jornada
			 				 ) {
		 
		 this.numeroM = numeroM;
		 this.fechaM = fechaM;
		 
		 Representante reprObj = new Representante();
		 reprObj.setNombreR(nombreR);
		 reprObj.setCedulaR(cedulaR);
		 
		 this.representante = reprObj;
		 
		 
		 if (genero.equals("H")) {
			 Ninio ninio =new Ninio();
			 ninio.setGenero("H");
			 
			 this.alumno = ninio;
			 
			 System.out.println("Masculino");
			 
		 }else {
			 Ninia ninia =new Ninia();
			 ninia.setGenero("F");
			 
			 this.alumno = ninia;
			 System.out.println("Femenino");
			
			 
		 }
		 this.alumno.setNombreA(nombreA);
		 this.alumno.setCedulaA(cedulaA);
		 this.alumno.setDireccionA(direccionA);
		 this.alumno.setEdadA(edadA);
		 this.alumno.setGenero(genero);
		 this.alumno.setJornada(jornada);
		 
		 this.guardarMatricula(this);
		 
	
	 }
	 
	 private void guardarMatricula(Matricula matricula) {
		 
		 System.out.println(matricula);
		 
	 }
	 
	 

	@Override
	public String toString() {
		return "Matricula [numeroM=" + numeroM + ", \nfechaM=" + fechaM + ", \nrepresentante=" + representante + ", alumno="
				+ alumno + "]";
	}

	public String getNumeroM() {
		return numeroM;
	}

	public void setNumeroM(String numeroM) {
		this.numeroM = numeroM;
	}

	public LocalDateTime getFechaM() {
		return fechaM;
	}

	public void setFechaM(LocalDateTime fechaM) {
		this.fechaM = fechaM;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	 
	 
	 

}
