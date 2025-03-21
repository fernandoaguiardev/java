package Aula13;

public class Mamifero extends Animal{

    protected String corPelo;
    protected char sexo;

    public Mamifero (float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
        this.sexo = 'M';
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
        
    }

    

}
