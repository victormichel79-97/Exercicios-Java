
//9. Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        int somaQuadrados = (num1 * num1) + (num2 * num2);
        System.out.println("A soma dos quadrados é: " + somaQuadrados);
    }
}