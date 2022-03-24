public class personaje {
    private String name;
    private double estatura, peso;

    public personaje(String name, double estatura, double peso) {
        this.name = name;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public static void dormir(){
        System.out.println("zzzzzzzzzz");
    }
    public static void comer(){
        System.out.println("nom nom nom");
    }
}
