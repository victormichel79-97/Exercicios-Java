package exercicios41a48;
//44. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
public class ex44 {
    public static void main(String[] args) {
        System.out.println("Possibilidades de 2 dados cuja soma seja 7:");
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    System.out.printf("Dado 1: %d, Dado 2: %d%n", dado1, dado2);
                }
            }
        }
    }
}
