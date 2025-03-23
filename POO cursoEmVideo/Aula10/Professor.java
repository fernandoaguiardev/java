package Aula10;

public class Professor extends Pessoa {

    // Properties (Atributos da classe)
    private String especialidade; // Especialidade do professor (ex: Matemática, História, etc.)
    private float salario;        // Salário do professor

    // Constructor (Construtor da classe Professor)
    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo); // Inicializa os atributos herdados de Pessoa
        this.especialidade = especialidade; // Inicializa a especialidade
        this.salario = salario; // Inicializa o salário
    }

    // Getters and Setters (Métodos especiais de acesso aos atributos)
    public String getEspecialidade() {
        return especialidade; // Retorna a especialidade do professor
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade; // Define a especialidade do professor
    }

    public float getSalario() {
        return salario; // Retorna o salário do professor
    }

    public void setSalario(float salario) {
        this.salario = salario; // Define o salário do professor
    }

    // Métodos adicionais
    // Método para aplicar aumento no salário do professor
    public void receberAumento(float aumento) {
        this.salario += aumento; // Aumenta o salário do professor pelo valor especificado
        System.out.println("Salário após aumento: " + this.salario);
    }
}
