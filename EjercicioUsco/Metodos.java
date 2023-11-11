import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int op;
        do {
            do {
                System.out.println("Menu\n"
                        + "1. calculadora\n"
                        + "2. palindromo\n"
                        + "3. binario\n"
                        + "4. salir");
                op = Leer.nextInt();
            } while (op < 1 || op > 4);

            switch (op) {
                case 1:
                    calculadora();
                    break;
                case 2:
                    palindrome();
                    break;
                case 3:
                    binario();
                    break;
                case 4:
                    System.out.println("Se acabo el programa :D");
                    break;
            }
        } while (op != 4);

    }

    public static void calculadora() {
        Scanner Leer = new Scanner(System.in);
        float n1, n2, res;
        int ope;

        n1 = numero(1);
        n2 = numero(2);

        do {
            System.out.println("Operacion\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División");
            ope = Leer.nextInt();
        } while (ope < 1 || ope > 4);

        // Realiza la operación aquí según el valor de 'ope'
        // Puedes agregar el código correspondiente aquí
    }

    public static float numero(int num) {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el número " + num + ": ");
        return Leer.nextFloat();
    }

    public static void palindrome() {
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cad = Leer.next();
        boolean esPalindromo = esPalindromo(cad);
        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        // Aquí debes implementar la lógica para verificar si la cadena es un palíndromo
        // Puedes usar bucles para comparar los caracteres de la cadena
        return false; // Cambia esto según tu lógica
    }

    public static void binario() {
            Scanner Leer = new Scanner(System.in);
            System.out.print("Ingrese un número entero: ");
            int numero = Leer.nextInt();
            

            System.out.println("El número en binario es: ");
    }

}
