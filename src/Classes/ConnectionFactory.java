/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Hello
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {


    private final String usuario = "root";
    private final String senha = "@Heloisa111319";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String bd = "agrocultivasolucoes1";

    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd
                + "?serverTimezone=UTC",
                usuario,
                senha
            );
            System.out.println("Conexão Efetuada!!");
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("NÃO CONECTOU!!!");
            return null;
        }
    }

   public static void closeConnection(Connection c, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection c, PreparedStatement ps) {
        closeConnection(c, ps, null);
    }

    public static void closeConnection(Connection c) {
        closeConnection(c, null, null);
    }

    public static Connection getConnection() throws SQLException {
        return new ConnectionFactory().obtemConexao();
    }
}
