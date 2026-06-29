package exercicios31a40;
//33. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.

import java.util.Scanner;
public class ex033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Digite o mês atual: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Digite o dia atual: ");
        int diaAtual = scanner.nextInt();

        // Calculando a idade em anos, meses e dias
        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = mesAtual - mesNascimento;
        int idadeDias = diaAtual - diaNascimento;

        // Ajustando os valores caso necessário
        if (idadeDias < 0) {
            idadeMeses--;
            idadeDias += 30; // Aproximação para simplificação
        }
        if (idadeMeses < 0) {
            idadeAnos--;
            idadeMeses += 12;
        }

        System.out.printf("Idade: %d anos, %d meses e %d dias%n", idadeAnos, idadeMeses, idadeDias);

        scanner.close();
    }
}
