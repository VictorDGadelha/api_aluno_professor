package br.com.projetojavap2.api.service;
import br.com.projetojavap2.api.model.Disciplina;
import br.com.projetojavap2.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarDisciplinaDoProfessor(Long professorId) {
        return disciplinaRepository.findByProfessorId(professorId);
    }
}
