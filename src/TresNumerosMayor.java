import javax.swing.JOptionPane;

public class TresNumerosMayor {
    public static void main(String args[]){
        
        byte a, b, c;
        
        System.out.println("Ingresa valores distintos");
        
        // Pedir datos numericos
        a=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero."));
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero distinto."));
        c=Byte.parseByte(JOptionPane.showInputDialog("Ingresa valores distintos:"));
        
        if (a>b && a>c) {
            System.out.println("El mayor es: " + a);
        }
        else if (b>a && b>c) {
            System.out.println("El mayor es: " + b);
        }
        else {
            System.out.println("El mayor es: " + c);
        }
        
    }
}
