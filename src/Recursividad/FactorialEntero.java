import java.util.Scanner;

public class FactorialEntero {

    // Método recursivo para calcular la sumatoria 1 + 1/2 + 1/3 + ... + 1/n
    public static double sumatoria(int n) {
        if (n == 1) return 1.0;
        else return sumatoria(n - 1) + (1.0 / n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para calcular la sumatoria:");
        int numero = scanner.nextInt();

        if (numero < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else {
            double resultado = sumatoria(numero);
            System.out.println("La sumatoria 1 + 1/2 + ... + 1/" + numero + " = " + resultado);
        }

        scanner.close();
    }
}
