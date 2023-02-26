/*
 * Hacer un programa que lea un numero y calcule su tabla de multiplicar

 */
package tablademultiplicar;
import java.util.Scanner;


/**
 *
 * @author migue
 */
public class TablaDeMultiplicar {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tabla, i, resp;
        System.out.print("Digite el numero de la tabla de multiplicar");
        tabla=sc.nextInt();
        for(i=1;i<=10;i++){
            resp=tabla*i;
            System.out.println(tabla + "*" + i + "=" + resp );
            
        }
        
    }
    
}
