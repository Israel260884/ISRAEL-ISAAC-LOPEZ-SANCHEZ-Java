import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBaseDatos {
    public static void main(final String[] args) {

        final Conexion baseDeDatos = new Conexion();
//jkkjkjkj
        final Connection c = baseDeDatos.conectarBasedeDatos();

        final String nombreTabla = "Asistencia";
        final String querySQL = "INSERT INTO public.\"" + nombreTabla
                + "\" (nombre,apellidopaterno,apellidomaterno,asitio) VALUES(?,?,?,?);";
        final String querySQLSelect = "SELECT*FROM public.\"" + nombreTabla + "\";";

        try {
            PreparedStatement ps = c.prepareStatement(querySQL);
            ps.setString(1, "Abel");
            ps.setString(2, "Merino");
            ps.setString(3, null);
            ps.setBoolean(4, false);

            ps.executeUpdate();

            ps = c.prepareStatement(querySQLSelect);
            final ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getString("nombre"));
                System.out.print(" ");
                System.out.print(rs.getString("apellidopaterno"));
                System.out.print(" ");
                System.out.print(rs.getString("apellidomaterno"));
                System.out.print(" ");
                System.out.print(rs.getBoolean("asitio"));
                System.out.println();
            }

        } catch (final SQLException e) {
            e.printStackTrace();

        }
    }
}
