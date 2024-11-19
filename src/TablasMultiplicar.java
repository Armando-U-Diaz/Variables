import javax.swing.JOptionPane;
public class TablasMultiplicar {
    public static void main(String []arm) {
        byte num, x;
        int resultado = 0;
        for (num = 1; num <= 10; num ++) {
            x = 1;
            System.out.print("Tabla del: " + num + "\n");
            for (x = 1; x <= 10; x ++) {
                resultado = num * x;
                System.out.println(num + " * " + x + " = " + resultado);
            }
            System.out.println("\t");
        }
    }
}
