package br.com.projetojavap2.api.repository;
import br.com.projetojavap2.api.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findByProfessorId(Long professorId);
}


