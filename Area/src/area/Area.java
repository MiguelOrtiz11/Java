/*
 Hace un programa que calcule el area de un triangulo
 */
package area;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.print("Digite la base del triangulo: ");
        base=sc.nextInt();
        System.out.print("Digite la altura del triangulo: ");
        altura=sc.nextInt();
        area=base*altura/2;
        System.out.println("el area del triangulo es: " + area);
           
         
        
        
    }
    
}
