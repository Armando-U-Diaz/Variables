// Inicio
import javax.swing.JOptionPane;

public class AreaVolumen {
    public static void main(String args[]) {
        
        // Definir
        double r, h, area, volumen;
        
        // Imprimir
        System.out.println("Calcula el area y volumen_de un cilindro");
        
        // Leer
        r=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del cilindro."));
        h=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del cilindro."));
        
        // Proceso
        volumen = Math.PI * Math.pow(r, 2) * h;
        area = (2 * Math.PI) * r;
        
        // Imprimir resultado
        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
    }
}
