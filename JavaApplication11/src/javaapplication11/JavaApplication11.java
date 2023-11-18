package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        for(int i=1; i<11; i++){
            System.out.println("Tabla de multiplicar del " + i);
            for(int j=1; j<11; j++){
                
                System.out.println(i + "x" + j + "=" + i*j);
            }
            
        }
    }

}
