package exercicios31a40;
//40. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
public class ex40 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        long primeiro = 0, segundo = 1, proximo;
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(primeiro + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(segundo + " ");
                continue;
            }
            proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
        scanner.close();
    }
}
