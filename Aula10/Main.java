package Aula10;

public class Main {

    public static void main(String[] args) {

        // Criando um array de 5 pessoas
        Pessoa[] pessoas = new Pessoa[5];

        // Preenchendo as pessoas com diferentes classes
        pessoas[0] = new Aluno("Carlos", 20, "Masculino", 12345, "Engenharia");
        pessoas[1] = new Professor("Ana", 40, "Feminino", "Matemática", 5000.0f);
        pessoas[2] = new Funcionario("Paulo", 35, "Masculino", true, "TI");
        pessoas[3] = new Aluno("Maria", 22, "Feminino", 67890, "Medicina");
        pessoas[4] = new Professor("Lucas", 50, "Masculino", "Física", 7000.0f);

        // Exibindo as pessoas e suas classes
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Sexo: " + pessoa.getSexo());
            System.out.println("Classe: " + pessoa.getClass().getSimpleName());

            if (pessoa instanceof Aluno) {
                System.out.println("Matrícula: " + ((Aluno) pessoa).getMatricula() + ", Curso: " + ((Aluno) pessoa).getCurso());
            } else if (pessoa instanceof Professor) {
                System.out.println("Especialidade: " + ((Professor) pessoa).getEspecialidade() + ", Salário: " + ((Professor) pessoa).getSalario());
            } else if (pessoa instanceof Funcionario) {
                System.out.println("Setor: " + ((Funcionario) pessoa).getSetor() + ", Trabalhando: " + ((Funcionario) pessoa).isTrabalhando());
            }
            System.out.println(); // Linha em branco para separar as pessoas
        }
    }
}
