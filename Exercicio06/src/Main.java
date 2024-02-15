import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a velocidade em m/s: ");


        double velocidade = scanner.nextDouble();


        double metros = velocidade * 3.6;

        System.out.println("A velocidade em kmh: " + metros );


        scanner.close();
    }
}