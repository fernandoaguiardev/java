package Aula09;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    // Métodos de manipulação do livro
    public void abrir() {
        aberto = true;
        System.out.println("O livro foi aberto.");
    }

    public void fechar() {
        aberto = false;
        System.out.println("O livro foi fechado.");
    }

    public void folhear(int p) {
        this.paginaAtual = p;
        System.out.println("Folheando o livro, página: "+ getPaginaAtual());
    }

    public void nextPage() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void previousPage() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    //others
    public String detalhes() {
        return "Livro{" +
               "titulo= '" + getTitulo() + "', " +
               "autor= '" + getAutor() + "', " +
               "totalPaginas= " + getTotalPaginas() + ", " +
               "paginaAtual= " + getPaginaAtual() + ", " +
               "aberto= " + (isAberto() ? "Sim" : "Não") + ", " +
               "leitor= " + (getLeitor() != null ? getLeitor().getNome() : "Nenhum") +
               "}";
    }

}
    