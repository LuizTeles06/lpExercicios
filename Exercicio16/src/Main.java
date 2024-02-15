import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da base: ");


        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura:");


        double altura = scanner.nextDouble();




        double area = base * altura / 3;




        System.out.println("O volume do seu cone é: " + area);


        scanner.close();
    }
}