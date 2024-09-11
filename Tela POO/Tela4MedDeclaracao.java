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

public class Tela4MedDeclaracao  extends JFrame {
    Tela4MedDeclaracao(){
 setSize(500, 200);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);     
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerar Declaração");
        inicio.setBounds(150, 10, 300, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Nome do paciente:");
        texto1.setBounds(20, 45, 300, 50);
        add(texto1);
        
        
        JTextField nome = new javax.swing.JTextField("");
        nome.setBounds(165, 60, 210, 20);
        add(nome);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Nome do acompanhante:");
        texto2.setBounds(20, 75, 300, 50);
        add(texto2);
        
        JTextField acompanhante = new javax.swing.JTextField("");
        acompanhante.setBounds(165, 90, 210, 20);
        add(acompanhante);
        

        JButton botao1 = new JButton("Gerar");
        botao1.setBounds(390, 60, 80, 80);
        add(botao1);
        
        setVisible(true);
    }
    public static void main(String[] args) {
    new Tela4MedDeclaracao();
    }
    
}
