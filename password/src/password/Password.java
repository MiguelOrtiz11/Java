
package password;
import javax.swing.JOptionPane;

public class Password {
    
    //atributos
    private int longitud;
    private final String contraseña;
    
    //constante
    private final static int LONG_DEF=8;

    //constructores
    public Password(){
        this(LONG_DEF);
    }
    public Password(int longitud){
        this.longitud=longitud;
        contraseña=generaPassword();
    }
    
    //metodos publicos 
    public int getLongitud(){
        return longitud;
    }
    
    public void setLongitud(int longitud){
        this.longitud=longitud;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public String generaPassword(){
        StringBuilder password= new StringBuilder();
        for(int i=0;i<longitud;i++){
            //generamos un numerto aleatorio, segun este eslige 
            //si añadir una minuscula, mayuscula o numero 
            int eleccion=((int)Math.floor(Math.random()*3+1));
            if(eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password.append(minusculas);
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password.append(mayusculas);
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password.append(numeros);
                }
            }
        }
        return password.toString();
    }
    
    public boolean esFuerte(){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //vamos caracter a caracter y comprobamos que tipo de caractes es
        for(int i=0;i<contraseña.length();i++){
            if(contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                cuentaminusculas+=1;
            }else{
                if(contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                    cuentamayusculas+=1;
                }else{
                        cuentanumeros+=1;
                }
            }
        }
        return cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2;
    }
 
    
    public static void main(String[] args) {
        
        //introducimos el tamano del array y la longitud del password
        String texto=JOptionPane.showInputDialog("Digite un tamaño para el array");
        int tamaño=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("digite la longiitud del passoword");
        int longitud=Integer.parseInt(texto);
        
        //creamos los arrays
        Password[] listapassword =new Password[tamaño];
        boolean[] fortalezaPassword =new boolean[tamaño];
        
        //creamos objetos,  indicamos si es fuerte y mostramos la contraseña y su fortaleza
        for(int i=0;i<listapassword.length;i++){
            listapassword[i]=new Password(longitud);
            fortalezaPassword[i]= listapassword[i].esFuerte();
            System.out.println(listapassword[i].getContraseña() + " " + fortalezaPassword[i]);
        }
    }
    
}
