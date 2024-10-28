package com.curso.model;

import java.math.BigDecimal;

public class Formacion {
   private String curso;
   private int asignaturas ;
   private BigDecimal precio;
   
   public Formacion(String curso, int asignaturas, BigDecimal precio) {
		super();
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}
	public Formacion() {
		super();
	}
   
   
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public int getAsignaturas() {
	return asignaturas;
}
public void setAsignaturas(int asignaturas) {
	this.asignaturas = asignaturas;
}
public BigDecimal getPrecio() {
	return precio;
}
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}

   
   
   
   
   
   
   
   
   
   
   
   
   
}
