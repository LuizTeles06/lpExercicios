import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe a velocidade inicial do usuário
        System.out.print("Digite a velocidade inicial (m/s): ");
        double velocidadeInicial = scanner.nextDouble();

        // Solicita e recebe a aceleração do usuário
        System.out.print("Digite a aceleração (m/s^2): ");
        double aceleracao = scanner.nextDouble();

        // Solicita e recebe o tempo de percurso do usuário
        System.out.print("Digite o tempo de percurso (s): ");
        double tempo = scanner.nextDouble();

        // Calcula a velocidade final usando a fórmula: velocidade final = velocidade inicial + (aceleração * tempo)
        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        // Exibe o resultado
        System.out.println("A velocidade final do corpo é: " + velocidadeFinal + " m/s");

        // Fecha o scanner
        scanner.close();
    }
}