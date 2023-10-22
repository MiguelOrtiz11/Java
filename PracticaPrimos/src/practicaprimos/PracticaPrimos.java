package practicaprimos;

import java.util.Scanner;

public class PracticaPrimos {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int L, n, p, cp;
        L = 1;

        do {
            System.out.println("Digite la cantidad de datos: ");
            n = Leer.nextInt();
        } while (n < 1);

        for (p = 2, cp = 1; cp <= n; p++) {
            for (L = 2; L < p / 2 + 1; L++) {
                if (p % L == 0) {
                    break;
                }

                if (L == p / 2 + 1) {
                    System.out.println(" es primo");
                    cp++;
                } else {
                    System.out.println(" no es primo");
                }
            }

        }
    }
}
