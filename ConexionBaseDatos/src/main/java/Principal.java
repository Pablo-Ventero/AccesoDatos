import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

    // Configuración de la conexión a la base de datos PostgreSQL
    private static final String URL = "jdbc:postgresql://localhost:5432/PabloVentero";
    private static final String USER = "postgres";
    private static final String PASSWORD = "PabloVentero1";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Establecer la conexión usando JDBC
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión a la base de datos PostgreSQL establecida con éxito!");

        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos PostgreSQL.");
            e.printStackTrace();
        } finally {
            // Cerrar la conexión para liberar recursos
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexión cerrada correctamente.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}