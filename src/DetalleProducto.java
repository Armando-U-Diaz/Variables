public class DetalleProducto {
    public static void main(String args[]) {

        // Primer producto
        String nombreProducto = "Una Coca";
        float precio = 50.43F;
        int cantidadDisponible = 230;
        boolean ventadisponible = true;

        System.out.println("Peoducto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Disponible para la venta: " + ventadisponible);

        // Segundo producto
        nombreProducto = "Unas papas";
        precio = 389.43F;
        cantidadDisponible = 34;
        ventadisponible = false;

        System.out.println();
        System.out.println("Peoducto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
        System.out.println("Disponible para la venta: " + ventadisponible);
    }

}
