package Aula12;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void alimentarSe() {
        System.out.println("\n🥛 Mamando... 🍼");
    }

    @Override
    public void emitirSom() {
        System.out.println("\n🎶 Emitindo som de mamífero...");
    }

    @Override
    public void locomoverSe() {
        System.out.println("\n🏃‍♂️ Estou correndo... 🏃‍♀️");
    }

    public void darALuz() {
        System.out.println("\n👶 O mamífero deu à luz a um filhote! 👶");
    }

    // Getters e Setters para o atributo corPelo (se necessário)
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
