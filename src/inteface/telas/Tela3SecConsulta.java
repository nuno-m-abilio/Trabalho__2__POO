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

public class Tela3SecConsulta extends JFrame{
    
    private EntityManagerFactory Emf;
    private Secretaria Sec;
    
    public Tela3SecConsulta(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        
        Emf = emf;
        Sec = sec;
        
        setTitle("Secretária");
        setSize(300,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Menu Consultas");
        inicio.setBounds(64, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Cadastrar consulta");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        

        
        JButton botao2 = new javax.swing.JButton("Atualizar consulta");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
       
        
       
        
        JButton botao3 = new javax.swing.JButton("Remover consulta");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        //setVisible(true);
        
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(20, 290, 80, 20);
        add(voltar);
        
       
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
        //   dispose();
            }
        });
       
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela5SecCadastroConsulta secCadastroConsulta = new Tela5SecCadastroConsulta(Tela3SecConsulta.this,Emf, Sec);
            secCadastroConsulta.setVisible(true);
            secCadastroConsulta.setResizable(false);
            setVisible(false);
        //    dispose();
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela5SecAtualizaConsulta secAtualizaConsulta = new Tela5SecAtualizaConsulta(Tela3SecConsulta.this,Emf, Sec);
            secAtualizaConsulta.setVisible(true);
            secAtualizaConsulta.setResizable(false);
            setVisible(false);
         //   dispose();
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4SecRemoveConsulta secRemoveConsul = new Tela4SecRemoveConsulta(Tela3SecConsulta.this,Emf, Sec);
            secRemoveConsul.setVisible(true);
            secRemoveConsul.setResizable(false);
            setVisible(false);
        //    dispose();
            }
        });
    }

    
}   


