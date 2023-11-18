/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones1;

/**
 * 
 * @author migue
 *    @ y alex
 */
public class Funciones1 {
    static int metodoEntero(){
        int suma=5+15;
        return suma;
    }
    
    static String metodoString(int n){
        if (n==0){
            return "a";
        }
        return "x";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(metodoEntero());
        System.out.println("ww");
        System.out.println(metodoString(0));
        
    }
    
}
