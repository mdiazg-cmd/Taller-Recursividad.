import java.util.Scanner;

public class Sumatoria {

    // Método recursivo para calcular la sumatoria
    public static int sumatoria(int n) {
        if (n == 0) return 0;
        else return sumatoria(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para calcular su sumatoria: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("La sumatoria no está definida para números negativos.");
        } else {
            int resultado = sumatoria(numero);
            System.out.println("La sumatoria del factorial " + numero + " es: " + resultado);
        }

        scanner.close();

    }
}