/*Programa de demostracion de sobrecarga de metodos */

package sobrecargametodo;

public class SobrecargaMetodo {
    
    void demoSobrecarga(){
        System.out.println("Sin parametros\n");
    }
    //sobrecargando demoSobrecarga para un parametro int
    void demoSobrecarga(int a){
        System.out.println("un parametro: " + a + "\n");
    }
    //spbrecargando demoSobrecarga para dos parametros int
    int demoSobrecarga(int a, int b){
        System.out.println("dos parametros: " + a + ", " + b);
        return a+b;        
    }
    //sobrecarga demoSobrecarga para dos parametros double
    double demoSobrecarga(double a, double b){
        System.out.println("Dos parametros double: " + a + ", " + b);
        return a+b;
    }
    public static void main(String[] args) {
        SobrecargaMetodo obj = new SobrecargaMetodo();
        int sumaint;
        double sumadouble;
        
        //llamado a todas las versiones de demoSobrecarga
        obj.demoSobrecarga();
        obj.demoSobrecarga(4);
        
        //int - entero
        sumaint=obj.demoSobrecarga(6, 8);
        System.out.println("Resultado de demoSobrecarga(6, 8)es: " + sumaint
                + "\n");
        
        //double - decimal
        sumadouble= obj.demoSobrecarga(23.4, 2342.5);
        System.out.println("Resultado de demoSobrecarga(23.4, 2342.5) es: " 
                + sumadouble + "\n");   
    }    
}
