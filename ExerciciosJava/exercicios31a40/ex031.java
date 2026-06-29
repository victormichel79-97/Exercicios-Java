package exercicios31a40;
//31 - Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: Venda Mensal:  < ;  Preço Atual Preço Novo30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condições, preço novo será igual ao preço atual.
public class ex031 {

    public static void main(String[] args) {

        double precoAtual, novoPreco;
        int vendaMensal;

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o preço atual: ");
        precoAtual = scanner.nextDouble();

        System.out.print("Digite a venda mensal: ");
        vendaMensal = scanner.nextInt();

        if (vendaMensal < 500 && precoAtual < 30) {
            novoPreco = precoAtual + (precoAtual * 0.10);
        }
        else if (vendaMensal >= 500 && vendaMensal < 1000 &&
                 precoAtual >= 30 && precoAtual < 80) {
            novoPreco = precoAtual + (precoAtual * 0.15);
        }
        else if (vendaMensal >= 1000 && precoAtual >= 80) {
            novoPreco = precoAtual - (precoAtual * 0.05);
        }
        else {
            novoPreco = precoAtual;
        }

        System.out.printf("Novo preço: R$ %.2f%n", novoPreco);

        scanner.close();
    }
}
