package Aula12;

public class Peixe extends Animal {

    @Override
    public void alimentarSe() {
        System.out.println(
                "\n🐟 Comendo minhoca... 🪱");
    }

    @Override
    public void emitirSom() {
        System.out.println(
                "\n🐠 Glub glub... 💧");
    }

    @Override
    public void locomoverSe() {
        System.out.println(
                "\n🐟 Nadando graciosamente... 🌊");
    }

    public void soltarBolha() {
        System.out.println(
                "\n💨 Soltando uma bolha... 🐡");
    }
}
