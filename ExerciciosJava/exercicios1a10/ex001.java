//1. Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
import java.util. Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado de um quadrado: ");
        double lado = input.nextDouble();
        double quadrado = lado * lado;
        System.out.println("A área do quadrado é de: "+ quadrado);
    }
}