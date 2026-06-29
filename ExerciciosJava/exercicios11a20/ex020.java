//20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
import java.util.Scanner;
public class ex020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do coeficiente A: ");
        double A = input.nextDouble();

        System.out.println("Digite o valor do coeficiente B: ");
        double B = input.nextDouble();

        System.out.println("Digite o valor do coeficiente C: ");
        double C = input.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C; // Calculando o discriminante (delta)

        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else {
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("As raízes reais da equação são: " + raiz1 + " e " + raiz2);
        }
    }
}