import java.util.Scanner;

public class Factorial {

    // Método recursivo separado correctamente
    public static int factorial(int n) {
        if (n == 0) return 1;
        else return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no existe para números negativos.");
        } else {
            int resultado = factorial(numero);
            System.out.println(numero + "! = " + resultado);
        }

        scanner.close();
    }
}