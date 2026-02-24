public class Mascota {


    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private Boolean vacunada;

    //CONSTRUCTOR VACIO
    public Mascota(){


    }

    //CONSTRUCTOR CON PARAMETROS

    public Mascota(double vacunada, Boolean peso, int edad, String especie, String nombre) {
        this.vacunada = vacunada;
        this.peso = peso;
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
    }
    //GET AND SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getPeso() {
        return peso;
    }

    public void setPeso(Boolean peso) {
        this.peso = peso;
    }

    public double getVacunada() {
        return vacunada;
    }

    public void setVacunada(double vacunada) {
        this.vacunada = vacunada;
    }
}
