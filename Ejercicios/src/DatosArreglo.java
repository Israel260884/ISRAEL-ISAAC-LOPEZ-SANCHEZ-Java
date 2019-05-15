public class DatosArreglo {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final int[] datosArreglo = new int[4];

        datosArreglo[0] = 5;
        datosArreglo[1] = 8;
        datosArreglo[2] = 9;
        datosArreglo[3] = 6;

        int suma = 0;

        for (final int datos : datosArreglo) {
            suma = suma + datos;
        }

        System.out.println("El promedio de la suma es:" + datosArreglo);

    }
}
