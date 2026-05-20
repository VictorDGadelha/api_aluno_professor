package br.com.projetojavap2.api.controller;

import br.com.projetojavap2.api.model.Disciplina;
import br.com.projetojavap2.api.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDisciplina(@RequestBody Disciplina disciplina) {
        disciplinaService.criarDisciplina(disciplina);
    }
    @GetMapping("/professor/{professorId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Disciplina> listarDisciplinaDoProfessor(
            @PathVariable Long professorId) {
        return disciplinaService.listarDisciplinaDoProfessor(professorId);
    }
}
