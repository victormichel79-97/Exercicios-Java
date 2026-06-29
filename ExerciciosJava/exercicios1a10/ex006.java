//6. Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
import java.util.Scanner;
public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = input.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = input.nextDouble();

        double temp = x;
        x = y;
        y = temp;

        System.out.println("Após a troca, x = " + x + " e y = " + y);
    }
}
