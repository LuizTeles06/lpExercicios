import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lendo o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();

        // Calculando o quadrado do número
        int quadrado = numero * numero;

        // Exibindo o resultado
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}