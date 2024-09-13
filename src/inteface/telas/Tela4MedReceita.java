/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;



import AcessoMedico.Medico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Tela4MedReceita extends JFrame {
    public Tela4MedReceita(JFrame telaAnterior, EntityManagerFactory emf, Medico med){
        setSize(500, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);     
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerar Receita");
        inicio.setBounds(170, 10, 300, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Nome do Paciente: ");
        texto1.setBounds(20, 45, 300, 50);
        add(texto1);
        
        
        JTextField nome = new javax.swing.JTextField("");
        nome.setBounds(150, 60, 300, 20);
        add(nome);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Nome do Remédio:");
        texto2.setBounds(20, 75, 300, 50);
        add(texto2);
        
        JTextField remedio = new javax.swing.JTextField("");
        remedio.setBounds(150, 90, 300, 20);
        add(remedio);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Doses Diárias:");
        texto3.setBounds(20, 105, 300, 50);
        add(texto3);
            
        JTextField doses = new javax.swing.JTextField("");
        doses.setBounds(150, 120, 300, 20);
        add(doses);
        
        JButton botao1 = new JButton("Imprimir");
        botao1.setBounds(250, 150, 200, 20);
        add(botao1);
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(20, 150, 200, 20);
        add(voltar);
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String nome1 = nome.getText();
                String remedio1 = remedio.getText();
                String doses1 = doses.getText();
                

                med.gerarReceita(nome1, remedio1, doses1);
            }
        });
        
        
    }
    
}