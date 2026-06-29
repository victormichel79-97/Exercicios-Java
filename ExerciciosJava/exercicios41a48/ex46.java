package exercicios41a48;
//46. Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
public class ex46 {
    public static void main(String[] args) {
        double alturaAna = 1.10; // Altura inicial de Ana em metros
        double alturaMaria = 1.50; // Altura inicial de Maria em metros
        int anos = 0; // Contador de anos

        // Enquanto Ana não for maior que Maria, continue o loop
        while (alturaAna <= alturaMaria) {
            alturaAna += 0.03; // Ana cresce 3 cm (0,03 m) por ano
            alturaMaria += 0.02; // Maria cresce 2 cm (0,02 m) por ano
            anos++; // Incrementa o contador de anos
        }

        System.out.printf("Serão necessários %d anos para que Ana seja maior que Maria.%n", anos);
    }
}
