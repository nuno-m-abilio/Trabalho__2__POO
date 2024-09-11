/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import javax.swing.JButton;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Tela4MedProntua extends JFrame {
    Tela4MedProntua(){
        setTitle("Cadastro de Prontuario"); 
        setSize(380, 400);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 25));
        texto1.setText("Criar Prontuario");
        texto1.setBounds(80, 30, 300, 50);
        add(texto1);
        
        JLabel texto7 = new javax.swing.JLabel();
        texto7.setText("CPF: ");
        texto7.setBounds(50, 85, 300, 50);
        add(texto7);
        
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(125, 100, 180, 20);
        add(cpf);
        
        JLabel texto6 = new javax.swing.JLabel();
        texto6.setText("Protocolo:");
        texto6.setBounds(50, 115, 300, 50);
        add(texto6);
        
        JTextField prontocolo = new javax.swing.JTextField("");
        prontocolo.setBounds(125, 130, 180, 20);
        add(prontocolo);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Sintomas:");
        texto2.setBounds(50, 145, 300, 50);
        add(texto2);
        
                
        JTextField sintomas = new javax.swing.JTextField("");
        sintomas.setBounds(125, 160, 180, 20);
        add(sintomas);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Diagnostico:");
        texto3.setBounds(50, 173, 300, 50);
        add(texto3);
        
        JTextField diagnostico = new javax.swing.JTextField("");
        diagnostico.setBounds(125, 190, 180, 20);
        add(diagnostico);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Prescrição:");
        texto4.setBounds(50, 218, 100, 20);
        add(texto4);
        
        JTextField prescricao = new javax.swing.JTextField("");
        prescricao.setBounds(125, 220, 180, 20);
        add(prescricao);
        
        JLabel texto5 = new javax.swing.JLabel();
        texto5.setText("Médico:");
        texto5.setBounds(50, 248, 100, 20);
        add(texto5);
                
        JTextField medico = new javax.swing.JTextField("");
        medico.setBounds(125, 250, 180, 20);
        add(medico);
        
       
        JButton botao1 = new javax.swing.JButton("Enviar e Sair");
        botao1.setBounds(130, 290, 150, 30);
        add(botao1);
        
        
        setVisible(true);
        
    }
        public static void main(String[] args) {
        new Tela4MedProntua();
    }
}
