import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
    private JTextField campoNome;
    private JTextField campoPreco;
    private JTextField campoQuantidade;
    private JButton botaoCadastrar;
    private JTextArea areaProdutos;
    private JTextField campoRemover;
    private JButton botaoRemover;
    private Cadastro cadastro = new Cadastro();
    private TemaManager temaManager = new TemaManager();
    private JButton botaoTema;

    public TelaCadastro() {
        setTitle("Cadastro de Produtos");
        setSize(1024, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza

        JPanel painelForm = new JPanel();
        painelForm.setLayout(new BoxLayout(painelForm, BoxLayout.Y_AXIS));
        painelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // ===== Botão de alternância de tema =====
        JPanel linhaTema = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botaoTema = new JButton("🌙");
        linhaTema.add(botaoTema);
        painelForm.add(linhaTema);

        // ===== Campo Nome =====
        JPanel linhaNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaNome.add(new JLabel("Nome:"));
        campoNome = new JTextField(20);
        linhaNome.add(campoNome);
        painelForm.add(linhaNome);

        // ===== Campo Preço =====
        JPanel linhaPreco = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaPreco.add(new JLabel("Preço:"));
        campoPreco = new JTextField(10);
        linhaPreco.add(campoPreco);
        painelForm.add(linhaPreco);

        // ===== Campo Quantidade =====
        JPanel linhaQtd = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaQtd.add(new JLabel("Quantidade:"));
        campoQuantidade = new JTextField(5);
        linhaQtd.add(campoQuantidade);
        painelForm.add(linhaQtd);

        // ===== Botão Cadastrar =====
        JPanel linhaBotao = new JPanel(new FlowLayout(FlowLayout.LEFT));
        botaoCadastrar = new JButton("Cadastrar Produto");
        linhaBotao.add(botaoCadastrar);
        painelForm.add(linhaBotao);

        // ===== Área de produtos =====
        areaProdutos = new JTextArea();
        areaProdutos.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaProdutos);
        scroll.setPreferredSize(new Dimension(750, 150));
        scroll.setBorder(BorderFactory.createTitledBorder("Produtos Cadastrados"));
        painelForm.add(scroll);

        // ===== Linha de remoção (campo + botão lado a lado) =====
        JPanel painelRemover = new JPanel(new FlowLayout(FlowLayout.LEFT));
        campoRemover = new JTextField(10);
        painelRemover.add(new JLabel("Cod:"));
        botaoRemover = new JButton("Remover Produto");
        painelRemover.add(campoRemover);
        painelRemover.add(botaoRemover);
        painelForm.add(painelRemover);

        // ===== Ações =====
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarProduto();
            }
        });

        botaoRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerProduto();
            }
        });

        botaoTema.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temaManager.alternarTema(TelaCadastro.this, scroll, areaProdutos, botaoTema);
            }
        });

        // ===== Adiciona o painel principal ao JFrame =====
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(painelForm, BorderLayout.NORTH);
        
    }

    private void cadastrarProduto() {
        String nome = campoNome.getText().toUpperCase();
        String precoStr = campoPreco.getText().replace(",", ".");
        String quantidadeStr = campoQuantidade.getText();

        try {
            double preco = Double.parseDouble(precoStr);
            int quantidade = Integer.parseInt(quantidadeStr);

            cadastro.adicionarProduto(nome, preco, quantidade);
            atualizarAreaProdutos();

            campoNome.setText("");
            campoPreco.setText("");
            campoQuantidade.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preço ou quantidade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarAreaProdutos() {
        areaProdutos.setText("");
        for (Produto p : cadastro.getProdutos()) {
            areaProdutos.append(p.toString() + "\n");
        }
    }

    private void removerProduto() {
        String codigoStr = campoRemover.getText();
        try {
            int codigo = Integer.parseInt(codigoStr);
            cadastro.removerProduto(codigo);
            atualizarAreaProdutos();
            campoRemover.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um código válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }
}
