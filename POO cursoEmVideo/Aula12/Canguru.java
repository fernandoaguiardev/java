package Aula12;

public final class Canguru extends Mamifero {

    public boolean bolsaVazia = true;

    @Override
    public final void locomoverSe() {
        System.out.println("\n🦘 Pulando, pulando alto, pulando perto, pulando longe... 🏃‍♂️");
    }

    public final void usarBolsa() {
        bolsaVazia = false;
        System.out.println("\n🦘 Carregando filhote na bolsa... 🤱");
    }
}
