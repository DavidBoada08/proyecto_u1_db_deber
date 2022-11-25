package com.example.demo.SpringBoot;



import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component
public class MatriculaSB {
	
	 private String numeroM;
	 private LocalDateTime fechaM;
	 private RepresentanteSB representanteH;
	 private AlumnoSB alumnoh;

	 public void matricular (String numeroM , 
			 				 LocalDateTime fechaM,
			 				 AlumnoSB alumnoh,
			 				RepresentanteSB representante
			 				 ) {
		 
		 this.numeroM = numeroM;
		 this.fechaM = LocalDateTime.now();
		 
		 Integer valorDescuento = alumnoh.carcularDescuento();
		System.out.println("Valor " + valorDescuento);
		
		this.representanteH = representante;
		
		this.guardadMatricula(this);
		
	 }
	 
	 private void guardadMatricula(MatriculaSB matriculah) {
		 
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

	public RepresentanteSB getRepresentanteH() {
		return representanteH;
	}

	public void setRepresentanteH(RepresentanteSB representanteH) {
		this.representanteH = representanteH;
	}

	public AlumnoSB getAlumnoh() {
		return alumnoh;
	}

	public void setAlumnoh(AlumnoSB alumnoh) {
		this.alumnoh = alumnoh;
	}

	@Override
	public String toString() {
		return "MatriculaH [numeroM=" + numeroM + ", fechaM=" + fechaM + ", representanteH=" + representanteH
				+ ", alumnoh=" + alumnoh + "]";
	}
	 
	 



}
