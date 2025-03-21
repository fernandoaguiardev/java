package Aula12;

public class Main {
    public static void main(String[] args) {
        
        // Criando objetos das subclasses
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c1 = new Canguru();

        // Alimentação dos animais
        System.out.println("Alimentando...");
        m1.alimentarSe();
        r1.alimentarSe();
        p1.alimentarSe();
        a1.alimentarSe();
        c1.alimentarSe();
        
        // Emissão de som dos animais
        System.out.println("\nEmitindo som...");
        m1.emitirSom();
        r1.emitirSom();
        p1.emitirSom();
        a1.emitirSom();
        c1.emitirSom();
        
        // Locomoção dos animais
        System.out.println("\nLocomovendo-se...");
        m1.locomoverSe();
        r1.locomoverSe();
        p1.locomoverSe();
        a1.locomoverSe();
        c1.locomoverSe();
        
        // Ações específicas de cada tipo de animal
        System.out.println("\nAções específicas...");
        m1.darALuz();     // Mamífero
        r1.trocarPele();  // Réptil
        p1.soltarBolha(); // Peixe
        a1.afiarBico();   // Ave
        c1.usarBolsa();   // Canguru (Mamífero)
    }
}
