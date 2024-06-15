package dialogos;

import Classes.Estoque;
import dao.DAOestoque;
import java.sql.SQLException;
import javax.swing.*;

public class AlterarEstoqueDialog extends JDialog {

    private JTextField txtQuantidade;
    private JTextField txtValor;
    private JButton btnAlterar;
    private int idEstoque;

    public AlterarEstoqueDialog(JFrame parent, int idEstoque) {
        super(parent, "Alterar Estoque", true);
        this.idEstoque = idEstoque;

        txtQuantidade = new JTextField(10);
        txtValor = new JTextField(10);
        btnAlterar = new JButton("Alterar");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Quantidade:"));
        panel.add(txtQuantidade);
        panel.add(new JLabel("Valor:"));
        panel.add(txtValor);
        panel.add(btnAlterar);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnAlterar.addActionListener(e -> {
            alterarEstoque();
            dispose();
        });

        carregarDadosEstoque();
    }

    private void carregarDadosEstoque() {
        try {
            Estoque estoque = DAOestoque.buscarEstoquePorId(idEstoque);
            if (estoque != null) {
                txtQuantidade.setText(String.valueOf(estoque.getQuantidade()));
                txtValor.setText(String.valueOf(estoque.getPreco()));
            } else {
                JOptionPane.showMessageDialog(this, "Estoque não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do estoque: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    private void alterarEstoque() {
        double novaQuantidade = Double.parseDouble(txtQuantidade.getText());
        double novoValor = Double.parseDouble(txtValor.getText());

        try {
            Estoque estoque = new Estoque(idEstoque, novaQuantidade, novoValor);
            DAOestoque.alterarEstoquePorId(estoque);
            JOptionPane.showMessageDialog(this, "Estoque alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar estoque: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método principal para testar o diálogo
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setVisible(true);

            JButton btnOpenDialog = new JButton("Abrir Diálogo");
            btnOpenDialog.addActionListener(e -> {
                // Simulação de ID do estoque
                int idEstoque = 1; // ID da linha selecionada

                AlterarEstoqueDialog dialog = new AlterarEstoqueDialog(frame, idEstoque);
                dialog.setVisible(true);
            });

            frame.add(btnOpenDialog);
        });
    }
}
