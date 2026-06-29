package exercicios21a30;
//24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
import java.util.Scanner;
public class ex024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        if (valor % 2 == 0 && valor % 3 == 0) {
            System.out.println("O valor é divisível por 2 e 3.");
        } else {
            System.out.println("O valor não é divisível por 2 e 3.");
        }
    }
}
