package dao;

import Classes.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOatividade {

    public static ResultSet contarAtividadesPorTipoSafra(String tipoSafra) throws SQLException {
    String sql = "SELECT " +
                 "    s.tipoSafra, " +
                 "    SUM(CASE WHEN a.tipo = 'plantio' THEN 1 ELSE 0 END) AS Plantado, " +
                 "    SUM(CASE WHEN a.tipo = 'colheita' THEN 1 ELSE 0 END) AS Colhido, " +
                 "    SUM(CASE WHEN a.tipo = 'fertilizante' THEN 1 ELSE 0 END) AS `Uso de Fertilizante`, " +
                 "    SUM(CASE WHEN a.tipo = 'pesticida' THEN 1 ELSE 0 END) AS `Uso de Pesticida` " +
                 "FROM tbAtividades a " +
                 "INNER JOIN tbSafra s ON a.idSafra = s.idSafra " +
                 "WHERE s.tipoSafra = ? " +
                 "  AND a.tipo IN ('plantio', 'colheita', 'fertilizante', 'pesticida') " +
                 "GROUP BY s.tipoSafra";

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conn = ConnectionFactory.getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, tipoSafra);
        rs = stmt.executeQuery();
    } catch (SQLException e) {
        throw e;
    } finally {
        ConnectionFactory.closeConnection(conn, stmt);
    }
    return rs;
}
}
