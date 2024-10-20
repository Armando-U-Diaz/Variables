import javax.swing.JOptionPane;

public class Hipotenusa {
    public static void main(String args[]) {
        
        // Definir
        float cat1, cat2, hip, cats;
        
        //Imprimir
        System.out.println("Programa para calcular la hipotenusa de un triangulo");
        
        // Leer
        cat1=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida del primer cateto."));
        cat2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del segundo cateto"));
        
        // Proceso
        cats = cat1 + cat2;
        hip = (float)Math.sqrt(cats);
        
        System.out.println("La hipotenusa del triangulo es: " + hip);
    }
}
