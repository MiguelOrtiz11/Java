/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author migue
 */
public class Perro {
    String nombre;
    String raza;
    int edad;
    String color;
    
    //declaracion del constructor de la clase
    public Perro(String nombre, String raza, int edad, String color){
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.edad=edad;
    }
        
    //metodo 1
    public String getNombre(){
        return nombre;
    }
         
    //metodo 2
    public String getRaza(){
        return raza;
    }
    
    //metodo 3
    public int getEdad(){
        return edad;
    }
    
    // metodo 4
    public String getColor(){
        return color;
    }
    
    
    @Override
    public String toString(){
        return("Hola, mi nombre es " + this.getNombre() + 
                ".\n Mi raza, edad y color son: " + 
                this.getRaza() + ", " + this.getEdad() + 
                ", " + this.getColor());
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro Clifford = new Perro("Clifford", "Pitbull", 14, "Marron");
        Perro lulu = new Perro("Lulu", "Pincher", 2, "Negro");
        System.out.println(Clifford.toString());
        System.out.println("--------------------");
        System.out.println(lulu.toString());
    }
    
}
