package br.fgatech.threads;

import javax.swing.*;

public class TelaCalculadora {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Multiplicação decorada");

        JTextField primeiro = new JTextField(10);
        JTextField segundo = new JTextField(10);
        JButton botao = new JButton(" = ");
        JLabel resultado = new JLabel("                 ?               ");

        botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado));

        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(new JLabel("x"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);

    }
}
