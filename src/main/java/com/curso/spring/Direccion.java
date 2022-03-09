package com.curso.spring;

public class Direccion {
	
	private String callePrincipal;
	private  int numeroCasa;
	
	public Direccion(String callePrincipal, int numeroCasa) {
		this.callePrincipal = callePrincipal;
		this.numeroCasa = numeroCasa;
	}

	public Direccion() {}
	
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	@Override
	public String toString() {
		return "Direccion [callePrincipal=" + callePrincipal + ", numeroCasa=" + numeroCasa + "]";
	}
}
