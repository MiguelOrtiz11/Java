package ejerciciousco;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        // Data Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variables
        int n;

        // Cantidad de datos
        do {
            System.out.println("Ingrese la cantidad de numeros primos a mostrar: ");
            n = scanner.nextInt();

        } while (n <= 0);

        // Declarar arreglos
        int[] num = new int[n];
        

        // Obtener los primeros n números primos y almacenarlos en el array
        int contador = 0;
        int candidato = 2; // Comenzamos con el primer número primo

        while (contador < n) {
            if (esPrimo(candidato)) {
                num[contador++] = candidato;
            }
            candidato++;
        }

        // Mostrar los números primos
        System.out.println("Los primeros " + n + " números primos son: ");
        for (int primo : num) {
            System.out.println(primo);
        }
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    
}
