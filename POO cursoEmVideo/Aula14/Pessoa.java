package Aula14;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;

    

    public Pessoa(String nome, int idade, char sexo, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }

    protected void ganharExp() {

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    

}
