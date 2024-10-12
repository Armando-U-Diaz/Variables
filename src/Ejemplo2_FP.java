import javax.swing.JOptionPane;
//Esto es un comentario de una sola linea
/* Armando Uriel Diaz Martinez
 * Fundamentos de programacion
 * 3102
 */
public class Ejemplo2_FP {
    public static void main(String[] args) {
        System.out.println("Hola mundo.");
        JOptionPane.showMessageDialog(null, "Bienvenido");

        //Defino y declaro un objeto
        Ejemplo3 obj1 = new Ejemplo3();
        //invocar al metodo capturaObjetos
        System.out.println("Adios " + obj1.capturarDatos());

    }
}


class Ejemplo3 {
    public String capturarDatos() {
        String nombre;
        nombre=JOptionPane.showInputDialog("Escribr tu nombre: ");
        return nombre;
    }
}
