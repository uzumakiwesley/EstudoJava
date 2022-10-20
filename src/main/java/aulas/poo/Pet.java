package aulas.poo;

// super classe
public class Pet {
    private String nome;
    private int idade;
    protected double peso;

    // nas subclasses o atributo/metodo private
    // não é acessível
    // protected => permite acesso direto nas subclasses
    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("...");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir() {
        System.out.println("zzzzzzzzzzzz");
    }

    public void brincar() {
        System.out.println("Estou brincando...");
    }

    // pet.peso;
    // double peso = pet.getPeso()
    public double getPeso() { // apenas leitura do peso
        return this.peso;
    }

    // pet.peso = 231231;
    // pet.setPeso(232);
    public void setPeso(double novoPeso) {
        // possibilidade de alterar o peso
        this.peso = novoPeso;
    }
}
