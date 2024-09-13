package inteface.telas;

import AcessoMedico.*;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4MedAtestado extends JFrame {
    public Tela4MedAtestado(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        
        setSize(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerar Atestado");
        inicio.setBounds(170, 10, 300, 50);
        add(inicio);

        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Nome do paciente: ");
        texto1.setBounds(20, 45, 300, 50);
        add(texto1);


        JTextField nome = new javax.swing.JTextField("");
        nome.setBounds(150, 60, 300, 20);
        add(nome);

        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("CPF :");
        texto2.setBounds(20, 75, 300, 50);
        add(texto2);

        JTextField cpf = new javax.swing.JTextField("");
        cpf.setBounds(150, 90, 300, 20);
        add(cpf);

        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Dias de Atestado:");
        texto3.setBounds(20, 105, 300, 50);
        add(texto3);

        JTextField atestado = new javax.swing.JTextField("");
        atestado.setBounds(150, 120, 300, 20);
        add(atestado);

        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(30, 170, 200, 20);
        add(voltar);

        JButton botao1 = new JButton("Imprimir");
        botao1.setBounds(250, 170, 200, 20);
        add(botao1);

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });

        botao1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String nome1 = nome.getText();
                String cpf1 = cpf.getText();
                String atestado1 = atestado.getText();
               
                
               med.gerarAtestado(nome1, cpf1, atestado1);
               setVisible(false);
            }
        });

        
    }

}