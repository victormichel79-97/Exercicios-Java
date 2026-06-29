package exercicios41a48;
//43. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
public class ex43 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.printf("Números primos entre %d e %d:%n", menor, maior);
        for (int i = menor; i <= maior; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    private static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        int limite = (int) Math.sqrt(num);
        for (int i = 2; i <= limite; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
