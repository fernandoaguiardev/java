package Aula12;

public class Ave extends Animal {

    @Override
    public void alimentarSe() {
        System.out.println("\n🌿 Comendo sementes e insetos... 🌿");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n🎶 Canto de ave: Pi-pi-pi! 🎶");
    }

    @Override
    public void locomoverSe() {
        System.out.println("\n✈️ Voando alto no céu! ✈️");
    }

    public void afiarBico() {
        System.out.println("\n🪶 Afiando o bico... 🪶");
    }
}
