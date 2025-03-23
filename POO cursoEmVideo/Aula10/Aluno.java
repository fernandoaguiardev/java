package Aula10;

public class Aluno extends Pessoa {

    // Properties (Atributos da classe)
    private int matricula; // Número de matrícula do aluno
    private String curso;  // Curso ao qual o aluno está matriculado

    // Constructor (Construtor da classe Aluno)
    // Chama o construtor da classe Pessoa (super) e inicializa os atributos de Aluno
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo); // Inicializa os atributos herdados de Pessoa
        this.matricula = matricula; // Inicializa a matrícula
        this.curso = curso; // Inicializa o curso
    }

    // Getters and Setters (Métodos especiais de acesso aos atributos)
    public int getMatricula() {
        return matricula; // Retorna o número de matrícula
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula; // Define o número de matrícula
    }

    public String getCurso() {
        return curso; // Retorna o curso
    }

    public void setCurso(String curso) {
        this.curso = curso; // Define o curso
    }

    // Outros Métodos
    // Método para cancelar a matrícula do aluno
    public void cancelarMatricula() {
        // Lógica para cancelar matrícula (a ser implementada)
        System.out.println("Matrícula do aluno " + getNome() + " cancelada.");
    }
}
