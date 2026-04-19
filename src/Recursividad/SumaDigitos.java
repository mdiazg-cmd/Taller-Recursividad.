import java.util.Scanner;

public class SumaDigitos {

    // Método recursivo para sumar los dígitos
    public static int sumarDigitos(int n) {
        if (n < 10) return n;
        else return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para sumar sus dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int resultado = sumarDigitos(numero);
            System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
        }

        scanner.close();
    }
}
