import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da temperatura em graus celsius: ");


        double celsius = scanner.nextDouble();


        double converter = (celsius * 9/5) + 32;


        System.out.println("A temperatura em Fahrenheit é: " + converter );


        scanner.close();
    }
}