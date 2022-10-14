package aulas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        // Strings são cadeias de caracteres
        //"José" -> J = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";

        if(nome == "Pedro") { // compara o endereço
            System.out.println("são iguais!");
        }

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")) { // .equals compara o conteúdo das strings .equalsIgnoreCase ignora maiúsculo, minúsculo
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }

        // outros métodos
        String java = "Java";
        String ja = java.substring(0,2); //  começa do 0 e vai até o 2 ( 2 não incluso)
        String va = java.substring(2); // corta do 2 até o final da string
        String av = java.substring(1,3);

        System.out.println(ja);
        System.out.println(va);
        System.out.println(av);

        String m1 =  "Hello, ";
        String m2 = "world!";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres ele tem
        System.out.println(java.isEmpty()); // verifica se está vazia -> ""
        System.out.println(java.toUpperCase()); // JAVA em caixa alta
        System.out.println(java.toLowerCase()); // java em caixa baixa
        // exemplo
        System.out.println("digite seu nome: ");
        String seuNome = entrada.nextLine();

        if (seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/");  //{"13","10","2022"};
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split("@"); // ["jose.almir", "gmail.com"]
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "José Souza";
        String[] nomesSeparado = nome2.split(" ");
        System.out.println(nomesSeparado[0]);

        String teste = "Amanhã é sexta-feira!";
        String[] teste2 = teste.split(" ");
        System.out.println(teste2);
        System.out.println(Arrays.toString(teste2));
    }
}
