/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import Classes.ConnectionFactory;
import Classes.Climas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Time;
import java.sql.Date;



/**
 *
 * @author Hello
 */

public class DAOclima {
    public static void inserirClima(Climas clima) {
        String sql = "INSERT INTO tbclima (idClima, clima, data, hora, temperatura, umidade, precipitacao, velocidade_vento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, clima.getIdClima());
            stmt.setString(2, clima.getClima());
            stmt.setDate(3, Date.valueOf(clima.getData()));
            stmt.setTime(4, Time.valueOf(clima.getHora()));
            stmt.setFloat(5, clima.getTemperatura());
            stmt.setFloat(6, clima.getUmidade());
            stmt.setFloat(7, clima.getPrecipitacao());
            stmt.setFloat(8, clima.getVelocidade_vento());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos inseridos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void alterarClima(Climas clima) {
        String sql = "UPDATE tbclima SET clima = ?, data = ?, hora = ?, temperatura = ?, umidade = ?, precipitacao = ?, velocidade_vento = ? WHERE idClima = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, clima.getClima());
            stmt.setDate(2, Date.valueOf(clima.getData()));
            stmt.setTime(3, Time.valueOf(clima.getHora()));
            stmt.setFloat(4, clima.getTemperatura());
            stmt.setFloat(5, clima.getUmidade());
            stmt.setFloat(6, clima.getPrecipitacao());
            stmt.setFloat(7, clima.getVelocidade_vento());
            stmt.setInt(8, clima.getIdClima());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos atualizados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<Climas> listarClimas() {
        List<Climas> climas = new ArrayList<>();
        String sql = "SELECT * FROM tbclima";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Climas clima = new Climas();
                clima.setIdClima(rs.getInt("idClima"));
                clima.setClima(rs.getString("clima"));
                clima.setData(rs.getDate("data").toLocalDate());
                clima.setHora(rs.getTime("hora").toLocalTime());
                clima.setTemperatura(rs.getFloat("temperatura"));
                clima.setUmidade(rs.getFloat("umidade"));
                clima.setPrecipitacao(rs.getFloat("precipitacao"));
                clima.setVelocidade_vento(rs.getFloat("velocidade_vento"));
                climas.add(clima);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return climas;
    }

    public static void deletarClima(int idClima) {
        String sql = "DELETE FROM tbclima WHERE idClima = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idClima);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos excluídos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

   



}
