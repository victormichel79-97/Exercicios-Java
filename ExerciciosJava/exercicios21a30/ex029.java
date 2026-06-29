package exercicios21a30;
//29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.

import java.util.Scanner;
public class ex029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tipoInvestimento = scan.nextInt();
        double valorInvestimento = scan.nextDouble();

        double valorCorrigido;
        if (tipoInvestimento == 1) {
            System.out.println("Investimento em poupança: +3%");
            valorCorrigido = valorInvestimento * 1.03;

             // Poupança: +3%
        } else if (tipoInvestimento == 2) {
            System.out.println("Investimento em renda fixa: +5%");
            valorCorrigido = valorInvestimento * 1.05; // Renda Fixa: +5%
        } else {
            System.out.println("Tipo de investimento inválido.");
            return;
        }

        System.out.printf("O valor corrigido em 30 dias é: R$ %.2f%n", valorCorrigido);
    }
}
