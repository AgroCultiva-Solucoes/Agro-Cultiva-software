package dao;

import Classes.ConnectionFactory;
import Classes.Fertilizante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOfertilizante {

    public static void inserirFertilizante(Fertilizante fertilizante) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tbFertilizante (nomeFertilizante, tipoFertilizante, descricao) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fertilizante.getNomeFertilizante());
            stmt.setString(2, fertilizante.getTipoFertilizante());
            stmt.setString(3, fertilizante.getDescricao());
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
}
