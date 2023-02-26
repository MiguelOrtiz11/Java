/* Programa Ajva para ilustrar el funcionamiento de las clases
internas locales */

package clase_interna_local;

//clase externa
public class Clase_interna_local {

    private void getValor(){
        int suma = 20;
        
        //metodo dentro de clase interna
        class Interna{
            private int divisor;
            private int resto;
            
            public Interna(){
                divisor = 4;
                resto= suma & divisor;
            }
            private int getDivisor(){
                return divisor;
            }
            private int getResto(){
                return suma%divisor;
            }
            private int getCociente(){
                System.out.println("Dentro de la clase local");
                return suma/divisor;
            }
        }
        Interna interna = new Interna();
        System.out.println("Divisor: " + interna.getDivisor());
        System.out.println("Resto: " + interna.getResto());
        System.out.println("Cociente: " + interna.getCociente());
    }


    
    public static void main(String[] args) {
        // TODO code application logic here
        Clase_interna_local externa = new Clase_interna_local();
        externa.getValor();
    }
    
}
