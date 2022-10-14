package aulas;// Enums são estruturas com constantes definidas
// Dias da semana, Meses do ano, Turnos do dia, Estações
// Níveis (junior, pleno, senior), Feriados nacionais, Nipes do baralho

public class EstudoEnums {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUANRTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nível é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nível é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
        }

        // versão enhanced

        switch (nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");

            }
        }
    }
}
