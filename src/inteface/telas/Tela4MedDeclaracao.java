package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4MedDeclaracao  extends JFrame {
    public Tela4MedDeclaracao(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerar Declaração");
        inicio.setBounds(150, 10, 300, 50);
        add(inicio);

        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Nome do paciente:");
        texto1.setBounds(20, 45, 300, 50);
        add(texto1);

        JTextField nome = new javax.swing.JTextField("");
        nome.setBounds(165, 60, 290, 20);
        add(nome);

        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Nome do acompanhante:");
        texto2.setBounds(20, 75, 300, 50);
        add(texto2);

        JTextField acompanhante = new javax.swing.JTextField("");
        acompanhante.setBounds(165, 90, 290, 20);
        add(acompanhante);

        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(30, 125, 200, 20);
        add(voltar);

        JButton botao1 = new JButton("Gerar");
        botao1.setBounds(250, 125, 200, 20);
        add(botao1);

        /*
        * BOTÃO DE VOLTAR.
        */ 

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });

        /*
        * BOTÃO QUE GERA UMA DECLARAÇÃO DE ACOMPANHANTE, COM BASE NO NOME DO
        * PACIENTE E NO NOME DO ACOMPANHANTE
        */
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String nome1 = nome.getText();
                String acompanhante1 = acompanhante.getText();

                

               med.gerarDeclaracaoAcompanhante(nome1, acompanhante1);
            }
        });

    }

}
