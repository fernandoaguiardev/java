package Aula03;

public class Aula03 {

    public static void main(String[] args) {
      
        Caneta c1 = new Caneta("Bic Crystal", "Azul", 0.9f, 75, true);
        Caneta c2 = new Caneta();
        
        System.out.println("Caneta 1:");
        c1.status();
        
        System.out.println("\nCaneta 2:");
        c2.status();

    }

}
