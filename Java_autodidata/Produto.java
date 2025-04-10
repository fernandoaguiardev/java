public class Produto {
    private String nome;
    private double preco;
    private int codigo;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    // Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Cód: " + codigo + " | " + nome + " | R$ " + preco + " | Qtd: " + quantidade;
    }
}
