import java.util.ArrayList;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        // cria um novo ArrayList vazio que guarda o Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);

        // adicionando elementos no array
        numeros.add(10); // equivale ao push no JS
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // numeros[2]
        numeros.set(0, 500); // altera o número na posição 0 para o valor 500

        System.out.println(numeros);

        numeros.remove(0); // remove o elemento na posição 0

        System.out.println(numeros);
        numeros.add(1, 200); // adiciona elemento, deslocando a posição dos que estão após ele no caso (1)...2,3
        numeros.add(3, 200);

        System.out.println(numeros);

        System.out.println(numeros.size()); // array.length

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("--------");
        for (int numero : numeros) { //para cada valor dentro do array ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //true = achou, false = não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição 1000 na minhaa lista
        System.out.println(numeros.indexOf(500)); // -1 não achou elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro (200) encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo (200) encontrado
    }
}
