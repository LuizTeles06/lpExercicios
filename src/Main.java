import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma medida em milimetros: ");


        double milimetros = scanner.nextDouble();


        double converter = milimetros / 25.4;

        System.out.println("O comprimento em polegadas é: " + converter );


        scanner.close();
    }
}