import java.util.Scanner;

//Mostrar un menu de las siguientes operaciones: calculadora, palindrome, binario

public class Metodos {
    public static void main(String[] args) {
        Scanner Read = new Scanner(Sysem.in);

        int op;
        do {
            do {
                System.out.println("Menu"
                        + "1. calculadora"
                        + "2. palindromo"
                        + "3. binario"
                        + "4. salir");
                op = Leer.nextInt();
            } while (op < 1 || op > 2);

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

        // Metodos

    }
}
