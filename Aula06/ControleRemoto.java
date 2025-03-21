package Aula06;

public class ControleRemoto implements Controlador {

    private boolean ligado;
    private int volume;
    private boolean tocando;

    public ControleRemoto() {
        this.ligado = false;
        this.volume = 50;
        this.tocando = false;
    }

    // Getters
    public boolean isLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    // Setters
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligado!");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        System.out.println("Desligado!");
    }

    @Override
    public void aumentarVolume() {
        if (ligado && volume < 100) {
            setVolume(volume + 10);
            System.out.println("Volume aumentado para " + getVolume());
            exibirBarraDeVolume();
        } else {
            System.out.println("Erro: Não é possível aumentar o volume.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado && volume > 0) {
            setVolume(volume - 10);
            System.out.println("Volume diminuído para " + getVolume());
            exibirBarraDeVolume();
        } else {
            System.out.println("Erro: Não é possível diminuir o volume.");
        }
    }

    @Override
    public void play() {
        if (ligado && !tocando) {
            setTocando(true);
            System.out.println("Reprodução iniciada!");
        } else {
            System.out.println("Erro: Não é possível reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (ligado && tocando) {
            setTocando(false);
            System.out.println("Reprodução pausada!");
        } else {
            System.out.println("Erro: Nada está tocando.");
        }
    }

    // Método para exibir a barra de volume
    private void exibirBarraDeVolume() {
        System.out.print("Volume: [");
        for (int i = 0; i < getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("] (" + getVolume() + ")");
    }
}
