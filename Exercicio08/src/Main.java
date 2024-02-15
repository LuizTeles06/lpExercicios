import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma medida em polegadas: ");


        double polegadas = scanner.nextDouble();


        double converter = polegadas * 25.4;

        System.out.println("O comprimento em milimetros é: " + converter );


        scanner.close();
    }
}