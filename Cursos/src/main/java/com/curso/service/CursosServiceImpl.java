package com.curso.service;

import java.util.List;


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

	@Override
	public List<Curso> eliminarCurso(String codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public Curso buscarCurso(String codCurso) {
		// TODO Auto-generated method stub
		return null;
	}

}