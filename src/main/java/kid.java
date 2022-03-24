public class kid extends personaje{
    private String colorPuerta;

    public kid(String name, double estatura, double peso) {
        super(name, estatura, peso);
    }

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }
    public static void llorar(){
        System.out.println("*sob*");
    }

}
