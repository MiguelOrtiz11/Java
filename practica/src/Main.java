import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite un numero entero: ");
        numero = sc.nextInt();
        if (numero > 0){
            System.out.print(numero + " es positivo y ");
        }else{
            System.out.print(numero + " es negativo y ");
        }
        if (numero % 2 == 0){
            System.out.print("es par ");
        }else{
            System.out.print("es impar ");
        }


    }



}

