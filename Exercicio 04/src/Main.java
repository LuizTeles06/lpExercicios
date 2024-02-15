import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma nota: ");


        double n1 = scanner.nextDouble();

        System.out.println("Digite outra nota:");


        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("A média dos numeros é: " + media );

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}