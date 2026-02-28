import java.util.*;
void main() {
    Scanner teclado = new Scanner(System.in);


    Mascota Masco1 = new Mascota();

    Masco1.setNombre("Jacinto");
    Masco1.setEspecie("camaleon");
    Masco1.setEdad(15);
    Masco1.setPeso(15.4);
    Masco1.setVacunada(false);


    Mascota Masco3 = new Mascota();

    List<Mascota> lstMascota = new ArrayList<>();

    int opcion;
    do {

        System.out.println("PETS VETE");
        System.out.println("1. CREAR ANIMAL");
        System.out.println("2. MOSTRAR TODO");
        System.out.println("3. BUSCAR NOMBRE");

        opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> {


                System.out.println("Ingrese el nombre de la mascota: ");
                String nombre = teclado.next();

                System.out.println("Ingrese la especie de la mascota: ");
                String especie = teclado.next();

                System.out.println("Ingrese la edad de la mascota: ");
                int edad = teclado.nextInt();

                System.out.println("Ingrese el peso de la mascota: ");
                double peso = teclado.nextDouble();

               Mascota m2 = new Mascota (nombre, especie, edad, peso);
               lstMascota.add(m2);

            }
            case 2 -> {

                System.out.println(lstMascota);
                for (Mascota m : lstMascota) {
                    System.out.println(m);
                }
            }
            case 3 -> {
                String bus;
                System.out.println("INGRESE EL NOMBRE DEL ANIMAL PARA BUSCARLO: ");
                bus = teclado.next();

                Mascota masco1 = null;

                for (Mascota m1 : lstMascota) {
                    if (m1.getNombre().equalsIgnoreCase(bus)) {
                        masco1 = m1;
                    }

                }
                System.out.println("""
                        1.Alimentar
                        2.Vacunar
                        3. Cumplir años
                        """);
                int op;
                op = teclado.nextInt();
                switch (op) {

                    case 1 -> {
                        System.out.println("Ingrese la cantidad de alimento (en kg): ");
                        double peso = teclado.nextDouble();
                        Masco3.alimentar(peso);

                    }
                    case 2 -> {
                        Masco3.vacunar();

                        System.out.println("VACUNADO");
                    }
                    case 3 -> Masco3.años();

                    default -> System.out.println("opcion invalida");
                }
            }

            default -> System.out.println("opcion invalida");
        }
    } while (opcion != 3);
    System.out.println("Saliendo");

}