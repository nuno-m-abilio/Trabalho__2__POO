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
public class Tela3MedDados extends JFrame {
    
    Tela3MedDados(){
        setTitle("Medico");
        setSize(300,350);
        //getContentPane().setBackground(Color.orange);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //setVisible(true);
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
        
        botao1.addActionListener( new ManipuladorDoBotaoMedDados1() );
        
        JButton botao2 = new javax.swing.JButton("Atualizar dados adicionais");
        botao2.setBounds(40, 140, 200, 60);
        add(botao2);
        
        setVisible(true);
        
        JButton botao3 = new javax.swing.JButton("Remover dados adicionais");
        botao3.setBounds(40, 210, 200, 60);
        add(botao3);
        
        setVisible(true);
       
    }
   
    private class ManipuladorDoBotaoMedDados1 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //Tela4MedCadastro telamedCadastro = new Tela4MedCadastro();
        //telamedCadastro.setResizable(false);
           
            
        }
    }
    
}