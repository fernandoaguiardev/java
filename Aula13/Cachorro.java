package Aula13;

public class Cachorro extends Lobo {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Auau!");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanando...");
            this.emitirSom();   
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanando");
            this.emitirSom();
        } else if (hora < 18) {
            System.out.println("Abanando...");
        } else {
            System.out.println("Iguinorando...");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            emitirSom();
            System.out.println("Sendo bom cachorro...");
        } else {
            System.out.println("Rosnando...");
            System.out.println("Correndo atrás...");
            System.out.println("Mordendo...");
            System.out.println("Sendo cão bravo...");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade >= 10) {
            System.out.println("Interaginfo de vagarzinho...");
            
        } else {
            this.emitirSom();
            
        }
    }
}
