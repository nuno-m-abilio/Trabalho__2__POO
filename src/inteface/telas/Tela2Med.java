/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.Secretaria;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Tela2Med extends JFrame {
    
    private EntityManagerFactory Emf;
    private Medico Med;
    private Secretaria Sec;
    
    public Tela2Med(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        
        Emf = emf;
        Med = med;
        
        setTitle("Medico");
        setSize(300,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Menu Médico");
        inicio.setBounds(70, 10, 300, 50);
        add(inicio);
        
        JButton botao1 = new javax.swing.JButton("Gerenciar dados adicionais");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        JButton botao2 = new javax.swing.JButton("Gerenciar prontuarios");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
       
        
        JButton botao3 = new javax.swing.JButton("Gerenciar relatorios medicos");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(20, 290, 80, 20);
        add(voltar);
        
       
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
           // dispose();
            }
        });
        

      //  setVisible(true);
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela3MedDados telamedDados = new Tela3MedDados(Tela2Med.this, Emf, Med);
            telamedDados.setVisible(true);
            telamedDados.setResizable(false);
         //   dispose();

            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela3MedProntuario telaMedPront = new Tela3MedProntuario(Tela2Med.this, Emf, Med);
            telaMedPront.setVisible(true);
            telaMedPront.setResizable(false);
            setVisible(false);
          //  dispose();
            
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela3MedRelatorio telaMedRelato= new Tela3MedRelatorio(Tela2Med.this, Emf, Med);
            telaMedRelato.setVisible(true);
            telaMedRelato.setResizable(false);
           // dispose();
        
            }
        });
    }

}
