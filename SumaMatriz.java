import java.util.Scanner;

public class SumaMatriz {

    public static int sumar(int[][] matriz, int filas, int cols, int i, int j) {
        if (i == filas) return 0;                        
        if (j == cols)  return sumar(matriz, filas, cols, i + 1, 0); 

        return matriz[i][j] + sumar(matriz, filas, cols, i, j + 1);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de filas (M): ");
        int m = scanner.nextInt();
        System.out.print("Ingresa el número de columnas (N): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingresa el elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int resultado = sumar(matriz, m, n, 0, 0);
        System.out.println("La suma de los elementos de la matriz es: " + resultado);

        scanner.close();
    }
}
