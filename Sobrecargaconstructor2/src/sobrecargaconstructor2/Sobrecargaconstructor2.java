/*Inicializar un objeto con otro
 */
package sobrecargaconstructor2;

public class Sobrecargaconstructor2 {
    
    int suma;
    
    //constructorr dedes un int
    Sobrecargaconstructor2(int num){
        suma=0;
        for(int i=1;i<num;i++){
            suma+=i;       
        }
    }

    //constructor desde otro objeto
    Sobrecargaconstructor2(Sobrecargaconstructor2 obj){
        suma=obj.suma;
                
    }
    
    public static void main(String[] args) {
        Sobrecargaconstructor2 obj1 = new Sobrecargaconstructor2(15);
        Sobrecargaconstructor2 obj2 = new Sobrecargaconstructor2(obj1);
        System.out.println("obj1.suma: " + obj1.suma);
        System.out.println("obj2.suma: " + obj2.suma);
    }
    
}
