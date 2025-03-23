package Aula07;

public class Atleta implements Lutador {
    protected String nome;
    protected String nacionalidade;
    protected int idade;
    protected float altura;
    protected int peso;
    protected String categoria;
    protected int vitorias;
    protected int derrotas;
    protected int empates;

    // Constructor
    public Atleta(String nome, String nacionalidade, int idade, float altura, int peso, int vitorias,
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setCategoria();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    // Setters
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected void setAltura(float altura) {
        this.altura = altura;
    }

    protected void setPeso(int peso) {
        this.peso = peso;
        this.setCategoria();
    }

    protected void setCategoria() {
        if (this.peso <= 70) {
            this.categoria = "Leve";
        } else if (this.peso <= 80) {
            this.categoria = "Médio";
        } else {
            this.categoria = "Pesado";
        }
    }

    protected void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    protected void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    protected void setEmpates(int empates) {
        this.empates = empates;
    }

    // Others
    public void apresentar() {
        System.out.println("Diretamente dx: " + getNacionalidade());
        System.out.println("Aqui está ele: " + getNome());
        System.out.println("Com: " + getIdade() + " anos");
        System.out.println("Medindo: " + getAltura() + "m");
        System.out.println("Pesando: " + getPeso() + "kg");
        this.status();

    }
    
    public void apresentarLutador() {
        System.out.println(getNome());
        System.out.println("Diretamente dx: " + getNacionalidade());
        System.out.println("Com: " + getIdade() + " anos");
        System.out.println("Medindo: " + getAltura() + "m");
        System.out.println("Pesando: " + getPeso() + "kg");
        this.status();
        System.out.println("Boa sorte " + getNome() + "!!!");

    }

    public void status() {
        System.out.println(getNome() + " tem " + getVitorias() + " vitórias, " + getDerrotas() + " derrotas e "
                + getEmpates() + " empates.");
    }

    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;
    }

}
