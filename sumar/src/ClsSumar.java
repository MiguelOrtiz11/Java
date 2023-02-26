/*
hacer un programa que lea dos numeros y los sume.
 */
import java.util.Scanner;


/**
 *
 * @author migue
 */
public class ClsSumar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //creamos un objeto scanner//
        int num1;
        int num2;
        int suma, resta, multiplicacion;
        double division;
        System.out.print("Digite el numero 1: ");
        num1=sc.nextInt();
        System.out.print("Digite el numero 2: ");
        num2=sc.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        System.out.println("la suma de los dos numeros es: " + suma);
        System.out.println("la resta de los dos numeros es: " + resta);
        System.out.println("la multiplicacion de los dos numeros es: " + multiplicacion);
        System.out.println("la division de los dos numeros es: " + division);
    }
    
}
