package exercicios21a30;
//21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
import java.util.Scanner;
public class ex021 {
    public static void main(String[] args) {
        // Implementação do exercício 21
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble(); // Nota do 1º bimestre
        double nota2 = scan.nextDouble(); // Nota do 2º 
        // bimestre
        double nota3 = scan.nextDouble(); // Nota do 3º bimestre
        double nota4 = scan.nextDouble(); // Nota do 4º bimestre
        double media = (nota1 + nota2 + nota3 + nota4) / 4; // Calculando a média aritmética
        System.out.println("A média aritmética é: " + media);
        
    }
}   