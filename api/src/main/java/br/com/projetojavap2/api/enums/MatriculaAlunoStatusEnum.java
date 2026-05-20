package br.com.projetojavap2.api.enums;

public enum MatriculaAlunoStatusEnum {
    MATRICULADO,   // Estado inicial
    APROVADO,      // Média >= 7.0
    REPROVADO,     // Média < 7.0
    TRANCADO;      // Matrícula trancada
}