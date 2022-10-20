package aulas.poo.escola;

public class Aluno extends Pessoa {
    private double media;
// chamada super deve vir primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // estou chamando o construtor de Pessoa (parent)
        this.media = media;
    }

    @Override
    public void seApresentar() { // no override mudamos apenas o comportamento
        super.seApresentar(); // chama o se apresentar do super
        System.out.println("Eu sou um aluno com média " + this.media);
    }
    public double getMedia() {
        return this.media;
    }
}
