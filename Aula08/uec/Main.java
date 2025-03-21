package Aula08.uec;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       
        
        // Criando um array de Atleta com 6 atletas
        Atleta[] atletas = new Atleta[6];
        atletas[0] = new Atleta("Pretty Boy", "França", 31, 1.75f, 69, 11, 2, 1);
        atletas[1] = new Atleta("Putscripts", "Brasil", 29, 1.68f, 58, 14, 2, 3);
        atletas[2] = new Atleta("Snapshadow", "EUA", 35, 1.65f, 81, 12, 2, 1);
        atletas[3] = new Atleta("Dead Code", "Austrália", 28, 1.93f, 82, 13, 0, 2);
        atletas[4] = new Atleta("Ufocobol", "Marte", 37, 1.70f, 119, 5, 4, 3);
        atletas[5] = new Atleta("Nerdaard", "EUA", 30, 1.81f, 106, 12, 2, 4);
        
        // Sorteando os lutadores
        Random rand = new Random();
        int index1 = rand.nextInt(atletas.length);
        int index2;
        do {
            index2 = rand.nextInt(atletas.length);
        } while (index1 == index2); // Evitar lutar contra si mesmo

        // Criando e iniciando a luta
        Luta luta = new Luta(atletas[index1], atletas[index2]);
        luta.lutar();

    }
}