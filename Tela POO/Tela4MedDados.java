
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
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(120, 65, 180, 20);
        add(cpf);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto2.setText("Comorbidades:");
        texto2.setBounds(50, 85, 180, 50);
        add(texto2);
        
        JCheckBox fuma = new javax.swing.JCheckBox("Fuma?");
        fuma.setBounds(50, 130, 100, 25);
        add(fuma);
        
        JCheckBox bebe = new javax.swing.JCheckBox("Bebe?");
        bebe.setBounds(200, 130, 100, 25);
        add(bebe);
        
        JCheckBox colesterol = new javax.swing.JCheckBox("Alto Colesterol?");
        colesterol.setBounds(50, 160, 120, 25);
        add(colesterol);
        
        JCheckBox diabetes = new javax.swing.JCheckBox("Diabetes?");
        diabetes.setBounds(200, 160, 100, 25);
        add(diabetes);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Cirurgias: ");
        texto3.setBounds(50, 190, 100, 25);
        add(texto3);
        
        JTextField cirurgias = new javax.swing.JTextField("Ex: Torácica");
        cirurgias.setBounds(120, 192, 180, 20);
        add(cirurgias);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Alergias: ");
        texto4.setBounds(50, 220, 100, 25);
        add(texto4);
        
        JTextField alergias = new javax.swing.JTextField("Ex: Dipirona");
        alergias.setBounds(120, 222, 180, 20);
        add(alergias);
        
        JButton botao1 = new javax.swing.JButton("Cadastrar");
        botao1.setBounds(90, 300, 180, 30);
        add(botao1);
        
        setVisible(true);
    }
        
    public static void main(String[] args) {
        new Tela4MedCadastro();
    }
}
