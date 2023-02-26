/* swtich case puedo tener multiples vifurcaciones
*Hacer un programa con la estructura switch para evaluar un numero
*/
package pkgswitch.pkg1;

/**
 *
 * @author migue
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=2;
        switch (i){
            case 0:
                System.out.println("i es cero");
                break;
            case 1:
                System.out.println("i es uno");
                break;
            case 2:
                System.out.println("i es dos");
                break;
            case 3:
                System.out.println("i es tres");
                break;
        default:
            System.out.println("i es mayo que 3");
            break;
          
                
            
        }
    }
    
}
