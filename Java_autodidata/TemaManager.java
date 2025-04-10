import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class TemaManager {
    private boolean modoEscuro = false;

    public void alternarTema(JFrame frame, JScrollPane scroll, JTextArea areaProdutos, JButton botaoTema)
    {
        modoEscuro = !modoEscuro;

        Color fundoClaro = Color.WHITE;
        Color textoClaro = Color.BLACK;

        Color fundoEscuro = new Color(34, 34, 34);         // cor mais escura
        Color textoEscuro = new Color(240, 240, 240);      // quase branco
        Color campoEscuro = new Color(50, 50, 50);         // campos mais escuros

        Color corFundo = modoEscuro ? fundoEscuro : fundoClaro;
        Color corTexto = modoEscuro ? textoEscuro : textoClaro;
        Color corCampo = modoEscuro ? campoEscuro : fundoClaro;

        Container contentPane = frame.getContentPane();
        contentPane.setBackground(corFundo);

        aplicarEstiloRecursivo(contentPane, corFundo, corTexto, corCampo);

        areaProdutos.setBackground(corCampo);
        areaProdutos.setForeground(corTexto);
        areaProdutos.setCaretColor(corTexto);

        scroll.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(corTexto),
            "Produtos Cadastrados",
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("SansSerif", Font.BOLD, 14),
            corTexto
        ));

        botaoTema.setText(modoEscuro ? "🌙" : "🌞");

    }

    private void aplicarEstiloRecursivo(Component comp, Color fundo, Color texto, Color campo) {
        comp.setBackground(fundo);
        comp.setForeground(texto);

        if (comp instanceof JPanel) {
            for (Component sub : ((JPanel) comp).getComponents()) {
                aplicarEstiloRecursivo(sub, fundo, texto, campo);
            }
        } else if (comp instanceof JScrollPane scrollPane) {
            scrollPane.getViewport().getView().setBackground(campo);
            scrollPane.getViewport().getView().setForeground(texto);
        } else if (comp instanceof JTextField campoTexto) {
            campoTexto.setBackground(campo);
            campoTexto.setForeground(texto);
            campoTexto.setCaretColor(texto);

        } else if (comp instanceof JButton botao) {
            if (modoEscuro) {
                botao.setBackground(new Color(70, 70, 70));
                botao.setForeground(Color.WHITE);
            } else {
                Color corBotaoClaro = UIManager.getColor("Button.background");
                if (corBotaoClaro == null) {
                    corBotaoClaro = new Color(238, 238, 238); // fallback
                }
                botao.setBackground(corBotaoClaro);
                botao.setForeground(Color.BLACK);
            }
        } else if (comp instanceof JLabel rotulo) {
            rotulo.setForeground(texto);        
        }
    }
}
