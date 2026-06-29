//14. Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
import java.util.Scanner;
public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do 1º ângulo do triângulo (em graus): ");
        double angulo1 = input.nextDouble();

        System.out.println("Digite o valor do 2º ângulo do triângulo (em graus): ");
        double angulo2 = input.nextDouble();

        double angulo3 = 180 - (angulo1 + angulo2); // A soma dos ângulos internos de um triângulo é 180 graus

        System.out.println("O valor do 3º ângulo do triângulo é: " + angulo3 + " graus.");
    }
}