//19. Receba 2 valores reais. Calcule e mostre o maior deles.
import java.util.Scanner;
public class ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor real: ");
        double valor1 = input.nextDouble();

        System.out.println("Digite o segundo valor real: ");
        double valor2 = input.nextDouble();

        double maiorValor = Math.max(valor1, valor2);

        System.out.println("O maior valor entre os dois é: " + maiorValor);
    }
}