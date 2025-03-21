package Aula11;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    // Constructor

    public Pessoa(String nome, int idade, String sexo) {

        this.nome = nome; // Atribuição direta
        this.idade = idade; // Atribuição direta
        this.sexo = sexo; // Atribuição direta
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Método final que não pode ser sobrescrito
    public final void fazerAniversario() {
        this.idade++; // Incrementa a idade
        System.out.println("Feliz Aniversário, " + nome + "! Agora você tem " + idade + " anos.");
    }
}
