import javax.swing.JOptionPane;
public class CicloFor {
    public static void main(String argas[]){
        byte alum;
        float cu1, cu2, cu3, cu4, cu5, prom = 0;
        for(alum = 1; alum <= 34; alum ++) {
            cu1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa calificación unidad 1"));
            cu2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa calificación unidad 2"));
            cu3=Float.parseFloat(JOptionPane.showInputDialog("Ingresa calificación unidad 3"));
            cu4=Float.parseFloat(JOptionPane.showInputDialog("Ingresa calificación unidad 4"));
            cu5=Float.parseFloat(JOptionPane.showInputDialog("Ingresa calificación unidad 5"));
            prom = (cu1 + cu2 + cu3 + cu4 + cu5) / 5;
            System.out.println("Alumno: " + alum);
            System.out.println("Promedio: " + prom);
        }
    }
}
