package exercicios41a48;
//Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
public class ex48 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 15; i++) {
            int numerador = i; 
            int denominador = i * i;
            if (i % 2 == 0) {
                soma -= (double) numerador / denominador;
            } else {
                soma += (double) numerador / denominador;
            }
        }

        System.out.printf("A soma da série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225 é: %.4f%n", soma);
    }
}
