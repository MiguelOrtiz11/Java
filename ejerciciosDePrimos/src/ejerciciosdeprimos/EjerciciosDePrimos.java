package ejerciciosdeprimos;

import java.util.Scanner;

public class EjerciciosDePrimos {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int num, ce, L, n, p, sp;
        ce = 0;
        L = 1;

        do {
            System.out.println("Digite la cantidad de datos: ");
            n = Leer.nextInt();
        } while (n < 1);

        for (p = 1, sp = 0; p <= n; p++) {
            do {
                do {
                    System.out.println("Digite el" + p + " primo");
                    num = Leer.nextInt();
                } while (num < 1);

                //   FOR  
                for (L = 2; L <= num / 2 + 1; L++) {
                    if (num % L == 0) {
                        break;

            
                    }
                }
            } while (L != num / 2 + 1);
        }
    }
}
