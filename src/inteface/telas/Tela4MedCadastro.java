
package inteface.telas;

import Registros.*;
import AcessoMedico.*;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Tela4MedCadastro extends JFrame {
    
    public Tela4MedCadastro(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
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
        
        JCheckBox doencaCardiaca = new javax.swing.JCheckBox("Cardiaco?");
        doencaCardiaca.setBounds(50, 190, 100, 25);
        add(doencaCardiaca);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Cirurgias: ");
        texto3.setBounds(50, 220, 100, 25);
        add(texto3);
        
        JTextField cirurgias = new javax.swing.JTextField("Ex: Torácica");
        cirurgias.setBounds(120, 222, 180, 20);
        add(cirurgias);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Alergias: ");
        texto4.setBounds(50, 250, 100, 25);
        add(texto4);
        
        JTextField alergias = new javax.swing.JTextField("Ex: Dipirona");
        alergias.setBounds(120, 252, 180, 20);
        add(alergias);
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(50, 300, 100, 20);
        add(voltar);
        
        JButton botao1 = new javax.swing.JButton("Cadastrar");
        botao1.setBounds(200, 300, 100, 20);
        add(botao1);
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
             dispose();
            }
        });
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String cpf1 = cpf.getText();
                boolean fuma1; 
                boolean bebe1;
                boolean colesterol1;
                boolean diabetes1;
                boolean doencaCardiaca1;
                if (fuma.isSelected()){
                    fuma1 = true;
                }
                else {
                    fuma1 = false;
                }
                if (bebe.isSelected()){
                    bebe1 = true;
                }
                else {
                    bebe1 = false;
                }
                if (colesterol.isSelected()){
                    colesterol1 = true;
                }
                else{
                    colesterol1 = false;
                }
                if (diabetes.isSelected()){
                    diabetes1 = true;
                }
                else{
                    diabetes1 = false;
                }
                if (doencaCardiaca.isSelected()){
                    doencaCardiaca1 = true;
                }
                else{
                    doencaCardiaca1 = false;
                }
                String cirurgias1 = cirurgias.getText();
                String alergias1 = alergias.getText();
                // Sem registro
                System.out.println(cpf1);
                System.out.println(fuma1);
                System.out.println(bebe1);
                System.out.println(colesterol1);
               
                
                
                med.insereHistorico( cpf1, fuma1, bebe1, colesterol1, diabetes1, doencaCardiaca1, cirurgias1, alergias1, emf);
            }
        });
        
    }
        
}