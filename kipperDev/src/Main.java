import java.util.ArrayList;

public class Main {

    public class Tipos {
        // Números inteiros
        byte b1;   // 8 bits -128 até 127
        short s1;  // 16 bits -32768 até 32767
        int i1;    // 32 bits -2147483648 até 2147483647
        long l1;   // 64 bits -9223372036854775808 até 9223372036854775807

        // Números de ponto flutuante
        float f1;  // 32 bits precisão simples, até 7 dígitos decimais
        double d1; // 64 bits precisão dupla, até 15 dígitos decimais

        // Caracteres
        char c1;   // 16 bits, armazena um único caractere (Unicode)

        // Booleano
        boolean bool1;  // Representa um valor verdadeiro ou falso (true ou false)

        // Texto
        String str1;    // Representa uma sequência de caracteres (não é um tipo primitivo, mas uma classe em Java)
    }

    public class Condicionais {
        public void exemploIfElse() {
            int idade = 20;
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        public void exemploSwitch() {
            int dia = 3;
            String diaDaSemana;
            switch (dia) {
                case 1:
                    diaDaSemana = "Domingo";
                    break;
                case 2:
                    diaDaSemana = "Segunda-feira";
                    break;
                case 3:
                    diaDaSemana = "Terça-feira";
                    break;
                default:
                    diaDaSemana = "Dia inválido";
                    break;
            }
            System.out.println("Dia da semana: " + diaDaSemana);
        }
    }

    public class Arrays {
        // Criando um ArrayList de inteiros como campo da classe
        ArrayList<Integer> lista = new ArrayList<>();

        public void exemploArrays() {
            // Criando um array de inteiros
            int[] numeros = {10, 20, 30, 40, 50};
            
            // Acessando elementos do array
            System.out.println("Primeiro número: " + numeros[0]);
            System.out.println("Último número: " + numeros[numeros.length - 1]);
            
            // Usando um loop para imprimir todos os elementos
            System.out.println("Todos os números do array:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }

            // Adicionando elementos ao ArrayList
            lista.add(100);
            lista.add(200);
            lista.add(300);

            // Acessando elementos do ArrayList
            System.out.println("Elementos do ArrayList:");
            for (Integer num : lista) {
                System.out.println(num);
            }
        }

        // Método para obter um elemento específico do ArrayList
        public Integer get(int index) {
            return lista.get(index);
        }
    }

    public class Loop {
        // Exemplo de laço for
        public void exemploFor() {
            System.out.println("Exemplo de laço for:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
            }
        }
    
        // Exemplo de laço while
        public void exemploWhile() {
            System.out.println("Exemplo de laço while:");
            int i = 1;
            while (i <= 5) {
                System.out.println("Número: " + i);
                i++;
            }
        }
    
        // Exemplo de laço do-while
        public void exemploDoWhile() {
            System.out.println("Exemplo de laço do-while:");
            int i = 1;
            do {
                System.out.println("Número: " + i);
                i++;
            } while (i <= 5);
        }
    }

    public class Class {
        
    }
    

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    
        // Criando instâncias das classes para chamar os exemplos
        Main mainObj = new Main();
        
        // Chamando exemplos da classe Condicionais
        Condicionais cond = mainObj.new Condicionais();
        cond.exemploIfElse();
        cond.exemploSwitch();
        
        // Chamando exemplo da classe Arrays
        Arrays arr = mainObj.new Arrays();
        arr.exemploArrays();
    
        // Acessando o primeiro elemento do ArrayList usando o método get
        System.out.println("Primeiro elemento da lista: " + arr.get(0));
    
        // Criando instância da classe Loop
        Loop loop = mainObj.new Loop();
        loop.exemploFor();
        loop.exemploWhile();
        loop.exemploDoWhile();
    }
    
}
