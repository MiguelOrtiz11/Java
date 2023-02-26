/*
 * Hacer un programa que lea un dia de la semana del 1 al 7 y me diga en letras 
el correspondiente dia 
 */
package switch2;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int dia;
        System.out.print("Digite un numero de la semana del 1 al 7: ");
        dia=sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("1 es el dia lunes");
                break;
            case 2:
                System.out.println("2 es el dia martes");
                break;
            case 3:
                System.out.println("3 es el dia miercoles");
                break;
            case 4:
                System.out.println("4 es el dia jueves");
                break;
            case 5:
                System.out.println("5 es el dia viernes");
                break;
            case 6:
                System.out.println("6 es el dia sabado");
                break;
            case 7:
                System.out.println("7 es el dia domingo");
                break;  
            default:                    
                System.out.println("debe digitar un numero del 1 al 7");
                break;
               
        }
    }
    
}
