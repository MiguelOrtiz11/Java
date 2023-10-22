package tareavotos2;

import java.util.Scanner;

 /*  indicar la estadistica de los estudiantes de poo, 
    edad promedio general, edad promedio de hombres, edad promedio de mujeres
    cuantas personas hay por cada estrato economico(1 al 6), donde despues de
    pedir los datos de un estudiante, preguntar si hay mas estudiantes        */
public class TareaVotos2 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int edad, p, voto, v1, v2, v3, v4, n;
        v1 = v2 = v3 = v4 = 0;

        //Pedir cantidad de muestra
        do {
            System.out.println("Indique la cantidad de personas a encuestar");
            n = Leer.nextInt();
        } while (n < 1);

        for (p = 1; p <= n; p++) {
            do {
                System.out.println("Digite la edad de la " + p + " persona");
                edad = Leer.nextInt();
            } while (edad < 1 || edad > 130);
            if (edad >= 18) {
                do {
                    System.out.println("__________________________________________________");
                    System.out.println("""
                                       Opciones de voto alcaldia neiva
                                       1. Pelo lulo
                                       2. Juana de arco
                                       3. Pelo pi\u00f1a
                                       4. Voto en blanco""");
                    System.out.println("__________________________________________________");
                    voto = Leer.nextInt();
                } while (voto < 1 || voto > 4);
                switch (voto) {
                    case 1 ->
                        v1++;
                    case 2 ->
                        v2++;
                    case 3 ->
                        v3++;
                    case 4 ->
                        v4++;
                }
            }
        }

        //mostramos los resultados
        System.out.println("__________________________________________________");
        System.out.println("Cantidad de personas encuestadas: " + (p - 1));
        System.out.println("Personas que votaron: " + (v1 + v2 + v3 + v4));
        System.out.println("votos por Pelo lulo: " + v1);
        System.out.println("votos por Juana de arco: " + v2);
        System.out.println("votos por Pelo piña: " + v3);
        System.out.println("votos en blaco: " + v4);
        System.out.println("__________________________________________________");

    }

}
