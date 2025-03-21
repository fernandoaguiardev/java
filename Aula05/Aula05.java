package Aula05;

public class Aula05 {

    public static void main(String[] args) {
        // Criando a primeira conta (Conta Corrente de Maria Instância)
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta(1, "CC", "Maria Instância", 1000f);

        // Criando a segunda conta (Conta Poupança de João Objecto)
        ContaBanco c2 = new ContaBanco();
        c2.abrirConta(2, "CP", "João Objecto", 1000f);

        // Exibindo o status das contas antes da operação de PIX
        System.out.println("Antes da operação de PIX:");
        c1.status();
        c2.status();

        // Realizando o PIX da conta c2 (João Objecto) para a conta c1 (Maria Instância)
        c2.fazerPix(c1, 150f);

        // Exibindo o status das contas após a operação de PIX
        System.out.println("\nApós a operação de PIX:");
        c1.status();
        c2.status();
    }
}
