package aulas;

import java.util.Scanner;

public class CauculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("qual a sua altura em (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual a seu peso? (kg)");
        double peso = entrada.nextDouble();

       // Caulcule o IMC = peso / altura
        double imc = peso / (altura * altura);



        System.out.println("Olá " + nome + " Sua idade é: " + idade + "anos " + " Sua altura é: " + altura + "m" + " Seu IMC é: " + imc);

        System.out.println("Olá, " + nome + idade + " anos!");
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("Este é o seu IMC = %.2f\n", imc);
        System.out.printf("Olá,  %s Idade %d anos!\n", nome, idade);

        // https://www.calculoimc.com.br/tabela-de-imc/

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if(imc > 17 && imc <= 18.49){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso Normal");
        }else if(imc >= 25 && imc <= 29.99){
            System.out.println("Acima do peso");
        }else if(imc >= 30 && imc <= 34.99){
            System.out.println("Obesidade I");
        }else if(imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II (Severa)");
        }else {
            System.out.println("Obesidade III(Mórbida");
        }

        // switch-case
        System.out.println("Selecione uma dieta ( 1 a 3 )");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("2 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da Água!");
                break; // impedir de testar a condição abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da Batata!");
                break;
            default: // **else**
                System.out.println("Essa dieta não existe!");
        }

        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for (int i = 0; i < totalAlimentos; i++) {
            System.out.println(i);
        }
        int i = 0;
       /* while(i < totalAlimentos) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);*/
    }

}
