package exercicios41a48;
//42. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N
public class ex42 {
    public static void main(String[] args) {
        long grãos = 1;
        long totalGrãos = 0;

        for (int casa = 1; casa <= 64; casa++) {
            totalGrãos += grãos;
            System.out.printf("Casa %d: %d grãos%n", casa, grãos);
            grãos *= 2; // Dobra a quantidade de grãos para a próxima casa
        }

        System.out.printf("Total de grãos no tabuleiro: %d%n", totalGrãos);
    }
}
