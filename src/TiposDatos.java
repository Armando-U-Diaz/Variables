public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java.

        // Enteros
        byte tipoByte = 127; // Valor maximo ( -128 a 127 ) del tipo Byte.
        // tipo Byte = (byte)128 ( Para hacer la convercion) pero se perde la precision de los datos.
        System.out.println("tipoByte = " + tipoByte); // soutv: Imprimir nombre de la variable y la variable.

        short tipoShort = 32000; // Valor maximo ( -32000 a 31999 ) del tipo Short.
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647; // Con un digito mas marca error y se tiene que hacer la convecion.
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321; // Si se exede el numero de digitos see le colocaria una letra "L" de literal.
        System.out.println("tipoLong = " + tipoLong);


        // Tipos de datos Punto Flotante
        float tipoFloat = 3.24F; // Utilizamos una "F" para declarar que 3.24 es de tipo float.
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315D; // La "D" es opcional
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter

        char tipoChar = 'A'; // caracter del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Tipo bolean
        boolean tipoBolean = true;
        System.out.println("tipoBolean = " + tipoBolean);
        tipoBolean = false;
        System.out.println("tipoBolean = " + tipoBolean);

        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Armandin";
        System.out.println("nombre = " + nombre);

    }
}
