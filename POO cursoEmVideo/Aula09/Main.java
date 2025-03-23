package Aula09;

public class Main {
    public static void main(String[] args) {

        // Criando pessoas
        Pessoa[] pessoa = new Pessoa[3];
        
        pessoa[0] = new Pessoa("João", 25, "Masculino");
        pessoa[1] = new Pessoa("Maria", 21, "Feminino");
        pessoa[2] = new Pessoa("Paulo", 28, "Masculino");

        // Criando livros
        Livro[] livro = new Livro[3];

        livro[0] = new Livro("1984", "George Orwell", 328, pessoa[0]);
        livro[1] = new Livro("O Mínimo que Você Precisa Saber para Não Ser um Idiota", "Olavo de Carvalho", 616, pessoa[1]);
        livro[2] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000, pessoa[2]);

        // Exibindo detalhes dos livros
        for (int i = 0; i < livro.length; i++) {
            System.out.println(livro[i].detalhes());
        }
    }
}
