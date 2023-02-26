/*
Hacer un programa en el cual nos den un tiempo en segundos,
calcular los segundos restantes para convertirse exactamente en un minuto
 */
package segundos;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Segundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double segundos;
        double minutos;
        double restantes;
        System.out.print("Digite los segundos: ");
        segundos=sc.nextDouble();
        minutos=60.0;
        restantes=minutos-segundos;
        System.out.print("El restante de segundos para el minuto es de " + 
                restantes + " segundos ");
        
        
        
    }
    
}
