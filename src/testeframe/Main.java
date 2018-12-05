/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Sera que o Igor vai dormir?");
        janela.setSize(500, 500);
        JLabel resposta = new JLabel("Nao");
        JButton botao1 = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");
        JButton botao4 = new JButton("Botao 4");
        JButton botao5 = new JButton("Botao 5");
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object [] opcao = {"Nao, com certeza nao"};
                JOptionPane.showOptionDialog(janela, "Nao, porque o Igor nao sabe o que e uma classe anonima", 
                        "Informaçao",
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE,
                        null, opcao, opcao[1]);
            }
        });
        //painel.setLayout(new BorderLayout(painel),BoxLayout.X_AXIS);

        
        janela.getContentPane().add(painel);
        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2, BorderLayout.EAST);
        painel.add(botao3, BorderLayout.SOUTH);
        painel.add(botao4, BorderLayout.WEST);
        painel.add(botao5, BorderLayout.CENTER);
        
        
        //janela.pack();
        janela.setVisible(true);
        janela.setVisible(true);janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
