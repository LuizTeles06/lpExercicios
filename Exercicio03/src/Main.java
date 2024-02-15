import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir um número inteiro
        System.out.print("Digite um número real: ");

        // Lendo o número inteiro fornecido pelo usuário
        int numero = scanner.nextInt();

        // Calculando o quadrado do número
        int quinta_parte = numero / 5;

        // Exibindo o resultado
        System.out.println("A quinta parte do número é: " + quinta_parte);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}