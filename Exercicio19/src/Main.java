import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe o coeficiente 'a' do usuário
        System.out.print("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();

        // Solicita e recebe o coeficiente 'b' do usuário
        System.out.print("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();

        // Solicita e recebe o coeficiente 'c' do usuário
        System.out.print("Digite o coeficiente 'c': ");
        double c = scanner.nextDouble();

        // Calcula o discriminante (delta) da equação: delta = b^2 - 4ac
        double delta = b * b - 4 * a * c;

        // Verifica o valor do discriminante para determinar as soluções
        if (delta > 0) {
            // Duas soluções reais distintas
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As soluções são: x1 = " + raiz1 + " e x2 = " + raiz2);
        } else if (delta == 0) {
            // Uma solução real (raíz dupla)
            double raiz = -b / (2 * a);
            System.out.println("A solução é única: x = " + raiz);
        } else {
            // Nenhuma solução real (raízes imaginárias)
            System.out.println("A equação não possui soluções reais (raízes imaginárias)");
        }

        // Fecha o scanner
        scanner.close();
    }
}