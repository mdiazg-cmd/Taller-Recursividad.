import java.util.Scanner;

public class Ackermann {

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;                                  
        if (m > 0 && n == 0) return ackermann(m - 1, 1);          
        return ackermann(m - 1, ackermann(m, n - 1));                
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de M: ");
        int m = scanner.nextInt();
        System.out.print("Ingresa el valor de N: ");
        int n = scanner.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Error: M y N deben ser enteros no negativos.");
        } else {
            int resultado = ackermann(m, n);
            System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
        }

        scanner.close();
    }
}
