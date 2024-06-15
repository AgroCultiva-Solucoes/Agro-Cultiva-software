package dialogos;

import dao.DAOfertilizante;
import Classes.Fertilizante;
import java.sql.SQLException;
import javax.swing.*;

public class InserirFertilizanteDialog extends JDialog {

    private JTextField txtNome;
    private JTextField txtTipo;
    private JTextArea txtDescricao;
    private JButton btnInserir;

    public InserirFertilizanteDialog(JFrame parent) {
        super(parent, "Inserir Fertilizante", true);

        txtNome = new JTextField(20);
        txtTipo = new JTextField(20);
        txtDescricao = new JTextArea(5, 20);
        btnInserir = new JButton("Inserir");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("Tipo:"));
        panel.add(txtTipo);
        panel.add(new JLabel("Descrição:"));
        panel.add(new JScrollPane(txtDescricao));
        panel.add(btnInserir);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnInserir.addActionListener(e -> {
            inserirFertilizante();
            dispose();
        });
    }

    private void inserirFertilizante() {
        String nome = txtNome.getText();
        String tipo = txtTipo.getText();
        String descricao = txtDescricao.getText();

        try {
            Fertilizante fertilizante = new Fertilizante(nome, tipo, descricao);
            DAOfertilizante.inserirFertilizante(fertilizante);
            JOptionPane.showMessageDialog(this, "Fertilizante inserido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir fertilizante: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

