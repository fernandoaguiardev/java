package Aula10;

public class Funcionario extends Pessoa {

    // Properties (Atributos da classe)
    private String setor;          // Setor em que o funcionário trabalha (ex: RH, TI, Vendas)
    private boolean trabalhando;   // Indica se o funcionário está atualmente trabalhando

    // Constructor (Construtor da classe Funcionario)
    public Funcionario(String nome, int idade, String sexo, boolean trabalhando, String setor) {
        super(nome, idade, sexo); // Inicializa os atributos herdados de Pessoa
        this.trabalhando = trabalhando; // Inicializa o status de trabalho (se está trabalhando ou não)
        this.setor = setor; // Inicializa o setor do funcionário
    }
    
    // Getters and Setters (Métodos especiais de acesso aos atributos)
    public String getSetor() {
        return setor; // Retorna o setor do funcionário
    }
    
    public void setSetor(String setor) {
        this.setor = setor; // Define o setor do funcionário
    }
    
    public boolean isTrabalhando() {
        return trabalhando; // Retorna o status de trabalho (se o funcionário está trabalhando ou não)
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando; // Define o status de trabalho do funcionário
    }
    
    // Métodos adicionais
    // Método para alterar o status de trabalho do funcionário (entrando ou saindo do trabalho)
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando; // Inverte o estado de "trabalhando"
        String status = this.trabalhando ? "está trabalhando" : "não está trabalhando";
        System.out.println("O funcionário " + getNome() + " agora " + status + ".");
    }
}
