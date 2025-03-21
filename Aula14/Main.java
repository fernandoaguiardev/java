package Aula14;

public class Main {
    public static void main(String[] args) {
        // Criando um array de Gafanhoto com 3 posições
        Gafanhoto[] g = new Gafanhoto[3];

        // Criando objetos Gafanhoto
        g[0] = new Gafanhoto("dev69", 0, "João", 14, 'M', 0);
        g[1] = new Gafanhoto("mary01012005", 0, "Maria", 20, 'F', 0);
        g[2] = new Gafanhoto("deadshadow99", 0, "unnamed", 35, 'M', 0);

        // Exibindo informações dos gafanhotos
        System.out.println("Gafanhotos Criados:");
        for (Gafanhoto gafanhoto : g) {
            System.out.println("Nickname: " + gafanhoto.getNickname() + " | Nome: " + gafanhoto.getNome() + 
                " | Idade: " + gafanhoto.getIdade() + " | Sexo: " + gafanhoto.getSexo() + 
                " | Total Assistido: " + gafanhoto.getTotAssistido());
        }

        System.out.println();

        // Criando um Array de Video com 3 posições
        Video[] video = new Video[3];

        // Criando objetos Video
        video[0] = new Video("POO em Java", 0, 0, 0, false); 
        video[1] = new Video("POO em PHP", 0, 0, 0, false); 
        video[2] = new Video("POO em Python", 0, 0, 0, false); 

        // Exibindo informações dos vídeos
        System.out.println("Vídeos Criados:");
        for (Video v : video) {
            System.out.println("Título: " + v.getTitulo() + " | Avaliação: " + v.getAvaliacao());
        }

        System.out.println();

        // Criando três visualizações
        Visualizacao vis1 = new Visualizacao(g[0], video[0]); // João assiste POO em Java
        Visualizacao vis2 = new Visualizacao(g[1], video[1]); // Maria assiste POO em PHP
        Visualizacao vis3 = new Visualizacao(g[2], video[2]); // Unnamed assiste POO em Python

        // Testando as avaliações
        System.out.println("Avaliando vídeos...");
        vis1.avaliar(10); 
        vis2.avaliar(85.0f); // Avaliação por porcentagem (deve cair no 10)
        vis3.avaliar(); // Avaliação padrão 5

        // Exibindo resultados das avaliações
        System.out.println("\nAvaliações após assistir:");
        for (Video v : video) {
            System.out.println("Avaliação de " + v.getTitulo() + ": " + v.getAvaliacao());
        }

        System.out.println();

        // Exibindo o total assistido dos gafanhotos após as visualizações
        System.out.println("Total de vídeos assistidos após visualizações:");
        for (Gafanhoto gafanhoto : g) {
            System.out.println(gafanhoto.getNome() + " assistiu " + gafanhoto.getTotAssistido() + " vídeos.");
        }
    }
}
