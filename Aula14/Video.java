package Aula14;

public class Video implements AcoesVideo {

    // Properties
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    
    public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.views = views;
        this.curtidas = curtidas;
        this.reproduzindo = reproduzindo;
    }

    // Implement Methods
    @Override
    public void receberLike() {
        this.curtidas += 1;
        System.out.println("Like recebido, likes: " + this.curtidas);
    }
    
    @Override
    public void pause() {
        if (!this.reproduzindo) {
            System.out.println("O video já está pausado.");
        } else {
            this.reproduzindo = false;
            System.out.println("Video pausado.");
        }
    }
    
    @Override
    public void play() {
        if (this.reproduzindo) {
            System.out.println("O video já está reproduzindo.");
        } else {
            this.reproduzindo = true;
            System.out.println("Reproduzindo.");
        }
    }

    // Special Methods
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = (this.avaliacao * this.views + avaliacao) / (this.views + 1);
        this.views++; // Incrementa as visualizações
    }
    
    public int getViews() {
        return views;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getCurtidas() {
        return curtidas;
    }
    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
}
