package exercicios21a30;
//28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: Venda Mensal Preço Atual Preço Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condições, preço novo será igual ao preço atual.

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precoAtual = scan.nextDouble();
        int mediaMensal = scan.nextInt();

        double novoPreco;
        if (mediaMensal < 500) {
            novoPreco = precoAtual * 1.10; // + 10%
        } else if (mediaMensal >= 500 && mediaMensal < 1000) {
            novoPreco = precoAtual * 1.15; // + 15%
        } else {
            novoPreco = precoAtual * 0.95; // - 5%
        }

        System.out.printf("O novo preço é: R$ %.2f%n", novoPreco);
    }
}
