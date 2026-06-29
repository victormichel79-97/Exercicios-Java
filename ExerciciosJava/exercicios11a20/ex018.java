//18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
import java.util.Scanner;
public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro: ");
        int valor1 = input.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        int valor2 = input.nextInt();

        int maiorValor = Math.max(valor1, valor2);
        int menorValor = Math.min(valor1, valor2);
        int diferenca = maiorValor - menorValor;

        System.out.println("A diferença do maior pelo menor valor é: " + diferenca);
    }
}