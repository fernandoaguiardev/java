package Aula14;

public class Visualizacao {

    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    public void avaliar() {
        this.video.setAvaliacao(10);
    }

    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int avaliacao;
        if (porc <= 20) {
            avaliacao = 3;
        } else if (porc <= 50) {
            avaliacao = 5;
        } else if (porc <= 80) {
            avaliacao = 7;
        } else {
            avaliacao = 10;
        }
        this.video.setAvaliacao(avaliacao);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
