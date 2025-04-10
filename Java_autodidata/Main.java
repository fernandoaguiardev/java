import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner agent = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        while (true) {
            System.out.println("\n=========================");
            System.out.println("*         MENU          *");
            System.out.println("=========================");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            String opcao = agent.nextLine();

            switch (opcao) {
                case "1":
                    cadastro.adicionarProduto(agent);
                    break;
                case "2":
                    cadastro.listarProdutos();
                    break;
                case "3":
                    cadastro.buscarProduto(agent); // a gente implementa esse se ainda não tiver
                    break;
                case "4":
                    cadastro.removerProduto(agent);
                    break;
                case "0":
                    System.out.println("Encerrando o sistema... até mais, cowboy!");
                    agent.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
