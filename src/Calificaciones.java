import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {

        char nuevaNota;
        byte nota;

        nota=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu nota en un valor de 1 a 20"));

        if (nota >= 19 && nota <= 20) {
            nuevaNota = 'A';
        }

        else if (nota >= 16 && nota <= 18) {
            nuevaNota = 'B';
        }

        else if (nota >= 13 && nota <= 15) {
            nuevaNota = 'C';
        }

        else if (nota >= 10 && nota <= 12) {
            nuevaNota = 'D';
        }

        else if (nota >= 1 && nota <= 9) {
            nuevaNota = 'E';
        }

        else {
            System.out.println("INGRESA VALORES DEL 1 AL 20");
            return;
        }

        System.out.println("Registro: " + nota);
        System.out.println("Nota: " + nuevaNota);

    }
}
