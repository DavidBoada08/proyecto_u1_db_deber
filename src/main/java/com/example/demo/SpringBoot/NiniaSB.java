package com.example.demo.SpringBoot;

import org.springframework.stereotype.Component;

public class NiniaSB extends AlumnoSB {
	
	private String horario;
	
	public Integer carcularDescuento() {

		System.out.println("Alumno Niña beca del con el 20% de descuento");
		return 20;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "Ninia [horario=" + horario + "]";
	}
	
	

}
