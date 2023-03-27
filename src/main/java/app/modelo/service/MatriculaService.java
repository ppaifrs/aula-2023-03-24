package app.modelo.service;

import java.util.Optional;

import app.modelo.entidade.Aluno;
import app.modelo.entidade.Curso;
import app.modelo.entidade.Matricula;
import app.persistence.IAlunoRepository;
import app.persistence.ICursoRepository;


public class MatriculaService { // Use Case (Caso de Uso)

  private IAlunoRepository alunoRepository;
  private ICursoRepository cursoRepository;
  // private IMatriculaRepository matriculaRepository;
  

  // Transaction Script (Roteiro da Transação)
  // método com toda a lógica
     //  Output              // Input
  public Matricula matricular(String cpf, Integer codigoCurso) {
    
    Aluno aluno = alunoRepository.findByCpf(cpf)
      .orElseThrow(() -> new ServiceException("Aluno " + cpf + " não existe"));

    


  }
}


class CursoController { // /curso/matricular


  void matricular() {

  }
}