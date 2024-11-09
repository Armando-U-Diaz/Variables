import javax.swing.JOptionPane;
public class VETERINARIA {
    public static void main(String arg[]) {
        short x, costo = 0;
        float descuento = 0 , total, a = 0;
        System.out.println("Bienvenido a veterinaria PATITAS PELUDAS");
        x=Short.parseShort(JOptionPane.showInputDialog("Ocupa 1: Para Perrito. 2: Para Gatito. 3: Para Conejo. 4: Para Cuyo. "));
        switch (x) {
            case 1 -> { 
                costo = 500;
                System.out.println("PERRIO");
                System.out.println("Se le hara un descuento del 20%");                
                descuento =(float) 0.20;
            }
            case 2 -> {
                costo = 520;
                System.out.println("GATITIO");
                System.out.println("Se le hara un descuento del 10%");
                descuento = (float) 0.10;
            }
            case 3 -> {
                costo = 350;
                System.out.println("CONEJITO");
                System.out.println("Se le hara un descuento del 50%");                
                descuento = (float) 0.50;              
            }
            case 4 -> {
                costo = 400;
                System.out.println("CUYO");
                System.out.println("Se le hara un descuento del 80%");
                descuento = (float) 0.80;
            }
            default -> System.out.println("INGRESA NUMEROS DEL 1 AL 4.");
        }
         total = costo * descuento;
         a = costo - total;
        System.out.println("Costo de Esterilizacion: " + costo);
        System.out.println("Costo con descuento: $" + a);
    }
}
