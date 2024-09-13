/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;


import AcessoMedico.Medico;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Tela3MedProntuario extends JFrame{
    
    private EntityManagerFactory Emf;
    private Medico Med;
    
    public Tela3MedProntuario(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        
        Emf = emf;
        Med = med;
        
        
        setTitle("Médico");
        setSize(300,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerenciador de Protuario");
        inicio.setBounds(15, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Cadastrar Prontuario");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        
        JButton botao2 = new javax.swing.JButton("Atualizar Prontuario");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        
        JButton botao3 = new javax.swing.JButton("Remover Prontuario");
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
            Tela4MedProntua medProntuario = new Tela4MedProntua(Tela3MedProntuario.this, Emf, Med);
            medProntuario.setVisible(true);
            medProntuario.setResizable(false);
            dispose();
            
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedAtualizaProntua medProntuarioAtualiza = new Tela4MedAtualizaProntua(Tela3MedProntuario.this, Emf, Med);
            medProntuarioAtualiza.setVisible(true);
            medProntuarioAtualiza.setResizable(false);
            dispose();
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedRemoveProntuario medProntuarioRemove = new Tela4MedRemoveProntuario(Tela3MedProntuario.this, Emf, Med);
            medProntuarioRemove.setVisible(true);
            medProntuarioRemove.setResizable(false);
            dispose();
            }
        });
       
        
    }
    
    
}
