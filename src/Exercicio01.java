import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        // delcarando variaveis
        Scanner sc = new Scanner(System.in);
        double valorTotal, desconto, valorFinal;

        // entrada de dados
        System.out.println("Digite o valor total das suas compras --> R$");
        valorTotal = sc.nextDouble();

        // processamento de dados
        if (valorTotal >= 1000) {
            desconto = valorTotal * 0.15;
        } else {
            desconto = valorTotal * 0.08;
        }

        valorFinal = valorTotal - desconto;

        // saida de dados
        System.out.println("O valor do desconto foi de --> R$" +
                String.format("%.2f", desconto));
        System.out.println("O valor final da compra foi de --> R$" +
                String.format("%.2f", valorFinal));

    }
}
