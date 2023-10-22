package ventastienda;

import java.util.Scanner;

public class VentasTienda {

    
    /*   Tablas de multiplicar, tabla inicial a una tabla final  */
    
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        int i, f, t, mul = 0;
        do{
            
            System.out.println("Digite el numero inicial:  ");
            i = Leer.nextInt();
           
            System.out.println("Digite el numero final:  ");
            f = Leer.nextInt();
            
            
        }while(i>1 & f<i );
        
        
        for(;i<=f;i++){
            System.out.println("Tabla del " + i);
            for(t=1;t<=10;t++){
                System.out.println(i + " * " + t + " = " + i*t);
            }
            
            
        }
        
        

    }
    
}
