
void main() {
    Scanner teclado = new Scanner (System.in);


    Mascota Masco1 = new Mascota();

    Masco1.setNombre("Jacinto");
    Masco1.setEspecie("camaleon");
    Masco1.setEdad(15);
    Masco1.setPeso(15.4);
    Masco1.setVacunada(false);

    System.out.println(Masco1.toString());

    Mascota Masco2 = new Mascota ("Jacinto", "Camaleon", 15, 15.4, false);
    System.out.println(Masco2.toString());

    Mascota Masco3 = new Mascota();
    System.out.println("Ingrese el nombre de la mascota");
    Masco3.setNombre(teclado.next());

    System.out.println("Ingrese la especie de la mascota");
    Masco3.setEspecie(teclado.next());

    System.out.println("Ingrese la edad de la mascota");
    Masco3.setEdas(teclado.nextInt());

    System.out.println("Ingrese el peso de la mascota");
    Masco3.setNombre(teclado.nextDouble());

    System.out.println("Ingrese false o true si esta vacunado la mascota");
    Masco3.setNombre(teclado.nextBoolean());












}