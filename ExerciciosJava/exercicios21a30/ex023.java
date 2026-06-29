package exercicios21a30;

import java.util.Scanner;

//23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
public class ex023 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int valor4 = scan.nextInt();

        if (valor4 < valor1) {
            System.out.println("Os valores em ordem crescente são: " + valor4 + ", " + valor1 + ", " + valor2 + ", " + valor3);
        } else if (valor4 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor4 + ", " + valor2 + ", " + valor3);
        } else if (valor4 < valor3) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2 + ", " + valor4 + ", " + valor3);
        } else {
            System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4);
        }

    }
    
}
