/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import Mensageiros.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2GerenciadorMensagem  extends JFrame {
 
   
    
    public Tela2GerenciadorMensagem(JFrame telaAnterior, EntityManagerFactory emf ) {
        setTitle("Gerenciador de Mensagens");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel texto1 = new JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 20));
        texto1.setText("Notificar Lembretes para pacientes ");
        texto1.setBounds(70, 20, 400, 30);
        add(texto1);

        JLabel texto3 = new JLabel();
        texto3.setFont(new java.awt.Font("Tahoma", 1, 15));
        texto3.setText("Colocar a data de amanhã: (Ex: 18/08/2024)");
        texto3.setBounds(10, 50, 350, 50);
        add(texto3);

        JTextField data = new JTextField();
        data.setBounds(360, 67, 110, 20);
        add(data);

        JButton botao1 = new JButton("Enviar notificação");
        botao1.setBounds(50, 110, 400, 20);
        add(botao1);
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(50, 130, 400, 20);
        add(voltar);
        

        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        
        MensageiroEmail mensageiroE = new MensageiroEmail();
        MensageiroSMS mensageiroS = new MensageiroSMS();
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data1 = data.getText();
            mensageiroE.enviarMensagem(data1, emf);
            mensageiroS.enviarMensagem(data1, emf);
                
            
            }
        });
        
       

      //  setVisible(true);
        
        
    }
    
}
    

