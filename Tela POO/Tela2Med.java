/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Tela2Med extends JFrame {
    
    Tela2Med(){
        setTitle("Medico");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Menu Médico");
        inicio.setBounds(28, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Gerenciar dados adicionais");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        botao1.addActionListener( new ManipuladorDoBotaoMed1() );
        
        JButton botao2 = new javax.swing.JButton("Gerenciar prontuarios");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        botao2.addActionListener( new ManipuladorDoBotaoMed2() );
        
        JButton botao3 = new javax.swing.JButton("Gerenciar relatorios medicos");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        botao3.addActionListener( new ManipuladorDoBotaoMed3() );
        
        setVisible(true);
       
    }
   
    private class ManipuladorDoBotaoMed1 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3MedDados telamedDados = new Tela3MedDados();
        telamedDados.setResizable(false);
           
            
        }
    }
    private class ManipuladorDoBotaoMed2 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3MedProntuario telaMedPront = new Tela3MedProntuario();
        telaMedPront.setResizable(false);
           
            
        }
    }
        private class ManipuladorDoBotaoMed3 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3MedRelatorio telaMedRelato = new Tela3MedRelatorio();
        telaMedRelato.setResizable(false);
           
            
        }
    }
    
}