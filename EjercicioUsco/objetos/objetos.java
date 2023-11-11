package objetos;

import javax.swing.JOptionPane;

public class objetos {

    public static void main(String[] args) {
        /*
         * capturar los datos de una persona
         */
        String aux;
        Persona P1 = new Persona();
        // pedimos los datos
        do {
            do {
                aux = JOptionPane.showInputDialog("Digite la cedula de la 1 persona");
            } while (aux.isEmpty());
            // ced = Integer.parseInt(aux);
            P1.setCed(Integer.parseInt(aux));
        } while (P1.getCed() < 1 || P1.getCed() > 2000000000);
        do {
            P1.setNom(JOptionPane.showInputDialog("Digite su nombre"));
        } while (P1.getNom().isEmpty());
        do {
            P1.setApe(JOptionPane.showInputDialog("Digite su apellidos"));
        } while (P1.getApe().isEmpty());
        do {
            do {
                aux = JOptionPane.showInputDialog("Digite su genero"
                        + "\n1. Masculino"
                        + "\n2. Fenenino");
            } while (aux.isEmpty());
        } while (Integer.parseInt(aux) < 1 || Integer.parseInt(aux) > 2);
        if (Integer.parseInt(aux) == 1)
            P1.setGen("Masculino");
        else
            P1.setGen("Femenino");
        // mostrar
        JOptionPane.showMessageDialog(null, P1.mostrar());

    }

}