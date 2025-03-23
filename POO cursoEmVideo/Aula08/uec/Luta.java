package Aula08.uec;

import java.util.Random;

public class Luta {
    private Atleta desafiante;
    private Atleta desafiado;
    private int rounds;

    private boolean lutaPermitida;

    public Luta(Atleta desafianteAtleta, Atleta desafiadoAtleta) {
        this.desafiante = desafianteAtleta;
        this.desafiado = desafiadoAtleta;
        marcarLuta();
    }

    public void marcarLuta() {
        if (this.desafiante.getCategoria().equals(this.desafiado.getCategoria()) &&
                !this.desafiante.getNome().equals(this.desafiado.getNome())) {
            this.lutaPermitida = true;
        } else {
            this.lutaPermitida = false;
            System.out.println("Luta não permitida!");
            System.out.println("Desafiante: " +
                            desafiante.nome +
                            ", categoria: " +
                            desafiante.categoria +
                            ", desafiado: " +
                            desafiado.nome +
                            ", categoria: " +
                            desafiado.categoria);
        }
    }

    public void lutar() {
        if (!this.lutaPermitida) {
            return;
        }
        System.out.println("Boa noite!!! Chegou o grande dia!!!");
        System.out.println("### Desafiante ###:");
        desafiante.apresentarLutador();
        System.out.println("### Desafiado ###:");
        desafiado.apresentarLutador();

        Random random = new Random();
        int resultado = random.nextInt(3) + 1; // Gera 1, 2 ou 3

        if (resultado == 1) {
            desafiante.empatarLuta();
            desafiado.empatarLuta();
            System.out.println("Empate!!! Que noite inesquecível, obrigado a todos pela presença.");
        } else if (resultado == 2) {
            desafiante.ganharLuta();
            desafiado.perderLuta();
            System.out.println("Eeeee " + desafiante.getNome() + " vence mais uma, inacreditável!!!");
            desafiante.status();
        } else {
            desafiado.ganharLuta();
            desafiante.perderLuta();
            System.out.println("Eeeee " + desafiado.getNome() + " vence mais uma, inacreditável!!!");
            desafiado.status();
        }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}
