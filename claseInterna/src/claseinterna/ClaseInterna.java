/* Programa Java para demostrar el acceso a una clase interna.
 */
package claseinterna;

public class ClaseInterna {
    int nums[];
    
    ClaseInterna(int n[]){
        nums = n;
    }
    void analizar(){
        Interna objint = new Interna();
        System.out.println("Minimo: " + objint.min());
        System.out.println("Maximo: " + objint.max());
        System.out.println("Promedio: " + objint.promedio());
    }
    
    //esta es la clase interna
    class Interna{
        int min(){
            int m=nums[0];
            for (int i=0;i<nums.length;i++){
                if (nums[i]<m){
                    m=nums[i];
                }
            }
            return m;
        }
        int max(){
            int m=nums[0];
            for(int i=0;i<nums.length;i++){
                if (nums[i]>m){
                    m=nums[i];
                }
            }
            return m;
        }
        int promedio(){
            int a=0;
            for (int i=0;i<nums.length;i++){
            a+=nums[i];
        }
        return a/nums.length;
        }
    }

    public static void main(String[] args) {
        int x[]={3,2,1,5,6,9,8};
        ClaseInterna objext = new ClaseInterna(x);
        objext.analizar();
        
    }
    
}
