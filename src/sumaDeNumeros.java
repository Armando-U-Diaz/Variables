public class sumaDeNmeros {
    public static void main(String[] args) {

        //Definir variables
        short numero1, numero2;
        float resultado, par;

        //Pedir datos
        System.out.println("Bienvenido a sumas rapidas");
        numero1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu primer numero."));
        numero2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu segundo numero."));

        //Ingresamos el proseso
        resultado=numero1+numero2;

        //Escribir el resultado de la suma
        System.out.println("El reultado de la suma de:");
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);

        //Decir si el resultado es par o impar
        par=resultado%2;
        if (par==0) {
            System.out.println("Tu resultado es Par.");}
        else {
            System.out.println("Tu resultado es Impar.");}

        
    }

}
