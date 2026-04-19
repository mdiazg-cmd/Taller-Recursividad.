import java.util.Scanner;

public class InvertirNumero {

    // Método recursivo para invertir el número
    public static String invertir(int n) {
        if (n < 10) return String.valueOf(n);
        else return (n % 10) + invertir(n / 10);// % sirve para invertir el numero,y/sirve para que siga con los numero que le siguen 
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para invertirlo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            String resultado = invertir(numero);
            System.out.println("El número invertido de " + numero + " es: " + resultado);
        }

        scanner.close();
    }
}
