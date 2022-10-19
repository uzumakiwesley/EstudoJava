package aulas.poo;

// intuito: testar o uso da classe pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um NOVO objeto pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Wesley";
        pessoa1.sobrenome = "ribeiro";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa( "pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa( "Enzo" , "Pereira");

        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

        //exemplo pessoas
        Pessoa pedro = new Pessoa("Pedro", "Sampaio", 29, 1.75, 80);
        Pessoa joão =new Pessoa("João", "Gomes", 25, 1.69, 75);

        pedro.cumprimentar(joão);
        pedro.cumprimentar(joão);
    }
}
