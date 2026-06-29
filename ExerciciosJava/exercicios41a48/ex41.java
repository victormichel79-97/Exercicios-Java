package exercicios41a48;
//41. Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
public class ex41 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro real: ");
            double num = scanner.nextDouble();
            if (num > 0) {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        if (maior != Double.MIN_VALUE && menor != Double.MAX_VALUE) {
            System.out.printf("O maior valor positivo é: %.2f%n", maior);
            System.out.printf("O menor valor positivo é: %.2f%n", menor);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }
        scanner.close();
    }
}
