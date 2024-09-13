package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4MedAtualizaProntua extends JFrame{

    public Tela4MedAtualizaProntua(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        setTitle("Cadastro de Prontuario"); 
        setSize(380, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 25));
        texto1.setText("Atualizar Prontuario");
        texto1.setBounds(50, 30, 300, 50);
        add(texto1);

        JLabel texto7 = new javax.swing.JLabel();
        texto7.setText("CPF: ");
        texto7.setBounds(50, 85, 300, 50);
        add(texto7);

        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(125, 100, 180, 20);
        add(cpf);

        JLabel texto6 = new javax.swing.JLabel();
        texto6.setText("Protocolo:");
        texto6.setBounds(50, 115, 300, 50);
        add(texto6);

        JTextField protocolo = new javax.swing.JTextField("");
        protocolo.setBounds(125, 132, 180, 20);
        add(protocolo);

        JLabel texto8 = new javax.swing.JLabel();
        texto8.setFont(new java.awt.Font("Tahoma", 1, 16));
        texto8.setText("Informaçoes Prontuario: ");
        texto8.setBounds(50, 145, 300, 50);
        add(texto8);

        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Sintomas:");
        texto2.setBounds(50, 175, 300, 50);
        add(texto2);

        JTextField sintomas = new javax.swing.JTextField("");
        sintomas.setBounds(125, 192, 180, 20);
        add(sintomas);

        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Diagnostico:");
        texto3.setBounds(50, 205, 300, 50);
        add(texto3);

        JTextField diagnostico = new javax.swing.JTextField("");
        diagnostico.setBounds(125, 222, 180, 20);
        add(diagnostico);

        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Prescrição:");
        texto4.setBounds(50, 248, 100, 20);
        add(texto4);

        JTextField prescricao = new javax.swing.JTextField("");
        prescricao.setBounds(125, 250, 180, 20);
        add(prescricao);

        JLabel texto5 = new javax.swing.JLabel();
        texto5.setText("Médico:");
        texto5.setBounds(50, 275, 100, 20);
        add(texto5);

        JTextField medico = new javax.swing.JTextField("");
        medico.setBounds(125, 277, 180, 20);
        add(medico);

        JButton botao1 = new javax.swing.JButton("Enviar");
        botao1.setBounds(190, 310, 120, 30);
        add(botao1);


        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(60, 310, 120, 30);
        add(voltar);



        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String cpf1 = cpf.getText();
                String protocolo1 = protocolo.getText();
                String sintoma1 = sintomas.getText();
                String diagnostico1 = diagnostico.getText();
                String prescricao1 = prescricao.getText();
                String medico1 = medico.getText();
                
              
                
                med.atualizarProntuario(cpf1,protocolo1 ,sintoma1 , diagnostico1, prescricao1, medico1, emf);
            }
                
        });
            

    }
}