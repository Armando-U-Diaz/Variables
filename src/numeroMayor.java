import javax.swing.JOptionPane;

public class numeroMayor {
    public static void main(String args[]) {
        
        // Definir
        short a, b;
        
        // Imprimir
        System.out.println("Introduzca dos valores distintos");
        
        // Leer
        a=Short.parseShort(JOptionPane.showInputDialog("Ingresa tu primer numero"));
        b=Short.parseShort(JOptionPane.showInputDialog("Ingresa tu segundo numero"));
        
        // desicion
        if (a==b) {
            System.out.println(a + " y " + b + " son iguales:");
        }
        else if (a>b) {
            System.out.println(a + " Es mayor.");
        }
        else {
            System.out.println(b + " Es mayor.");
        }
    }
}
