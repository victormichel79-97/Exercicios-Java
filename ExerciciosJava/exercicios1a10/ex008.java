//8. Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
import java.util.Scanner;
public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do depósito em poupança: ");
        double deposito = input.nextDouble();
        double rendimento = deposito * 0.013;
        double valorFinal = deposito + rendimento;
        System.out.println("O valor após 1 mês de aplicação é: " + valorFinal);
    }
}
