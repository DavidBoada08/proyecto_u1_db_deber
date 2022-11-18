package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matricula ma = new Matricula();
		//ma.matricular("00312", LocalDateTime.of(2022,12,2,8,30), null, null, null, null, null, null, null, null);
		ma.matricular("000314",
				LocalDateTime.of(2022,12,2,8,30), 
				"David Boada", 
				"1720030723", 
				"Clare Boada", 
				"Los dos puentes", 
				"1320236547", 
				"10",
				"F", 
				"matutina");

	}

}
