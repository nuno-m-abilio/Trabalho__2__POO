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
public class Tela2Sec extends JFrame{
    
    Tela2Sec(){
        setTitle("Secretária");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Menu Secretária");
        inicio.setBounds(60, 10, 300, 50);
        add(inicio);
        
        
        JButton botao1 = new javax.swing.JButton("Gerenciar pacientes");
        botao1.setBounds(40, 70, 200, 60);
        add(botao1);
        
        botao1.addActionListener( new ManipuladorDoBotaoSec1() );
        
        JButton botao2 = new javax.swing.JButton("Gerenciar consultas");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        botao2.addActionListener( new ManipuladorDoBotaoSec2() );
        
        JButton botao3 = new javax.swing.JButton("Gerar relatórios de consulta");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        botao3.addActionListener( new ManipuladorDoBotaoSec3() );
        
        setVisible(true);
       
    }
   
    private class ManipuladorDoBotaoSec1 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3SecPaciente telamedDados = new Tela3SecPaciente();
        telamedDados.setResizable(false);
           
            
        }
    }
    private class ManipuladorDoBotaoSec2 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3SecConsulta telaSecConsu = new Tela3SecConsulta();
        telaSecConsu.setResizable(false);
           
            
        }
    }
        private class ManipuladorDoBotaoSec3 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Tela3SecRelato telaMedRelato = new Tela3SecRelato();
        telaMedRelato.setResizable(false);
           
            
        }
    }
   

}
