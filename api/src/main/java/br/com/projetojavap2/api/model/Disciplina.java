package br.com.projetojavap2.api.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "disciplina")
@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
