package aulas.poo;

public class Pessoa {
    // Propriedades/atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() { // construtor da classe
        //this => representa o objeto
        this.nome = "Wesley";
        this.sobrenome = "Ribeiro";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;

    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }


    // Ações de uma pessoa (método)
    // <tipo_retorno> nomeDoMetodo(parametros) {}
    void dizOla() { // método
        System.out.println("Olá, tudo bem? ");
    }

    void mostrarImc() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("o IMC é " + imc);
    }

    double calculaImc () {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer() {

    }
}
