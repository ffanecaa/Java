package com.curso.cursoDao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Curso;
public interface CursoDao   extends JpaRepository<Curso, String>{

	List<Curso> findByPrecioBetween(int minPrecio, int maxPrecio);
	
	
}
