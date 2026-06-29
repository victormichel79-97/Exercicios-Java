//12. Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
import java.util.Scanner;
public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeFutura = idade + 17;

        System.out.println("Sua idade atual é: " + idade);
        System.out.println("Daqui a 17 anos você terá: " + idadeFutura);
    }
}
