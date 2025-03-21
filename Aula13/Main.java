package Aula13;

public class Main {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero(50, 5, 4, "Marrom");

        m1.emitirSom();

        Lobo l1 = new Lobo(45, 7, 4, "White");

        l1.emitirSom();

        Cachorro c1 = new Cachorro(25, 2, 4, "Caramelo");
        c1.reagir("Olá");
        c1.reagir("Baum?!");

        c1.reagir(11, 0);
        c1.reagir(14, 0);
        c1.reagir(21, 0);

        c1.reagir(true);
        c1.reagir(false);

    }

}
