package actividadsenajava;

import java.util.Scanner;

public class CondicionalesJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero.");

            // Calcular ángulos para triángulo equilátero
            double anguloA = 60.0;
            double anguloB = 60.0;
            double anguloC = 60.0;

            System.out.println("Ángulo A: " + anguloA + " grados");
            System.out.println("Ángulo B: " + anguloB + " grados");
            System.out.println("Ángulo C: " + anguloC + " grados");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un triángulo isósceles.");

            // Calcular ángulos para triángulo isósceles
            double anguloA, anguloB, anguloC;

            if (lado1 == lado2) {
                anguloC = 180 - 2 * Math.toDegrees(Math.acos((lado3 * lado3 - lado1 * lado1) / (-2.0 * lado1 * lado3)));
                anguloA = anguloB = (180 - anguloC) / 2;
            } else if (lado1 == lado3) {
                anguloB = 180 - 2 * Math.toDegrees(Math.acos((lado2 * lado2 - lado1 * lado1) / (-2.0 * lado1 * lado2)));
                anguloA = anguloC = (180 - anguloB) / 2;
            } else {
                anguloA = 180 - 2 * Math.toDegrees(Math.acos((lado1 * lado1 - lado2 * lado2) / (-2.0 * lado2 * lado1)));
                anguloB = anguloC = (180 - anguloA) / 2;
            }

            System.out.println("Ángulo A: " + anguloA + " grados");
            System.out.println("Ángulo B: " + anguloB + " grados");
            System.out.println("Ángulo C: " + anguloC + " grados");
        } else {
            System.out.println("Es un triángulo escaleno.");

            // Calcular ángulos para triángulo escaleno
            double cosA = (lado2 * lado2 + lado3 * lado3 - lado1 * lado1) / (2.0 * lado2 * lado3);
            double cosB = (lado1 * lado1 + lado3 * lado3 - lado2 * lado2) / (2.0 * lado1 * lado3);
            double cosC = (lado1 * lado1 + lado2 * lado2 - lado3 * lado3) / (2.0 * lado1 * lado2);

            double anguloA = Math.toDegrees(Math.acos(cosA));
            double anguloB = Math.toDegrees(Math.acos(cosB));
            double anguloC = Math.toDegrees(Math.acos(cosC));

            System.out.println("Ángulo A: " + anguloA + " grados");
            System.out.println("Ángulo B: " + anguloB + " grados");
            System.out.println("Ángulo C: " + anguloC + " grados");
        }
    }
}
