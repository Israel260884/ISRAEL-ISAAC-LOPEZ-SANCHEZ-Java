
public class ArregloCarros {

    public static void main(final String[] args) {

        final String[] marcaAutos = new String[9];
        final String[] marcaAutos2 = new String[9];

        marcaAutos[0] = "Alfa Romeo";
        marcaAutos[1] = "Fiat";
        marcaAutos[2] = "Ford";
        marcaAutos[3] = "Lancia";
        marcaAutos[4] = "Renault";
        marcaAutos[5] = "Seat";

        int i = marcaAutos.length - 6;
        final int p = 4;

        while (i >= p) {
            marcaAutos[i + 1] = marcaAutos[i];
            i = i - 1;
        }
        marcaAutos[p] = "Opel";

        for (int a = 0; a < marcaAutos.length; a++) {
            System.out.println(marcaAutos[a]);
        }

    }
}
