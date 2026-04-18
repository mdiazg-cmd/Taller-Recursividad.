import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0) return 0;              
        if (n == 1) return 1;             
        return fib(n - 1) + fib(n - 2);   
    }

    public static void imprimir(int i, int limite) {
        if (i > limite) return;           
        System.out.print("Fib(" + i + ") = " + fib(i) + "  ");
        imprimir(i + 1, limite);           
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el límite de la serie (N): ");
        int limite = scanner.nextInt();

        System.out.println("Serie de Fibonacci hasta Fib(" + limite + "):");
        imprimir(0, limite);
        System.out.println();

        scanner.close();
    }
}
