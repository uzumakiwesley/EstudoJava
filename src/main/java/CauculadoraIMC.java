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
    }

}
