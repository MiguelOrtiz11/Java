
package cuenta;

public class Cuenta {
    //atributos
    private String titular;
    private double cantidad;
      
    //constructores
    public Cuenta(String titular){
        this(titular,0);
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular=titular;
        //si la cantidad es menor a cero, lo ponemos a cero
        if(cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad=cantidad;
        }
    }
    
    //metodos
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
    public String toString(){
        return "El titular " + titular + "tiene " + cantidad + 
                "pesos en la cuenta";
    }
    
    //ingresae dinero a la cuenta
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }else{
            this.cantidad-=cantidad;
        }
    }
    
    //retira dinero de la cuenta
    public void retirar(double cantidad){
        if(this.cantidad-cantidad < 0){
            this.cantidad=0;
        }else{
            this.cantidad-=cantidad;
        }
    }
    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Miguel");
        Cuenta cuenta2 = new Cuenta("Migue", 7000);
        
        //ingresa dinero en la cuenta
        cuenta1.ingresar(10000);
               
        //retirar dinero de la cuenta
        cuenta1.retirar(3000);
        cuenta2.retirar(3000);
               
        //mostrar informacion de las cuentas
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        
    }
}
