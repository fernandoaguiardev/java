package Aula10;

public class Pessoa {

    // Properties (Atributos da classe)
    private String nome; // Nome da pessoa
    private int idade;   // Idade da pessoa
    private String sexo; // Sexo da pessoa

    // Constructor (Construtor da classe para inicializar os atributos)
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;  // Inicializa o nome
        this.idade = idade; // Inicializa a idade
        this.sexo = sexo;  // Inicializa o sexo
    }

    // Special Methods (Métodos especiais de acesso aos atributos)
    public String getNome() {
        return nome; // Retorna o nome
    }

    public void setNome(String nome) {
        this.nome = nome; // Define o nome
    }

    public int getIdade() {
        return idade; // Retorna a idade
    }

    public void setIdade(int idade) {
        this.idade = idade; // Define a idade
    }

    public String getSexo() {
        return sexo; // Retorna o sexo
    }

    public void setSexo(String sexo) {
        this.sexo = sexo; // Define o sexo
    }

    // Methods (Métodos que realizam ações relacionadas à pessoa)
    public void fazerAniversario() {
        this.setIdade(idade + 1); // Incrementa a idade da pessoa em 1 ao fazer aniversário
    }
}
