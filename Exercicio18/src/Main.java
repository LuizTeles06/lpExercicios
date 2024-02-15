import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe o coeficiente 'a' do usuário
        System.out.print("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();

        // Solicita e recebe o coeficiente 'b' do usuário
        System.out.print("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();

        // Verifica se a equação é válida (se 'a' não é zero)
        if (a != 0) {
            // Calcula a solução para a equação do primeiro grau: x = -b/a
            double solucao = -b / a;

            // Exibe a solução
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é x = " + solucao);
        } else {
            // Caso 'a' seja zero, a equação não é válida
            System.out.println("A equação não é válida (a deve ser diferente de zero)");
        }

        // Fecha o scanner
        scanner.close();
    }
}