/*
 *  Hacer un programa que lea tres nuemero y determine cual es el mayor,
el del medio y el menor
 */
package mayordetres;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Mayordetres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        
        System.out.print("Digite numero 1: ");
        n1=sc.nextInt();
        System.out.print("Digite numero 2: ");
        n2=sc.nextInt();
        System.out.print("Digite numero 3: ");
        n3=sc.nextInt();
        if (n1>n2){
            if (n1>n3){
                System.out.print("el mayor es el numero 1");
            }else {
                System.out.print("el mayor es el numero 3");
            }
        }else{
            if (n2>n3) {
                System.out.print("el mayor es el numero 2");
            }else {
                System.out.print("el mayor es el numero 3");
                
             
            }              
        }           
    }    
}
