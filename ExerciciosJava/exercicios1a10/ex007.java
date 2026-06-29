//7. Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento do paralelepípedo: ");
        double comprimento = input.nextDouble();
        System.out.println("Digite a largura do paralelepípedo: ");
        double largura = input.nextDouble();
        System.out.println("Digite a altura do paralelepípedo: ");
        double altura = input.nextDouble();

        double volume = comprimento * largura * altura;
        System.out.println("O volume do paralelepípedo é: " + volume);
    }
}