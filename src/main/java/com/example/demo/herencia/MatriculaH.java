package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MatriculaH {
	
	 private String numeroM;
	 private LocalDateTime fechaM;
	 private RepresentanteH representanteH;
	 private AlumnoH alumnoh;

	 public void matricular (String numeroM , 
			 				 LocalDateTime fechaM,
			 				 AlumnoH alumnoh,
			 				RepresentanteH representante
			 				 ) {
		 
		 this.numeroM = numeroM;
		 this.fechaM = LocalDateTime.now();
		 
		 Integer valorDescuento = alumnoh.carcularDescuento();
		System.out.println("Valor " + valorDescuento);
		
		this.representanteH = representante;
		
		this.guardadMatricula(this);
		
	 }
	 
	 private void guardadMatricula(MatriculaH matriculah) {
		 
		 System.out.println(matriculah);
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

	public RepresentanteH getRepresentanteH() {
		return representanteH;
	}

	public void setRepresentanteH(RepresentanteH representanteH) {
		this.representanteH = representanteH;
	}

	public AlumnoH getAlumnoh() {
		return alumnoh;
	}

	public void setAlumnoh(AlumnoH alumnoh) {
		this.alumnoh = alumnoh;
	}

	@Override
	public String toString() {
		return "MatriculaH [numeroM=" + numeroM + ", fechaM=" + fechaM + ", representanteH=" + representanteH
				+ ", alumnoh=" + alumnoh + "]";
	}
	 
	 



}
