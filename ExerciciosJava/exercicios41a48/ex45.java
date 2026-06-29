package exercicios41a48;
//45. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
public class ex45 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 50; i++) {
            int numerador = i;
            int denominador = 2 * i - 1;
            soma += (double) numerador / denominador;
        }

        System.out.printf("A soma da série 1 + 2/3 + 3/5 + ... + 50/99 é: %.4f%n", soma);
    }
}
