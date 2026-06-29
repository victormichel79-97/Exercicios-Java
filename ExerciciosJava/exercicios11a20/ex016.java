//16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

import java.util.Scanner;
public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("Digite o valor por hora: ");
        double valorPorHora = input.nextDouble();

        System.out.println("Digite o percentual de desconto (em %): ");
        double percentualDesconto = input.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        int numeroDependentes = input.nextInt();

        double salarioBruto = horasTrabalhadas * valorPorHora;
        double desconto = salarioBruto * (percentualDesconto / 100);
        double salarioLiquido = salarioBruto - desconto + (numeroDependentes * 100);

        System.out.println("O salário a receber é: R$ " + salarioLiquido);
    }
}