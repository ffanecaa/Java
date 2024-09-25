package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
	@Id
  private  String codCurso;
  private  String nombre;
  private int duracion ;
  private  int precio ;
  
public Curso(String codCurso, String nombre, int duracion, int precio) {
	super();
	codCurso = codCurso;
	this.nombre = nombre;
	this.duracion = duracion;
	this.precio = precio;
}
public Curso() {
	super();
}
public String getCodCurso() {
	return codCurso;
}
public void setCodCurso(String codCurso) {
	codCurso = codCurso;
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
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
  
  
  
  
  
  
  
}
