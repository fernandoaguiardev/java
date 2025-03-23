package Aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status() {
        System.out.println("Qual o modelo da caneta? " + this.modelo);
        System.out.println("Qual a cor da caneta? " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual a ponta? " + this.ponta);
        System.out.println("Qual o nível da carga? " + this.carga);

    }

    void rabiscar() {
        if (this.tampada == true || this.carga == 0) {
            System.out.println("ERRO! Não é possível rabiscar");

        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar() {
        this.tampada = true;

    }

    void destampar() {
        this.tampada = false;

    }

    void recarregar() {
        this.carga += 100;
    }

}
