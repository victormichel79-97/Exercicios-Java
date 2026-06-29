//5. Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).

import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = input.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = input.nextDouble();

        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }
    }
}
