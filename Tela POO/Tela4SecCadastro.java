/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tela4SecCadastro extends JFrame {
    Tela4SecCadastro(){
        setTitle("Menu Cadastro"); 
        setSize(380, 400);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel jLabel0 = new javax.swing.JLabel();
        jLabel0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel0.setText("Cadastro de Dados");
        jLabel0.setBounds(100, 1, 500, 50);
        add(jLabel0);
        
        JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Nome*: ");
        jLabel1.setBounds(50, 50, 100, 20);
        add(jLabel1);
        
        JTextField jTextField1 = new javax.swing.JTextField("Ex: JG");
        jTextField1.setBounds(120, 50, 180, 20);
        add(jTextField1);
        
        JLabel jLabel2 = new javax.swing.JLabel();
        jLabel2.setText("CPF*: ");
        jLabel2.setBounds(50, 80, 100, 20);
        add(jLabel2);
        
        JTextField jTextField2 = new javax.swing.JTextField("Ex: 123.456.789.10");
        jTextField2.setBounds(120, 80, 180, 20);
        add(jTextField2);
        
        JLabel jLabel3 = new javax.swing.JLabel();
        jLabel3.setText("Endereço*: ");
        jLabel3.setBounds(50, 110, 100, 20);
        add(jLabel3);
        
        JTextField jTextField3 = new javax.swing.JTextField("Ex: Av. Casa do Krl");
        jTextField3.setBounds(120, 110, 180, 20);
        add(jTextField3);
        
        JLabel jLabel4 = new javax.swing.JLabel();
        jLabel4.setText("Data Nasc*: ");
        jLabel4.setBounds(50, 140, 100, 20);
        add(jLabel4);
        
        JTextField jTextField4 = new javax.swing.JTextField("Ex: 18/08/2004");
        jTextField4.setBounds(120, 140, 180, 20);
        add(jTextField4);
        
        JLabel jLabel5 = new javax.swing.JLabel();
        jLabel5.setText("Número: ");
        jLabel5.setBounds(50, 170, 100, 20);
        add(jLabel5);
        
        JTextField jTextField5 = new javax.swing.JTextField("Ex: 44 98765-4321");
        jTextField5.setBounds(120, 170, 180, 20);
        add(jTextField5);
        
        JLabel jLabel6 = new javax.swing.JLabel();
        jLabel6.setText("Email: ");
        jLabel6.setBounds(50, 200, 100, 20);
        add(jLabel6);
        
        JTextField jTextField6 = new javax.swing.JTextField("Ex: JGaymerXD@gmail.com");
        jTextField6.setBounds(120, 200, 180, 20);
        add(jTextField6);
        
        JLabel jLabel7 = new javax.swing.JLabel();
        jLabel7.setText("Convênio: ");
        jLabel7.setBounds(50, 230, 100, 20);
        add(jLabel7);
        
//        JComboBox jComboBox1 = new javax.swing.JComboBox();
//        jComboBox1.addItem("Particular");
//        jComboBox1.addItem("Plano");
//        jComboBox1.setBounds(120, 230, 150, 20 );
//        add(jComboBox1);
        ButtonGroup G1 = new ButtonGroup();
        
        JRadioButton jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.setText("Particular");
        jRadioButton1.setBounds(120, 230, 80, 20);
        G1.add(jRadioButton1);
        add(jRadioButton1);
        
        JRadioButton jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.setText("Plano");
        jRadioButton2.setBounds(200, 230, 120, 20);
        G1.add(jRadioButton2);
        add(jRadioButton2);
        
        JButton btn1 = new JButton("Enviar e Sair");
        btn1.setBounds(130, 260, 150, 30 );
        add(btn1);
        setVisible(true);

    }
        
}
