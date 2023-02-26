/*
   Hacer un programa donde nos dan las horas trabajadas de una persona y  el 
valor de la hroa. Calcular el salario e imprimirlo con el nombre.
 */

package horastrabajadas;
import java.util.Scanner;


/**
 *
 * @author migue
 */
public class HorasTrabajadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double horasTrabajadas;
        double valorHora;
        String nombre;
        double salario;
        System.out.print("Digite el nombre del trabajador: ");
        nombre=sc.next();
        System.out.print("Digite las horas de trabajadas: ");
        horasTrabajadas=sc.nextDouble();
        System.out.print("Digite el valor de la hora: ");
        valorHora=sc.nextDouble();
        salario=horasTrabajadas*valorHora;
        System.out.println("El salario del trabajador: " + nombre + " es " + salario);
        
        
    }
    
}
