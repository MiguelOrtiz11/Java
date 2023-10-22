package practica.multiplos;

import java.util.Scanner;

public class PracticaMultiplos {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int n, s = 0, num, cm, p = 0;

        // Pedir cantidad de numeros
        do {
            System.out.println("Digite cantidad numeros multiplo de 5");
            n = Leer.nextInt();
        } while (n < 1);

        //
        for (cm = 1; cm <= n; cm++) {

            do {
                System.out.println("Digite el " + cm + " multiplo de 5");
                num = Leer.nextInt();

            } while (num % 5 != 0);

            if (num % 5 == 0) {
                s = s + num;
            } else {
                p = p * num;
            }

        }

        System.out.println("La sumatoria de los multiplos de 5 es igual a: " + s);
        System.out.println("El producto de los NO multiplos de 5 es igual a: " + p);

    }

}
