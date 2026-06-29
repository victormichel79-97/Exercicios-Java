//2. Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salario = input.nextDouble();
        double reajuste = salario * 0.15;
        double novoSalario = salario + reajuste;
        System.out.println("O novo salário com reajuste de 15% é: " + novoSalario);
    }
}