import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        indicar la estadística de los estudiantes de poo,
        edad promedio general, edad promedio de hombres, edad promedio de mujeres
        cuantas personas hay por cada estrato economico(1 al 6), donde después de
        pedir los datos de un estudiante, preguntar si hay más estudiantes
        */

        Scanner Leer = new Scanner(System.in);
        int op, edad, p, voto, v1, v2, v3, v4;
        v1=v2=v3=v4=0;
        p=1;
        do{
            //lo que necesito
            do{
                System.out.println("Digite la edad de la " + p + " persona");
                edad = Leer.nextInt();
            }while(edad<1 || edad>130);
            if(edad>=18)
            {
                do{
                    System.out.println("""
                            Opciones de voto alcaldía Neiva
                            1. Pelo lulo
                            2. Juana de arco
                            3. Pelo piña
                            4. Voto en blanco""");
                    voto = Leer.nextInt();
                }while(voto<1 || voto>4);
                switch (voto) {
                    case 1 -> v1++;
                    case 2 -> v2++;
                    case 3 -> v3++;
                    case 4 -> v4++;
                }
            }else{
                System.out.println("Eres menor de edad");
            }
            p++;
            do{
                System.out.println("""
                        Digite si hay mas personas
                        1. SI
                        2. NO""");
                op = Leer.nextInt();
            }while(op<1 || op>2);
        }while(op==1);
        //mostramos los resultados
        System.out.println("Cantidad de personas encuestadas: " + (p-1));
        System.out.println("Personas que votaron: " + (v1+v2+v3+v4));
        System.out.println("votos por Pelo lulo: " + v1);
        System.out.println("votos por Juana de arco: " + v2);
        System.out.println("votos por Pelo piña: " + v3);
        System.out.println("votos en blanco: " + v4);
    }
}