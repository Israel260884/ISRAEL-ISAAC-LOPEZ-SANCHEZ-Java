
public class Nombre {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final String nombre = "Israel Lopez Sanchez";

        System.out.println(nombre.substring(7, 12));

        // Comparacion de cadenas

        final String israel = "israel";
        final String pedro = "pedro";

        if (israel.compareTo(pedro) == 0) {
            System.out.println("Son iguales" + israel + "y" + pedro);
        } else if (israel.compareTo(pedro) < 0) {
            System.out.println("Es mayor" + israel + "que" + pedro);
        } else if (israel.compareTo(pedro) > 0) {
            System.out.println("Es menor" + israel + "que" + pedro);
        }
    }

}
