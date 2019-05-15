
public class CadenasEjemplos {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final String nombre = "ISRAEL ISAAC LOPEZ SANCHEZ";

        final char[] arregloNombre = nombre.toLowerCase().toCharArray();

        int valorNombre = 0;
        for (final char caracter : arregloNombre) {
            System.out.println(Integer.valueOf(caracter) + ":" + caracter);

            valorNombre = valorNombre + caracter;
        }

        System.out.println("El valor del nombre" + nombre.toLowerCase() + "es de:" + valorNombre);

    }

}
