import java.util.Scanner;

public class MCD {

    public static int mcd(int m, int n) {
        if (m >= n) {                    // condición  M >= N
            if (n == 0) return m;        // MCD = M si N = 0
            else return mcd(n, m % n);   // MCD = MCD(N, M % N) 
        }
        return mcd(n, m);                
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (M): ");
        int m = scanner.nextInt();

        System.out.print("Ingresa el segundo número (N): ");
        int n = scanner.nextInt();

        int resultado = mcd(m, n);
        System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);

        scanner.close();
    }
}
