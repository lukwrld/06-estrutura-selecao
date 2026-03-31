import java.util.Scanner;

public class ExercicioIfElse {
    public static void main(String[] args) {

        // declarando variaveis
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        // entrada de dados
        System.out.println("Digite sua primeira nota --> ");
        nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota --> ");
        nota2 = sc.nextDouble();

        // processamento de dados + saida de dados (if-else)
        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Parabéns, sua média é --> " +
                    String.format("%.1f",media) + " --> Aprovado!");
        } else {
            System.out.println("Sua média é --> " +
                    String.format("%.1f",media) + " --> Reprovado!");
        }

    }
}
