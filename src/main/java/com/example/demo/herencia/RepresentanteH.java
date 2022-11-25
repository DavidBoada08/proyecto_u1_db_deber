package com.example.demo.herencia;

public class RepresentanteH {
	
	private String nombreR;
	private String cedulaR;
	
	public String getNombreR() {
		return nombreR;
	}
	public void setNombreR(String nombreR) {
		this.nombreR = nombreR;
	}
	public String getCedulaR() {
		return cedulaR;
	}
	public void setCedulaR(String cedulaR) {
		this.cedulaR = cedulaR;
	}
	@Override
	public String toString() {
		return "Representante [nombreR=" + nombreR + ", cedulaR=" + cedulaR + "]";
	}


}
