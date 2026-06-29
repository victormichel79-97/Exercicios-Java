package exercicios21a30;
//25. Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
import java.util.Scanner;
public class ex025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicio = scan.nextInt();
        int minutoInicio = scan.nextInt();
        int horaFim = scan.nextInt();
        int minutoFim = scan.nextInt();

        int duracaoHoras, duracaoMinutos;

        if (horaFim < horaInicio || (horaFim == horaInicio && minutoFim < minutoInicio)) {
            // O jogo terminou no dia seguinte
            duracaoHoras = (24 - horaInicio) + horaFim;
            duracaoMinutos = minutoFim - minutoInicio;
            if (duracaoMinutos < 0) {
                duracaoMinutos += 60;
                duracaoHoras--;
            }
        } else {
            // O jogo terminou no mesmo dia
            duracaoHoras = horaFim - horaInicio;
            duracaoMinutos = minutoFim - minutoInicio;
            if (duracaoMinutos < 0) {
                duracaoMinutos += 60;
                duracaoHoras--;
            }
        }

        System.out.println("O jogo durou " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");
    }
}
