//15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
import java.util.Scanner;
public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do 1º cateto do triângulo retângulo: ");
        double cateto1 = input.nextDouble();

        System.out.println("Digite o valor do 2º cateto do triângulo retângulo: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)); // Fórmula de Pitágoras

        System.out.println("O valor da hipotenusa do triângulo retângulo é: " + hipotenusa);
    }
}