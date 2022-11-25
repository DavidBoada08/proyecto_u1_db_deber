package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.SpringBoot.AlumnoSB;
import com.example.demo.SpringBoot.MatriculaSB;
import com.example.demo.SpringBoot.NiniaSB;
import com.example.demo.SpringBoot.NinioSB;
import com.example.demo.SpringBoot.RepresentanteSB;

@SpringBootApplication
public class ProyectoU1DbDeberApplication implements CommandLineRunner {
	
	@Autowired
	private NinioSB ninioSB;
	
	
	@Autowired
	private MatriculaSB matriculaSB;
	
	@Autowired
	private RepresentanteSB representanteSB;

	@Autowired
	private AlumnoSB alumnoSB;
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DbDeberApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Spring Boot");
		
		this.alumnoSB.setCedulaA("123456789");
		this.alumnoSB.setDireccionA("General");
		this.alumnoSB.setEdadA("12");
		this.alumnoSB.setGenero("f");
		this.alumnoSB.setJornada("Matutino");
		this.alumnoSB.setNombreA("Clare Boada");
		
		
		System.out.println(alumnoSB);
		
		matriculaSB.matricular("123123", LocalDateTime.of(2022,12,2,8,30), alumnoSB, representanteSB);
		
		
		
	}

}
