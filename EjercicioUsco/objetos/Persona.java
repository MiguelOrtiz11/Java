package objetos;

public class Persona {

    // variables miembro
    private int ced;
    private String nom;
    private String ape;
    private String gen;

    // constructores
    public Persona() {

    }

    public Persona(int ced, String nom, String ape, String gen) {
        this.ced = ced;
        this.nom = nom;
        this.ape = ape;
        this.gen = gen;
    }

    // metodos get y set
    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    // metodos

    public String mostrar() {
        return "Persona" +
                "\nCedula: " + ced +
                "\nNombres: " + nom +
                "\nApellidos: " + ape +
                "\nGenero: " + gen;
    }

}
