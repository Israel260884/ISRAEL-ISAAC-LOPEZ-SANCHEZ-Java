
public class BusquedaBinaria {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final int[] arregloBinario = { 34, 67, 89, 100, 290, 500, 720 };

        final int valorBuscado = 89;
        int valorBajo = 0;
        int valorAlto = arregloBinario.length;

        int valorCentral = (valorBajo + valorAlto) / 2;

        while ((valorBajo < valorAlto) && (arregloBinario[valorCentral] != valorBuscado)) {
            if (valorBuscado < arregloBinario[valorCentral]) {
                valorAlto = valorCentral - 1;

            } else {
                valorBajo = valorCentral + 1;

            }
            valorCentral = (valorBajo + valorAlto) / 2;

        }
        if (valorBuscado == arregloBinario[valorCentral]) {
            System.out.println("Valor encontrado en:" + valorCentral);

        } else {
            System.out.println("Valor no encontrado");
        }
    }

}
