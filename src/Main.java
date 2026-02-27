
void main() {
    Scanner teclado = new Scanner(System.in);


    Mascota Masco1 = new Mascota();

    Masco1.setNombre("Jacinto");
    Masco1.setEspecie("camaleon");
    Masco1.setEdad(15);
    Masco1.setPeso(15.4);
    Masco1.setVacunada(false);


    Mascota Masco3 = new Mascota();



    int opcion;
    do {

        System.out.println("PETS VETE");
        System.out.println("1. INFORMACION INICIAL");
        System.out.println("2. ALIMENTAR");
        System.out.println("3. VACUNARLA");
        System.out.println("4. HACER CUMPLIR AÑOS");
        System.out.println("5. INFORMACION FINAL");


        opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> {
                if (Masco3.getNombre() == null) {
                    Masco3.info();

                    System.out.println("Ingrese el nombre de la mascota: ");
                    Masco3.setNombre(teclado.next());

                    System.out.println("Ingrese la especie de la mascota: ");
                    Masco3.setEspecie(teclado.next());

                    System.out.println("Ingrese la edad de la mascota: ");
                    Masco3.setEdad(teclado.nextInt());

                    System.out.println("Ingrese el peso de la mascota: ");
                    Masco3.setPeso(teclado.nextDouble());

                    Masco3.setVacunada(false);
                } else {
                    Masco3.info();
                }
            }
            case 2 -> {
                System.out.println("Ingrese la cantidad de alimento (en kg): ");
                double cantidad = teclado.nextDouble();
                Masco3.alimentar(cantidad);

            }
            case 3 -> {
                Masco3.vacunar();

                System.out.println("VACUNADO");
            }
            case 4 ->   Masco3.años();
            case 5 -> {
                Masco3.info();
            }
            default -> System.out.println("opcion invalida");
        }
    } while (opcion != 5);
    System.out.println("Saliendo");

}