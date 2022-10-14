package aulas;

public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("hello,world!"); // equivale ao console.log

        // Variáveis no JAVA
        // fortemente tipado e estáticamente tipado
        int idade = 20; // int = inteiro
        double salario = 4500.99; // dupla precisão
        float nota = 7.5f; // sufixo f pro JAVA entender que o 7.5 é float e não double
        long populacaoTerra = 7_900_000_000l; // sufixo l pra entender o long (inteiro acima de 2 bilhoes)
        boolean tarefaConcluida = false; //(true e false)
        int i = 1, j = 0, k = 1000; // multiplas variáveis
        String nomeCompleto = "Wesley Ribeiro"; // sempre aspas duplas ( aspas simples apenas para representar 1 caractere)

        int teste = 10;
        teste = 9; // reatribuição de variáveis

        final int teste2 = 200; // Impossível mudar o valor
        //teste2 = 1000;

        // Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; // 5
        int multiplicacao = a * b; // 50
        int divisao = a/b; // 2

        System.out.println("O resultado da soma é " + soma);
        // a divisão entre dois numeros inteiros result em inteiro
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois;
        System.out.println(resultado); // 3.0
        double resultado2 = sete / dois2;
        System.out.println(resultado2); // 3.5

        // Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);
        // Casting
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7 / 2.0 - 3.5

        // Operadores 2
        int valor = 5;
        valor++; // incremento + 1
        valor--; // decremento - 1
        valor += 10; // valor = valor + 10

        // Operadores relacionais
        boolean test1 = 5 > 1; // true
        boolean test2 = 5 < 1; // false
        boolean test3 = 5 == 5; //true
        boolean test4 = 5 != 1; // true
        boolean test5 = 6 >= 6; // true
        boolean test6 = 5 <= 9; // true

        // Operadores lógicos
        boolean test7 = true && false; // false
        boolean test8 = true || false; // true
        boolean test9 = (5 > 10) && (10 < 5); // false
        boolean test10 = ( 10>= 0) || (1 < 5); // true
        boolean test11 = (5 > 1); // true
        boolean test12 = !test11; // false




    }
}

