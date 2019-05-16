
public class BusquedaBinaria {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final int[] arregloBinario = { 34, 67, 89, 100, 290, 500, 720 };

        final int valorBuscado = 89;
        final int valorBajo = 0;
        final int valorAlto = arregloBinario.length;

        final int valorCentral = valorBajo + (valorAlto / 2);

        while ((valorBajo < valorAlto) && (arregloBinario[valorCentral] != valorBuscado)) {
            if (valorBuscado < arregloBinario[valorCentral]) {
                valorAlto = valorCentral - 1;

            } else {
                valorBajo = valorCentral + 1;
                valorCentral = valorBajo / 2;
            }

        }
        if (valorBuscado = arregloBinario[valorCentral]) {
            ;
        }
    }

}
