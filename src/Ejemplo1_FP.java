import javax.swing.JOptionPane;

public class Ejemplo1_FP {
    public static void main(String args[]) {
        byte b, h;
        float area;
        
        System.out.println("AREA DE UN TRIANGULO");
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa base"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingresala altura"));
        area=(b*h)/2;
        System.out.println("El area del triangulo es: " + area + " metros cuadrados.");
    }
}
