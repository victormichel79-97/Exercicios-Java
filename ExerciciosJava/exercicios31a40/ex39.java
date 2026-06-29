package exercicios31a40;
//39. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
public class ex39 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / fatorial(i);
        }

        System.out.printf("A soma da série 1 + 1/1! + 1/2! + ... + 1/%d! é: %.4f%n", n, soma);
        scanner.close();
    }

    public static int fatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
