import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma distância em milhas: ");


        double milhas = scanner.nextDouble();


        double converter = milhas * 1.609;

        System.out.println("O comprimento em quilometros é: " + converter );


        scanner.close();
    }
}