package exercicios21a30;
//22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
import java.util.Scanner;
public class ex022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        if (valor1 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + " e " + valor2);
        } else {
            System.out.println("Os valores em ordem crescente são: " + valor2 + " e " + valor1);
        }
    }
}