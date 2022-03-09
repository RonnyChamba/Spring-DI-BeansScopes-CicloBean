package com.curso.spring;

import java.util.List;

public class Persona {

	private int edad;
	private  boolean isCasado;
	private double sueldo;
	private Direccion direccion;
	private Profesion profesion;
	private List<String> telefonos;
	
	public Persona(int edad, Direccion direccion, Profesion profesion) {
		
		this.edad = edad;
		this.direccion = direccion;	
		this.profesion = profesion;
	}
	
	//public Persona() {}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return isCasado;
	}
	public void setCasado(boolean isCasado) {
		this.isCasado = isCasado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Direccion getDireccion() {
		return direccion;
	}

	public Profesion getProfesion() {
		return profesion;
	}
	public List<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<String> telefonos) {
		this.telefonos = telefonos;
	}
		
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", isCasado=" + isCasado + ", sueldo=" + sueldo
				+ ", telefonos=" + telefonos;
	}
	
	public void verInformacion() {
		
		System.out.println(this.toString());
		System.out.println(direccion.toString());
		profesion.tipo();
	}
}
