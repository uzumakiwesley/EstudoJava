package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    // Propriedades/atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

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
        this.dizOla();

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
        System.out.println("Olá, tudo bem? meu nome é " + this.nome);
    }

    void mostrarImc() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("o IMC é " + imc);
    }

    double calculaImc () {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("estou comendo " + comida);
        this.peso =+ 1.5;
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)) {
           this.addPessoaNova(pessoa);
           pessoa.addPessoaNova(this);
        }
    }

    void addPessoaNova(Pessoa pessoa) {
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa){
        // se true, a pessoa (this)c onhece a pessoa
        // se false, não conhece a pessoa
        return this.conhecidos.contains(pessoa);

    }
}
