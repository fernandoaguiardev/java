//importar Array e lista
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    //Atributo
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

    public void adicionarProduto() {
        Scanner agent = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String nomeProduto = agent.nextLine().toUpperCase();
        System.out.println("Preço do produto: ");
        String precoProdutoStr = agent.nextLine().replace(",", ".");
        double preco = Double.parseDouble(precoProdutoStr);

        Produto produto = new Produto(nomeProduto, preco);
        produtos.add(produto);
    
        System.out.println("Produto adicionado com sucesso!");

    }

    
}
