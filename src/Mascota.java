public class Mascota {


    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private Boolean vacunada;

    //CONSTRUCTOR VACIO
    public Mascota() {


    }

    //CONSTRUCTOR CON PARAMETROS

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunada = false;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Boolean getVacunada() {
        return vacunada;
    }

    public void setVacunada(Boolean vacunada) {
        this.vacunada = vacunada;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunada=" + vacunada +
                '}';
    }

    //METODOS

    //1. VACUNADO
    public void vacunar() {
    vacunada = true;


        }


    //2. ALIMENTAR
    public void alimentar(double cantidad) {
        if (peso == 0){
            System.out.println("NO HAY INFORMACION");
        }else if (cantidad >= 0) {
            peso = peso + cantidad;
            System.out.println("El peso es: " + peso);
        } else {
            System.out.println("No cantidades negativas, plis");
        }
    }

    //3. AÑOS
    public void años() {
        if (edad == 0) {
            System.out.println("NO HAY INFORMACION");
        } else {
            edad = edad + 1;
            System.out.println("cumplio años, ahora tiene: " + edad + "años");
        }
    }
    //4. MOSTRAR INFO
    public void info() {
        if (nombre == null && especie == null && edad == 0 && peso == 0 ) {
            System.out.println("Nombre: / ");
            System.out.println("Especie: /");
            System.out.println("Edad: /");
            System.out.println("Peso: /");
            System.out.println("Vacunado: /");
            System.out.println("  ");
            System.out.println("INGRESA INFORMACION DE LA MASCOTA:");


        } else {

            System.out.println("Nombre: " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Edad: " + edad);
            System.out.println("Peso: " + peso);

            if (vacunada == true){
                System.out.println("Vacunado: SI");

            }else {
                System.out.println("Vacunado: NO");
            }
        }

    }
}