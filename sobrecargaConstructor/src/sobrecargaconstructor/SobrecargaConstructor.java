/*Demostracion de sobrecarga de sobrecarga de constructores 
 */
package sobrecargaconstructor;

public class SobrecargaConstructor {
    
    int x;
    
    //Constructor
    SobrecargaConstructor(){
        System.out.println("Dentro de la clase SobrecargaConstructor");
        x=0;
    }
    
    SobrecargaConstructor(int i){
        System.out.println("Dentro de la clase SobrecargaConstructor(int).");
        x=i;
    }
    
    SobrecargaConstructor(double d){
        System.out.println("Dentro de la clase SobrecargaConstructor(double)");
        x=(int)d;
    }
    
    SobrecargaConstructor(int i, int j){
        System.out.println("Dentro de la clase SobrecargaConstructor(int, int)");
        x=i*j;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SobrecargaConstructor obj1 = new SobrecargaConstructor();
        SobrecargaConstructor obj2 = new SobrecargaConstructor(23);
        SobrecargaConstructor obj3 = new SobrecargaConstructor(2.4);
        SobrecargaConstructor obj4 = new SobrecargaConstructor(233, 2342);
        
        System.out.println("obj1.x: " + obj1.x);
        System.out.println("obj2.x: " + obj2.x);
        System.out.println("obj3.x: " + obj3.x);
        System.out.println("obj4.x: " + obj4.x);
        
    }
    
}
