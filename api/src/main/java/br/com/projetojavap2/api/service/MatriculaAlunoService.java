package br.com.projetojavap2.api.service;

import br.com.projetojavap2.api.enums.MatriculaAlunoStatusEnum;
import br.com.projetojavap2.api.model.MatriculaAluno;
import br.com.projetojavap2.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaAlunoRepository;

    public void criarMatricula(MatriculaAluno matriculaAluno) {
        matriculaAluno.setStatus(
                MatriculaAlunoStatusEnum.MATRICULADO);  // Status automático!
        matriculaAlunoRepository.save(matriculaAluno);
    }
}