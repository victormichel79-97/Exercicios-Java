package exercicios21a30;
//27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
import java.util.Scanner;
public class ex027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroVoltas = scan.nextInt();
        double extensaoCircuito = scan.nextDouble(); // em metros
        double tempoDuracao = scan.nextDouble(); // em minutos

        // Convertendo a extensão do circuito para quilômetros
        double extensaoCircuitoKm = extensaoCircuito / 1000.0;

        // Calculando a distância total percorrida em quilômetros
        double distanciaTotalKm = numeroVoltas * extensaoCircuitoKm;

        // Convertendo o tempo de duração para horas
        double tempoDuracaoHoras = tempoDuracao / 60.0;

        // Calculando a velocidade média em km/h
        double velocidadeMedia = distanciaTotalKm / tempoDuracaoHoras;

        System.out.printf("A velocidade média é: %.2f km/h%n", velocidadeMedia);
    }
}
