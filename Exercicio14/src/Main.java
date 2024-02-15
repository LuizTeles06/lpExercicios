import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do raio: ");


        double raio = scanner.nextDouble();

        System.out.println("Digite o valor da altura:");


        double altura = scanner.nextDouble();

        double pi = 3.14;


        double volume = raio * altura * pi;




        System.out.println("A o volume do seu cilindro é: " + volume);


        scanner.close();
    }
}