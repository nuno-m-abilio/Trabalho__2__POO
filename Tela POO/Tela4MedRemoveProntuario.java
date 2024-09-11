
package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4MedRemoveProntuario extends JFrame{
    
    public Tela4MedRemoveProntuario(){
        
        setTitle("Menu Cadastro");
        setSize(380, 225);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Remove Prontuario");
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
        texto2.setText("Protocolo: ");
        texto2.setBounds(50, 80, 100, 50);
        add(texto2);
        
        JTextField caixatexto2 = new javax.swing.JTextField("Ex: 121212");
        caixatexto2.setBounds(120, 95, 180, 20);
        add(caixatexto2);
        
        JButton bt1 = new javax.swing.JButton("Remover");
        bt1.setBounds(100, 135, 180, 30);
        add(bt1);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Tela4MedRemoveProntuario();
    }
}
