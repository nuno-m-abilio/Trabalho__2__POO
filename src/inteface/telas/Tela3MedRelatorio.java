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

public class Tela3MedRelatorio extends JFrame{
    
    private EntityManagerFactory Emf;
    private Medico Med;
   
    public Tela3MedRelatorio(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        
        Emf = emf;
        Med = med;
        
        setTitle("Médico");
        setSize(300,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        setLocationRelativeTo(null);
        setLayout(null);

        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Menu Relatórios:");
        inicio.setBounds(55, 20, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Gerar receita");
        botao1.setBounds(40, 80, 200, 40);
        add(botao1);
        
        
        JButton botao2 = new javax.swing.JButton("Gerar atestado");
        botao2.setBounds(40, 130, 200, 40);
        add(botao2);
        
        
        JButton botao3 = new javax.swing.JButton("Gerar declaracao");
        botao3.setBounds(40, 180, 200, 40);
        add(botao3);
        
        JButton botao4 = new javax.swing.JButton("Gerar total de clientes");
        botao4.setBounds(40, 230, 200, 40);
        add(botao4);
        
        
        //setVisible(true);
        
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
            Tela4MedReceita medReceita = new Tela4MedReceita(Tela3MedRelatorio.this, Emf, Med);
            medReceita.setVisible(true);
            medReceita.setResizable(false);
            //dispose();
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedAtestado medAtestado = new Tela4MedAtestado(Tela3MedRelatorio.this, Emf, Med);
            medAtestado.setVisible(true);
            medAtestado.setResizable(false);
            setVisible(false);
            //dispose();
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedDeclaracao medDeclaracao = new Tela4MedDeclaracao(Tela3MedRelatorio.this,Emf, Med);
            medDeclaracao.setVisible(true);
            medDeclaracao.setResizable(false);
            setVisible(false);
           // dispose();
            }
        });

          botao4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Tela4MedTotalPacientes medTotal = new Tela4MedTotalPacientes(Tela3MedRelatorio.this);
            medTotal.setVisible(true);
            
            }
        });
    }
}
               
