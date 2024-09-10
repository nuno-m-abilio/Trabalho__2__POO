/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tela1 extends JFrame {
    Tela1 (){
        setTitle("Inicial");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
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
        
        botao1.addActionListener( new ManipuladorDoBotao1() );
         
        
        JButton botao2 = new javax.swing.JButton("Secretária");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        botao2.addActionListener( new ManipuladorDoBotao2() );
        
        JButton botao3 = new javax.swing.JButton("Gerenciador de Mensagem");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        botao3.addActionListener( new ManipuladorDoBotao3() );
        
        setVisible(true);
        
        
        
    }
    private class ManipuladorDoBotao1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
           Tela2Med telaMed = new Tela2Med();
           telaMed.setResizable(false);
           
        }
    }
    private class ManipuladorDoBotao2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
           Tela2Sec telaSec = new Tela2Sec();
           telaSec.setResizable(false);
           
            
        }
    }
    private class ManipuladorDoBotao3 implements ActionListener {
        public void actionPerformed(ActionEvent e){
           Tela2GerenciadorMensagem gerenciadorMensagem = new Tela2GerenciadorMensagem();
           gerenciadorMensagem.setResizable(false);
        }
    }
}
