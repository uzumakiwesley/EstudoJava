package aulas.poo.zoo;
// Na interdaxe  você defini um conjunto de métodos
// e a classe que "herda" deve implementar os métodos
public interface Animal {
    void dormir(); // definição do método apenas
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println("zzzzzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
            if(comida.equals("Peixe")) {
                System.out.println("humm, gosto de peixe");
            } else {
                System.out.println("Só como peixe");
            }

        }
    }

    class Galinha implements Animal {

        @Override
        public void dormir() {
            System.out.println("có có zzzzzzz");
        }

        @Override
        public void fazerSom() {
            System.out.println("có có có có có có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("humm có có " + comida);
        }

        public static void main(String[] args) {
            Galinha galinha = new Galinha();
            Gato gato = new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("milho");

            gato.fazerSom();
            gato.dormir();
            gato.comer("Peixe");

            // Interface não consigo criar objeto
            // Animal novoAnimal = new Animal(); // Não consigo criar pois é interface

            Animal animalGalinha = new Galinha();
            Animal animalGatinho = new Gato();
            System.out.println("== polimorfismo ==");
            animalGalinha.fazerSom();
            animalGatinho.fazerSom();

        }
    }
