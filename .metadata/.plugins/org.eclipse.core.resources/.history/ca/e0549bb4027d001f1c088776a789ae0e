package com.curso.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursosService;

@RestController
public class CursosController {

	@Autowired
	 CursosService service;
	
	@GetMapping(value="cursos",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso>cursos(){
		return service.cursos();
	}
	
	@PostMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregar(@RequestBody Curso curso) {
		service.altaCurso(curso);
	}
	
	@PutMapping(value="cursos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Curso curso) {
		service.actualizarCurso(curso);
	}
	@PutMapping(value = "cursos/{codCurso}/{duracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@PathVariable("codCurso") String codCurso, @PathVariable("duracion") int duracion) {
	    service.actualizarCurso(codCurso, duracion);
	}

	@DeleteMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	
	public List<Curso>eliminar(@PathVariable("codCurso")String codCurso){
		return service.eliminarCurso(codCurso);
	}
	
	
	
	
	
	
	
	
	
	
}
