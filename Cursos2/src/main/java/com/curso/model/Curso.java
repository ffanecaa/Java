package com.curso.model;

import java.math.BigDecimal;

public class Curso {
	 private  String codCurso;
	  private  String nombre;
	  private int duracion ;
	  private  BigDecimal precio ;
	public Curso() {
		super();
	}
	public String getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	  
	  
	  
	  
	  
	}
