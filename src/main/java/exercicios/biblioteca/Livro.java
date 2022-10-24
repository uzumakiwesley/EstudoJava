package exercicios.biblioteca;

import java.util.ArrayList;

/**
 * Crie uma classe livro que possui:
 * Atributos: nome, autor, preço;
 * Construtores:
 * -Cria livreos com base nos parâmetros nome, autor(objeto da classe Autor),preço:
 */
public class Livro {

    private String nomeLivro;
    private Autor autor; // informações autor // composição
    private double preco;

    public Livro(String nomeLivro, Autor autor, double preco) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("nomeLivro='").append(nomeLivro).append('\'');
        sb.append(", autor=").append(autor);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Autor pauloCoelho = new Autor("Paulo Coelho", "pc@email.com");
        Livro veronicaDecideMorrer = new Livro("Veronica Decide Morrer", pauloCoelho, 44.90);

        System.out.println(veronicaDecideMorrer.autor.getNome());
        System.out.println(veronicaDecideMorrer.autor.getEmail());
        System.out.println(veronicaDecideMorrer.nomeLivro);

        Livro oAlquimista = pauloCoelho.escreverLivro("O alquimista", 39.90);

        System.out.println(oAlquimista.autor.getNome());
        System.out.println(oAlquimista.nomeLivro);

        ArrayList<Livro> livrospauloCoelho = new ArrayList<>();
        livrospauloCoelho.add(veronicaDecideMorrer);
        livrospauloCoelho.add(oAlquimista);

        System.out.println(livrospauloCoelho);
    }

}
