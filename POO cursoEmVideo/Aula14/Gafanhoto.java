package Aula14;

public class Gafanhoto extends Pessoa {

    private String nickname;
    private int totAssistido;

    public Gafanhoto(String nickname, int totAssistido, String nome, int idade, char sexo, int experiencia) {
        super(nome, idade, sexo, experiencia);
        this.totAssistido = totAssistido;
        this.nickname = nickname;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
        this.totAssistido += 1;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
