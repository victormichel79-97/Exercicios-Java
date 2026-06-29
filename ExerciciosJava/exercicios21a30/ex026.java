package exercicios21a30;
//26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
import java.util.Scanner;
public class ex026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        if (menor != 0 && maior % menor == 0) {
            System.out.println("O maior número é múltiplo do menor.");
        } else {
            System.out.println("O maior número não é múltiplo do menor.");
        }
    }
}
