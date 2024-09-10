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

public class Tela3SecConsulta extends JFrame{
    Tela3SecConsulta(){
        setTitle("Secretária");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //setVisible(true);
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
        
        //botao1.addActionListener( new ManipuladorDoBotaoSecConsu1() );
        
        JButton botao2 = new javax.swing.JButton("Atualizar consulta");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
       
        
       // botao2.addActionListener( new ManipuladorDoBotaoSecConsu2() );
        
        JButton botao3 = new javax.swing.JButton("Remover consulta");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        setVisible(true);
    }

        private class ManipuladorDoBotaoSecConsu1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
   //        Tela4SecCadastro telaSecCad = new Tela4SecCadastro();
    //       telaSecCad.setResizable(false);
           
            
        }
    }
    private class ManipuladorDoBotaoSecConsu2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
      //     Tela4SecCadastro telaSecCad = new Tela4SecCadastro();
       //    telaSecCad.setResizable(false);
           
            
        }
    }
    
    
    
    
}   