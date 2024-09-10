/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela3SecRelato extends JFrame{
    Tela3SecRelato(){
        setTitle("Secretária");
        setSize(500,200);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

 
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 20));
        texto1.setText("Gerar relatórios das consultas");
        texto1.setBounds(80, 20, 400, 30);
        add(texto1);
        

        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setFont(new java.awt.Font("Tahoma", 1, 15));
        texto3.setText("Colocar a data de amanhã: (Ex: 18/08/2024)");
        texto3.setBounds(10, 50, 350, 50);
        add(texto3);
        
        JTextField data = new javax.swing.JTextField();
        data.setBounds(360, 67, 110, 20);
        add(data);
        
        
        // Fazer uma acão de enviar a data de amanha quando clicar o botão
        JButton botao1 = new javax.swing.JButton("Gerar");
        botao1.setBounds(50, 110, 400, 20);
        add(botao1);
        
        
        setVisible(true);
        
    }
      
}