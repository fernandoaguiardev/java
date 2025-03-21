package Aula12;

public class Reptil extends Animal {

    @Override
    public void alimentarSe() {
        System.out.println("\n🐍 Comendo pequenos animais... 🍖");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n🦎 SsssSssSss... 🐍");
    }

    @Override
    public void locomoverSe() {
        System.out.println("\n🐍 Rastejando... 🐍");
    }

    public void trocarPele() {
        System.out.println("\n🦎 Trocando de pele... 🐍");
    }
}
