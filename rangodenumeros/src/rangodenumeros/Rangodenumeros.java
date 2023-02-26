/*
 *Hacer un programa que lea un rango de numeros desde un valor inicial 
a un valor final y determine cuantos numeros son pares y cuantos son impares. 
Teniendo en cuenta que le valor final no puede ser menor al valor inicial
 */
package rangodenumeros;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Rangodenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        int inicio; 
        int par=0;
        int impar=0;
        
        System.out.print("Digite el valor inicial: ");
        inicio=sc.nextInt();
        
        
        if (inicio % 2 == 0){
            par=par+1;
                    
        }
        else
        {
            impar=impar+1;
            System.out.print(par);
                }    
            }
        
            
        }
        
       
    

