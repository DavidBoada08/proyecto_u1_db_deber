package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlumnoH alumnoH = new AlumnoH();
		
		alumnoH.setCedulaA("12345789");
		alumnoH.setDireccionA("Necochea");
		alumnoH.setEdadA("15");
		alumnoH.setGenero("F");
		alumnoH.setJornada("Matutino");
		alumnoH.setNombreA("Clare Boada");
		
		RepresentanteH representateH = new RepresentanteH();
		representateH.setCedulaR("1720030723");
		representateH.setNombreR("David Boada");
		
		MatriculaH matriculaH = new MatriculaH();
		matriculaH.matricular("123123", LocalDateTime.of(2022, 12, 2, 8, 30), alumnoH, representateH);

	}

}
