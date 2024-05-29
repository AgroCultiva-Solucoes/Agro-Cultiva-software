
package dao;

import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

public class DAOusuario {
    private Connection conn;

    public DAOusuario(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email, cpf, senha, adm) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getCPF());
        stmt.setString(4, usuario.getSenha());
        stmt.setBoolean(5, usuario.getAdm());
        stmt.execute();
        stmt.close();
    }

    public Usuario logar(String email, String senha) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();

        Usuario usuario = null;
        if (rs.next()) {
            usuario = new Usuario();
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
            usuario.setCPF(rs.getString("cpf"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setAdm(rs.getBoolean("adm"));
        }

        rs.close();
        stmt.close();

        return usuario;
    }
} 
