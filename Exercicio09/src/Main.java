import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma distância em quilômetros: ");


        double quilometros = scanner.nextDouble();


        double milhas = quilometros / 1.609;

        System.out.println("O comprimento em milhas é: " + milhas );


        scanner.close();
    }
}