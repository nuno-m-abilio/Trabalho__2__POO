/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Tela4MedCadastro extends JFrame {
    
    public Tela4MedCadastro(){
        setTitle("Menu Cadastro");
        setSize(380, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Cadastro de Dados");
        inicio.setBounds(100, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("CPF: ");
        texto1.setBounds(50, 50, 100, 50);
        add(texto1);
        
        JTextField caixatexto1 = new javax.swing.JTextField("Ex: 123.456.789.10");
        caixatexto1.setBounds(120, 65, 180, 20);
        add(caixatexto1);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto2.setText("Comorbidades:");
        texto2.setBounds(50, 85, 180, 50);
        add(texto2);
        
        JCheckBox caixa1 = new javax.swing.JCheckBox("Fuma?");
        caixa1.setBounds(50, 130, 100, 25);
        add(caixa1);
        
        JCheckBox caixa2 = new javax.swing.JCheckBox("Bebe?");
        caixa2.setBounds(200, 130, 100, 25);
        add(caixa2);
        
        JCheckBox caixa3 = new javax.swing.JCheckBox("Alto Colesterol?");
        caixa3.setBounds(50, 160, 120, 25);
        add(caixa3);
        
        JCheckBox caixa4 = new javax.swing.JCheckBox("Diabetes?");
        caixa4.setBounds(200, 160, 100, 25);
        add(caixa4);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Cirurgias: ");
        texto3.setBounds(50, 190, 100, 25);
        add(texto3);
        
        JTextField caixatexto2 = new javax.swing.JTextField("Ex: Torácica");
        caixatexto2.setBounds(120, 192, 180, 20);
        add(caixatexto2);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Alergias: ");
        texto4.setBounds(50, 220, 100, 25);
        add(texto4);
        
        JTextField caixatexto3 = new javax.swing.JTextField("Ex: Dipirona");
        caixatexto3.setBounds(120, 222, 180, 20);
        add(caixatexto3);
        
        JButton bt1 = new javax.swing.JButton("Cadastrar");
        bt1.setBounds(90, 300, 180, 30);
        add(bt1);
        
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new Tela4MedCadastro();
    }
}
