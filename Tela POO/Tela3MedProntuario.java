/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Tela3MedProntuario extends JFrame{
    
    Tela3MedProntuario(){
        setTitle("Médico");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
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
        
        setVisible(true);
    }
    
}