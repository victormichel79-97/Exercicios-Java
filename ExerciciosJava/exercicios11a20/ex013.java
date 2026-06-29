//13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de alimento em quilos: ");
        double alimentoKg = input.nextDouble();

        double alimentoGramas = alimentoKg * 1000; // Convertendo para gramas
        double consumoDiario = 50; // Consumo diário em gramas
        double diasDuracao = alimentoGramas / consumoDiario;

        System.out.println("O alimento durará aproximadamente " + diasDuracao + " dias.");
    }
}