package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Abner Copola", "abner@email.com", "00000000000", 7.5);
        aluno.seApresentar();

        Professor professor = new Professor("Sander O", "sandero@email.com", "32458900025", "ADS");
        professor.seApresentar();

        System.out.println("==========");


        Pessoa p1 = new Pessoa("Maria Antonieta", "ma@email.com", "98547822215");
        p1.seApresentar();

        // Aluno é uma Pessoa
        Pessoa p2 = new Aluno("Anderson Silva", "and@email.com", "659596895222", 7.5);
        // Professor é uma Pessoa
        Pessoa p3 = new Professor("Jander Son", "jand@email.com", "58795266698", "TI");

        System.out.println("==============");
        p2.seApresentar();
        p3.seApresentar();

        //polimorfismo
        System.out.println("=== Pessoas ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas) {
            // o método se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }


    }
}
