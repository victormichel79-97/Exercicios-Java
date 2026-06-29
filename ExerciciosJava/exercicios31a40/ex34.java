package exercicios31a40;
//34. Calcule e mostre o quadrado dos números entre 10 e 150.
public class ex34 {
    public static void main(String[] args) {
        for (int i = 10; i <= 150; i++) {
            int quadrado = i * i;
            System.out.printf("O quadrado de %d é: %d%n", i, quadrado);
        }
    }
}
