//11. Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência: ");
        double raio = input.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        System.out.println("O comprimento da circunferência é: " + comprimento);
    }
}
