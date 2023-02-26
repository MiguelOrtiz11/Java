/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones2;

/**
 *
 * @author migue
 */
public class Funciones2 {
    
    public static String saludar(String nombre){
        String saludo = "Hola. Bienvenido " + nombre;
        return saludo;
    }
        
    public static String error(String nombre){
        String error = "Ups... No podemos validar sus datos. " + 
                nombre + " es tu usuario?";
        return error;            
    }
    
    public static void verificar(String usuario, String contrasenia){
        String usuarioValido = "Miguel";
        String contraseniaValida = "79199122";
        //validamos los datos
        if (usuarioValido.equals(usuario) && 
                contraseniaValida.equals(contrasenia)){
            System.out.println(saludar(usuario));
            return;
        }
        System.out.println(error(usuario));
    
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        String usuario = "Miguel";
        String contrasenia = "79199122";
        verificar(usuario, contrasenia);
        
    }
    
}
