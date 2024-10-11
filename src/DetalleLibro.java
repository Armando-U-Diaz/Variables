public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El Señor de los anillos";
        int añoPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.00;

        //Imprimir datos
        System.out.println("Libro: " + tituloLibro);
        System.out.println("Año de publicacion: " + añoPublicacion);
        System.out.println("Disponibilidad del libro: " + libroDisponible);
        System.out.println("Precio: " + precio);
        //Que sucede si queremos modificar el titulo del libro
        tituloLibro = "El Señor De Los Anillos";
        System.out.println(tituloLibro);
    }
}
