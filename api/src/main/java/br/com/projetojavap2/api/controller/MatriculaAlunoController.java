package br.com.projetojavap2.api.controller;

import br.com.projetojavap2.api.model.MatriculaAluno;
import br.com.projetojavap2.api.service.MatriculaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class MatriculaAlunoController {

    @Autowired
    MatriculaAlunoService matriculaAlunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarMatricula(@RequestBody MatriculaAluno m) {
        matriculaAlunoService.criarMatricula(m);
    }
}