package ejerciciousco;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Ingrese la cantidad de números primos a mostrar: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] primos = new int[n];

        for (int p = 0, candidato = 2; p < primos.length; candidato++) {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(candidato); i++) {
                if (candidato % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                primos[p++] = candidato;
            }
        }

        System.out.println("Los primeros " + n + " números primos son: ");
        for (int primo : primos) {
            System.out.println(primo);
        }

        scanner.close();
    }
}
