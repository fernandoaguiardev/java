package Aula05;

public class ContaBanco {

    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Construtor padrão
    public ContaBanco() {
        this.numConta = -1;
        this.tipo = "";
        this.dono = "";
        this.saldo = 0f;
        this.status = false;
    }
    
    // Método para abrir a conta
    public void abrirConta(int numConta, String tipo, String dono, float saldo) {
        this.setNumConta(numConta);
        this.setTipo(tipo);
        this.setDono(dono);
        this.setSaldo(saldo);
        this.setStatus(true);
    }

    // Método para abrir conta sem parâmetros
    public void abrirConta() {
        this.setStatus(true);
    }

    // Método para fechar a conta
    public void fecharConta() {
        if (this.status && this.saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else if (this.getSaldo() != 0) {
            System.out.println("Não é possível fechar a conta com saldo não zerado.");
        } else {
            System.out.println("A conta já está fechada.");
        }
    }

    // Método para depositar valor na conta
    public void depositar(float valor) {
        if (this.getStatus() && valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Erro: Conta inativa ou valor de depósito inválido.");
        }
    }

    // Método para sacar valor da conta
    public void sacar(float valor) {
        if (this.getStatus() && valor <= this.getSaldo() && valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + this.getSaldo());
        } else if (valor > this.getSaldo()) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            System.out.println("Erro: Conta inativa ou valor de saque inválido.");
        }
    }

    // Método para receber um PIX
    public void receberPix(float valor) {
        if (this.getStatus() && valor > 0) {
            this.saldo += valor;
            System.out.println("Recebimento de PIX realizado com sucesso! Novo saldo: R$ " + this.getSaldo());
        } else {
            System.out.println("Erro: Conta inativa ou valor inválido.");
        }
    }

    // Método para realizar um PIX
    public void fazerPix(ContaBanco destinatario, float valor) {
        if (this.getStatus() && destinatario.getStatus() && valor > 0 && valor <= this.getSaldo()) {
            this.saldo -= valor;
            destinatario.receberPix(valor);
            System.out.println("PIX enviado com sucesso! Seu novo saldo: R$ " + this.getSaldo());
        } else if (!this.getStatus()) {
            System.out.println("Erro: Sua conta está inativa.");
        } else if (!destinatario.getStatus()) {
            System.out.println("Erro: Conta destinatária inativa.");
        } else if (valor > this.getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para o PIX.");
        } else {
            System.out.println("Erro: Valor inválido.");
        }
    }

    // Método para imprimir o status da conta
    public void status() {
        System.out.println("======================================");
        System.out.println("Status da Conta");
        System.out.println("======================================");
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Tipo de Conta: " + this.tipo);
        System.out.println("Dono da Conta: " + this.dono);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Status da Conta: " + (this.status ? "Aberta" : "Fechada"));
        System.out.println("======================================");
    }
}
