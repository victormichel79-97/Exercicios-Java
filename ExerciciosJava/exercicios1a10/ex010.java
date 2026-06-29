//10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número real: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double num2 = input.nextDouble();

        double diferenca = num1 - num2;
        System.out.println("A diferença entre os números é: " + diferenca);
    }
}
