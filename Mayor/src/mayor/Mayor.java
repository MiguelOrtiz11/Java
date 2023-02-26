/*
 * Hacer un programa que lea dos numeros y determine cual es el mayor de ellos
 */
package mayor;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite numero 1: ");
        num1= sc.nextInt();
        System.out.print("Digite numero 2: ");
        num2= sc.nextInt();
        if (num1>num2){
            System.out.print("el mayor es el numero 1");
        }
        else{
            System.out.print("el mayor es el numero 2");
        }   
    }
 
}
