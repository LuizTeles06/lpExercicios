import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio de um círculo: ");


        double raio = scanner.nextDouble();

        double pi = 3.14;

        double converter = pi * raio * raio;

        System.out.println("Sua área é: " + converter );


        scanner.close();
    }
}