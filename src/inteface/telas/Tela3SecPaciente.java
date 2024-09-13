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

public class Tela3SecPaciente extends JFrame {
    
    private EntityManagerFactory Emf;
    private Secretaria Sec;
    
    public Tela3SecPaciente(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        
        Emf = emf;
        Sec = sec;
        
        setTitle("Secretária");
        setSize(300,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerenciador de Pacientes");
        inicio.setBounds(10, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Cadastrar paciente");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        
        JButton botao2 = new javax.swing.JButton("Atualizar paciente");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
      
        
        
        JButton botao3 = new javax.swing.JButton("Remover paciente");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
      
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(20, 290, 80, 20);
        add(voltar);
        
       
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4SecCadastro secCadastro = new Tela4SecCadastro(Tela3SecPaciente.this,Emf, Sec);
            secCadastro.setVisible(true);
            secCadastro.setResizable(false);
            setVisible(false);
        //    dispose();
            
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4SecAtualizaPaciente secAtualizaPaciente = new Tela4SecAtualizaPaciente(Tela3SecPaciente.this,Emf, Sec);
            secAtualizaPaciente.setResizable(false);
            secAtualizaPaciente.setVisible(true);
            setVisible(false);
         //   dispose();
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4SecRemovePaciente secRemovePaci = new Tela4SecRemovePaciente(Tela3SecPaciente.this,Emf, Sec);
            secRemovePaci.setVisible(true);
            secRemovePaci.setResizable(false);
            setVisible(false);
         //   dispose();
            
            }
        });
    }
    
   
    
}   
