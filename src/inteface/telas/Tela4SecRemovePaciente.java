package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4SecRemovePaciente extends JFrame{
    
    public Tela4SecRemovePaciente(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        setTitle("Menu Paciente");
        setSize(380, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Remove Paciente");
        inicio.setBounds(100, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("CPF: ");
        texto1.setBounds(50, 50, 100, 50);
        add(texto1);
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(120, 65, 180, 20);
        add(cpf);
        
        JButton botao1 = new javax.swing.JButton("Remover");
        botao1.setBounds(200, 110, 120, 30);
        add(botao1);
        
        
        
        
        
                
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(70, 110, 120, 30);
        add(voltar);
        
        /*
        * BOTÃO DE VOLTAR.
        */  
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        /*
        * BOTÃO QUE REMOVE PACIENTES, BUSCANDO O PACIENTE A SER REMOVIDO PELO CPF
        */
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String cpf1 = cpf.getText();
                
                sec.removerPaciente(cpf1, emf);
            }
        });
         
    }

}
