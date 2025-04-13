///////////////////////////////////////////////////
//        Sistema de Controle de Estoque         //
///////////////////////////////////////////////////

//importar Array e lista
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    //Atributo
    private int proximoCodigo = 1;
    //Sacola que só aceita Produto
    private List<Produto> produtos;

    public Cadastro() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Scanner agent) {

        System.out.println("Nome do produto: ");
        String nomeProduto = agent.nextLine().toUpperCase();
        System.out.println("Preço do produto: ");
        String precoProdutoStr = agent.nextLine().replace(",", ".");
        double preco = Double.parseDouble(precoProdutoStr);

        int codigo = proximoCodigo++;

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(agent.nextLine());

        Produto produto = new Produto(nomeProduto, preco, quantidade, codigo);

        produtos.add(produto);
    
        System.out.println("Produto adicionado com sucesso!");

    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        int codigo = proximoCodigo++; // atributo da classe
        Produto produto = new Produto(nome, preco, quantidade, codigo);
        produtos.add(produto);
    }
    

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public void removerProduto(Scanner agent) {
        System.out.print("Digite o nome do produto pra remover: ");
        String nomeBuscado = agent.nextLine().toUpperCase().replace(" ", "-");
    
        if (produtos.removeIf(p -> p.getNome().equals(nomeBuscado))) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    

    public void removerProduto(String nome) {
        produtos.removeIf(p -> p.getNome().equals(nome));
    }

    public void removerProduto(int codigo) {
        produtos.removeIf(p -> p.getCodigo() == codigo);
    }

    public void buscarProduto(Scanner agent) {
        System.out.print("Buscar por (1) Nome ou (2) Código: ");
        String escolha = agent.nextLine();
    
        if (escolha.equals("1")) {
            System.out.print("Digite o nome do produto: ");
            String nome = agent.nextLine().toUpperCase().replace(" ", "-");
            for (Produto p : produtos) {
                if (p.getNome().equals(nome)) {
                    System.out.println("Produto encontrado:");
                    System.out.println(p);
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        } else if (escolha.equals("2")) {
            System.out.print("Digite o código do produto: ");
            int codigo = Integer.parseInt(agent.nextLine());
            for (Produto p : produtos) {
                if (p.getCodigo() == codigo) {
                    System.out.println("Produto encontrado:");
                    System.out.println(p);
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        } else {
            System.out.println("Opção inválida, cowboy!");
        }
    }
    
    
    
    
    

    
}
