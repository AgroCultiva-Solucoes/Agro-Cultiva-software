/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Classes.Estoque;

/**
 *
 * @author Hello
 */
public class DAOestoque {



    public static void alterarEstoque(Estoque estoque) throws SQLException {
        String sql = "UPDATE tbestoque SET nome = ?, quantidade = ?, preco = ?, descricao = ? WHERE idEstoque = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, estoque.getNome());
            stmt.setInt(2, estoque.getQuantidade());
            stmt.setDouble(3, estoque.getPreco());
            stmt.setString(4, estoque.getDescricao());
            stmt.setInt(5, estoque.getIdEstoque());
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public static List<Estoque> listarEstoques() throws SQLException {
        String sql = "SELECT * FROM tbestoque";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Estoque> estoques = new ArrayList<>();
            while (rs.next()) {
                Estoque estoque = new Estoque();
                estoque.setIdEstoque(rs.getInt("idEstoque"));
                estoque.setNome(rs.getString("nome"));
                estoque.setQuantidade(rs.getInt("quantidade"));
                estoque.setPreco(rs.getDouble("preco"));
                estoque.setDescricao(rs.getString("descricao"));
                estoques.add(estoque);
            }
            return estoques;
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
    }

    public static void deletarEstoque(int idEstoque) throws SQLException {
        String sql = "DELETE FROM tbestoque WHERE idEstoque = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idEstoque);
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public static void inserir(Estoque estoque) throws SQLException {
       String sql = "INSERT INTO tbestoque (idEstoque, nome, quantidade, preco, descricao) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, estoque.getIdEstoque());
            stmt.setString(2, estoque.getNome());
            stmt.setInt(3, estoque.getQuantidade());
            stmt.setDouble(4, estoque.getPreco());
            stmt.setString(5, estoque.getDescricao());
            stmt.execute();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
}

