import java.util.Scanner;

public class Cociente {

    public static int cociente(int m, int n) {
        if (m < n) return 0;              // caso base: ya no se puede restar más
        return 1 + cociente(m - n, n);    // resta sucesiva + cuenta
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (M): ");
        int m = scanner.nextInt();
        System.out.print("Ingresa el divisor (N): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
        } else {
            int resultado = cociente(m, n);
            System.out.println("El cociente de " + m + " / " + n + " es: " + resultado);
        }

        scanner.close();
    }
}
