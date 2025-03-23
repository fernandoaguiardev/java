package Aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.ligar();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.desligar();
    }
}
