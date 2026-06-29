package exercicios31a40;
//32. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
public class ex032 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o tipo de investimento (1 = poupança, 2 = renda fixa): ");
        int tipoInvestimento = scanner.nextInt();

        System.out.print("Digite o valor do investimento: ");
        double valorInvestimento = scanner.nextDouble();

        double valorCorrigido;

        if (tipoInvestimento == 1) {
            // Poupança: 3% de correção
            valorCorrigido = valorInvestimento + (valorInvestimento * 0.03);
        } else if (tipoInvestimento == 2) {
            // Renda Fixa: 5% de correção
            valorCorrigido = valorInvestimento + (valorInvestimento * 0.05);
        } else {
            System.out.println("Tipo de investimento inválido.");
            scanner.close();
            return;
        }

        System.out.printf("Valor corrigido após 30 dias: R$ %.2f%n", valorCorrigido);

        scanner.close();
    }        
}
