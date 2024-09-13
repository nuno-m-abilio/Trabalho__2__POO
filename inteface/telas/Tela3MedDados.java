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



public class Tela3MedDados extends JFrame {
    
    private EntityManagerFactory Emf;
    private Medico Med;
    
    public Tela3MedDados(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        
        Emf = emf;
        Med = med;
        
        setTitle("Medico");
        setSize(300,370); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerenciador de Dados");
        inicio.setBounds(28, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Cadastrar dados adicionais");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        
        JButton botao2 = new javax.swing.JButton("Atualizar dados adicionais");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        
        JButton botao3 = new javax.swing.JButton("Remover dados adicionais");
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
            Tela4MedCadastro medDados = new Tela4MedCadastro(Tela3MedDados.this, Emf, Med);
            medDados.setVisible(true);
            medDados.setResizable(false);
            dispose();
            
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedAtualizaDados medAtualizaDados = new Tela4MedAtualizaDados(Tela3MedDados.this, Emf, Med);
            medAtualizaDados.setVisible(true);
            medAtualizaDados.setResizable(false);
            dispose();
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedRemovePaciente medRemovePaciente = new Tela4MedRemovePaciente(Tela3MedDados.this, Emf, Med);
            medRemovePaciente.setVisible(true);
            medRemovePaciente.setResizable(false);
            dispose();
            }
        });
            
        
        
    }
   
  
}