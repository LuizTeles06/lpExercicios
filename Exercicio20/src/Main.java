import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe a primeira raiz do usuário
        System.out.print("Digite a primeira raiz (x1): ");
        double x1 = scanner.nextDouble();

        // Solicita e recebe a segunda raiz do usuário
        System.out.print("Digite a segunda raiz (x2): ");
        double x2 = scanner.nextDouble();

        // Solicita e recebe o coeficiente principal 'a' do usuário
        System.out.print("Digite o coeficiente principal 'a': ");
        double a = scanner.nextDouble();

        // Constrói a equação do segundo grau
        System.out.println("A equação do segundo grau correspondente é: " +
                a + " * (x - " + x1 + ") * (x - " + x2 + ") = 0");

        // Fecha o scanner
        scanner.close();
    }
}