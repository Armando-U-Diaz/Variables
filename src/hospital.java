public class hospital {
    public static void main(String[] args) {
        int monto = 2000000;
        float a, b, c, d, e;
        double porcentaje;
        System.out.println("Monto del gobierno: $" + monto);
        System.out.println("De $" + monto + " se asigna un 20% en areas Pediatricas.");
        a = monto * 0.20F;
        System.out.println("Porsentaje designado: $" + a);
        System.out.println("De $" + monto + " se asigna un 15% en areas de Analisis Clinicos.");
        b = monto * 0.15F;
        System.out.println("Porcentaje designado: $" + b);
        System.out.println("De $" + monto + " se asigna un 40% en Ginecologia.");
        c = monto * 0.40F;
        System.out.println("Porcentaje designado: $" + c);
        System.out.println("De $" + monto + " se asigna un 10% en Infraestructura de Sanitarios.");
        d = monto * 0.10F;
        System.out.println("Porcentaje dsignado: $" + d);
        e = monto - a - b - c - d;
        porcentaje = e * 100 / monto;
        System.out.println("De $" + monto + " se asigna un " + porcentaje + "% en Servicios Generales.");
        System.out.println("Porcentaje designado: $" + e);
    }
}
