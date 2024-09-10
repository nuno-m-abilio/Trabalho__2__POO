/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela3MedRelatorio extends JFrame{
   
    Tela3MedRelatorio(){
        setTitle("Médico");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
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
        
        
        setVisible(true);
    }
}
