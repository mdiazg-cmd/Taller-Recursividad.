import java.util.Scanner;

public class SumaVector {

    public static int sumar(int[] arr, int n) {
        if (n == 0) return 0;                      // caso base: no quedan elementos
        return arr[n - 1] + sumar(arr, n - 1);    // suma el elemento actual + resto del arreglo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? (N): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        int resultado = sumar(arr, n);
        System.out.println("La suma de los elementos es: " + resultado);

        scanner.close();
    }
}