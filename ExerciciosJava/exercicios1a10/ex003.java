//3. Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
