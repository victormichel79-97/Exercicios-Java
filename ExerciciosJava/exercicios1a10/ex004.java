//4. Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

import java.util.Scanner;
public class ex004{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius ");
        double celsius = input.nextDouble();
        double fah = (9*celsius + 160)/5;
        System.out.println("A temperatura em Fahrenheit é: " + fah);
    }
}