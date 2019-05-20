package DatosAlgoritmos;

public class TablaHash {
    private final int longitud;
    private Lista<E> lista[];

    public TablaHash(final int longitud) {
        this.longitud = longitud;
        Lista = new ListaSimpleEnlazada[longitud];
    }

    public void insertar(final String cadena) {
        final int hash = getHash(cadena);
        if (hash <= this.longitud) {
            for (final char caracter : cadena.toCharArray()) {
                System.out.println(Integer.valueOf(caracter) + ":" + caracter);
                valor = valor + caracter;
            }
        }
    }

}
