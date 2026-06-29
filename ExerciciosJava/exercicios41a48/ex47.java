package exercicios41a48;
//47. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
public class ex47 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o número da base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o número do expoente: ");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.printf("O valor da potência de %d elevado a %d é: %.2f%n", base, expoente, resultado);
    }
}
