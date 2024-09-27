package com.curso.service;

import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursoDao.CursoDao;
import com.curso.model.Curso;
@Service
public class CursosServiceImpl implements CursosService {
	@Autowired 
	CursoDao dao;
	
	@Override
	public List<Curso> cursos() {
		return dao.findAll();
				
	}

	@Override
	public void altaCurso(Curso curso) {
		dao.save(curso);

	}

	@Override
	public void actualizarCurso(Curso curso) {
		dao.save(curso);

	}
	public void actualizarCurso(String codCurso, int duracion) {
	    
	/*    Optional<Curso> cursoOptional = dao.findById(codCurso);
	    
	    if (cursoOptional.isPresent()) {
	        
	        Curso cursoExistente = cursoOptional.get();
	        cursoExistente.setDuracion(duracion);
	        */
	     Curso cursoExistente=  buscarCurso(codCurso);
	     cursoExistente.setDuracion(duracion);
	        dao.save(cursoExistente);
	    }
	   
	
	public List<Curso> buscarPrecio(int minPrecio, int maxPrecio) {
	    return dao.findAll() 
	              .stream()
	              .filter(curso -> curso.getPrecio() >= minPrecio && curso.getPrecio() <= maxPrecio) 
	              .collect(Collectors.toList());
	}

	


	@Override
	public List<Curso> eliminarCurso(String codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public Curso buscarCurso(String codCurso) {
		return dao.findById(codCurso).orElse(null);
	}

}
