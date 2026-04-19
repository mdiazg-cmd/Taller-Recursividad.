import java.util.Scanner;

public class Multiplicacion {

    public static int multiplicar(int m, int n) {
        if (n == 0) return 0;              // caso base: multiplicar por 0 = 0
        return m + multiplicar(m, n - 1); // suma sucesiva: m + m + m ... (n veces)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número (M): ");
        int m = scanner.nextInt();
        System.out.print("Ingresa el segundo número (N): ");
        int n = scanner.nextInt();

        int resultado = multiplicar(m, n);
        System.out.println("El producto de " + m + " x " + n + " es: " + resultado);

        scanner.close();
    }
}
