//17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.       
import java.util.Scanner;
public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo de percurso em horas: ");
        double tempoPercurso = input.nextDouble();

        System.out.println("Digite a velocidade média em km/h: ");
        double velocidadeMedia = input.nextDouble();

        double distanciaPercorrida = tempoPercurso * velocidadeMedia; // Distância = Tempo x Velocidade
        double litrosGastos = distanciaPercorrida / 12; // Consumo do automóvel é de 12 km/l

        System.out.println("A quantidade de litros gastos na viagem será: " + litrosGastos + " litros.");
    }
}