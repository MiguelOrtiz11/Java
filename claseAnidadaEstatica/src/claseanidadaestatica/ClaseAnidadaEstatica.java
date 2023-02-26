/* Programa Java para demostrar una clase anidada estatica
 */
package claseanidadaestatica;

//clase externa
public class ClaseAnidadaEstatica {
    
    //miembro estatico
    static int externo_x=10;
    
    //miembro de instancia
    int externo_y=20;
    
    //miembro privado
    private static int externo_privado=30;
    
    //clase anidada estetica
    static class CalseAnidadaStatic{
        void mostrar(){
            //puede acceder al miembro estatico de la clase
            //externa
            System.out.println("externo_x: " + externo_x);
            //puede acceder a mostrar un miembro estatico
            //privado de la clase externa
            System.out.println("externo_privado: " + externo_privado);
        }
    } 
    
    public static void main(String[] args) {
        //accediendo a la clase anidada estatica
        ClaseAnidadaEstatica.CalseAnidadaStatic objetoAnidado = new ClaseAnidadaEstatica.CalseAnidadaStatic();
        objetoAnidado.mostrar();
        
    }    
}
