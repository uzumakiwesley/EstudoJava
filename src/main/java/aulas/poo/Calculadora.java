package aulas.poo;

public class Calculadora {

    public static final double PI =3.14;
    // Final, impede a alteração do valor

    // Método estático  ( não pertence ao objeto mas sim à classe )
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multipicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(8, 8);
        double resultadoSub = Calculadora.subtracao(15, 8);
        double resultadomulti = Calculadora.multipicacao(3, 18);
        double resultadoDiv = Calculadora.divisao(168, 16);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSub);
        System.out.println(resultadomulti);
        System.out.println(resultadoDiv);
        System.out.println(Calculadora.PI);

    }


}
