import javax.swing.JOptionPane;

// Inicio
public class Par_o_Impar {
    public static void main(String arg[]) {
        
        // Definir variables
        double n, n1;
        
        // Imprimir
        System.out.println("Averigua si tu numero es Impar o Par.");
        
        // Leer
        n=Double.parseDouble(JOptionPane.showInputDialog("Ingresa unumero"));
        
        // Proceso
        n1 = n % 2;
        
        // Desicion
        // SI
        if (n1 == 0) {
            System.out.println(n + "  Es par.");
        }
        // NO
        else {
            System.out.println(n + "  Es impar.");
        }
    }
    
}
