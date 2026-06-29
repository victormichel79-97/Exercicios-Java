package exercicios31a40;
//35. Receba um número inteiro. Calcule e mostre o seu fatorial.
public class ex35 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é: %d%n", n, fatorial);
        scanner.close();
    }
}
