package Aula04;

public class Caneta {
    /*
     * 🔒 Modificadores de Acesso:
     * - public: pode ser acessado de qualquer lugar.
     * - private: só pode ser acessado dentro da própria classe.
     * - protected: pode ser acessado na própria classe e em subclasses.
     */

    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    /*
     * Métodos Acessores
     * Método get: Quando formos acessar, “pegar” alguns atributos da classe,
     * devemos utilizar os métodos GET. Esse método sempre retornará um valor, seja
     * ele String, int ,double etc.
     */

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public int getCarga() {
        return this.carga;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    /*
     * Métodos Modificadores
     * Método set: Para alterarmos, modificarmos os valores de um atributo da classe
     * de maneira protegida, utilizamos os métodos SET. Esse método não terá um
     * retorno, pois o atributo será somente modificado, criando um método de tipo
     * VOID, sem retorno.
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    /*
     * Método Construtor
     * O construtor é normalmente utilizado para fornecer valores iniciais para
     * variáveis de instâncias definidas pela classe ou uma forma de inicialização
     * de um objeto já formado, ou seja, um construtor inicializa um objeto.
     */

    // 🔹 Construtor SEM parâmetros (valores padrão)
    public Caneta() {
        this.modelo = "Genérica";
        this.cor = "Preta";
        this.ponta = 1.0f;
        this.carga = 50;
        this.tampada = true;
    }

    // 🔹 Construtor COM parâmetros
    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Está tampada? " + (this.isTampada() ? "Sim" : "Não"));
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
    }
}
