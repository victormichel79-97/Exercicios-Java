package exercicios31a40;
//38. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
public class ex38 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        int somaImpares = 0;
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.printf("A somatória dos números ímpares entre %d e %d é: %d%n", menor, maior, somaImpares);
        scanner.close();
    }
}
