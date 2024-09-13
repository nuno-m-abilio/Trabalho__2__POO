/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import AcessoMedico.*;
import AcessoSecretaria.*;
import javax.persistence.EntityManagerFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tela1 extends JFrame {
    private EntityManagerFactory Emf;
    private Medico Med;
    private Secretaria Sec;
    
    public Tela1(EntityManagerFactory emf, Medico med, Secretaria sec){
        
        Emf = emf;
        Med = med;
        Sec = sec;
        
        setTitle("Inicial");
        setSize(300,350);           
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 20));
        texto1.setText("Escolha seu perfil");
        texto1.setBounds(50, 10, 300, 50);
        add(texto1);
        
        
        JButton botao1 = new javax.swing.JButton("Médico");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
             
        
        JButton botao2 = new javax.swing.JButton("Secretária");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
     
        JButton botao3 = new javax.swing.JButton("Gerenciador de Mensagem");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        
        setVisible(true);

        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela2Med telaMed = new Tela2Med(Tela1.this, Emf, Med);
            telaMed.setVisible(true);
            telaMed.setResizable(false);
            setVisible(false);

            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela2Sec telaSec = new Tela2Sec(Tela1.this, Emf, Sec);
            telaSec.setVisible(true);
            telaSec.setResizable(false);
            setVisible(false);
          
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela2GerenciadorMensagem gerenciadorMensagem = new Tela2GerenciadorMensagem(Tela1.this, Emf);
            gerenciadorMensagem.setVisible(true);
            gerenciadorMensagem.setResizable(false);
            setVisible(false);
            }
        });
        

        
        
    }
        
}
        

