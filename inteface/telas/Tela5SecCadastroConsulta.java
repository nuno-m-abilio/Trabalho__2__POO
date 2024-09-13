package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tela5SecCadastroConsulta extends JFrame{
    
    public Tela5SecCadastroConsulta(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        
        setTitle("Menu Consulta");
        setSize(380, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Cadastra Consulta");
        inicio.setBounds(100, 1, 500, 50);
        add(inicio);
        
        JLabel texto5 = new javax.swing.JLabel();
        texto5.setText("CPF:");
        texto5.setBounds(50, 30, 100, 50);
        add(texto5);
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(120, 45, 180, 20);
        add(cpf);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Data: ");
        texto1.setBounds(50, 60, 100, 50);
        add(texto1);
        
        JTextField data = new javax.swing.JTextField("Ex: 02/08/2024");
        data.setBounds(120, 75, 180, 20);
        add(data);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Horario: ");
        texto2.setBounds(50, 90, 100, 50);
        add(texto2);
        
        JTextField horario = new javax.swing.JTextField("Ex: 17:40");
        horario.setBounds(120, 105, 180, 20);
        add(horario);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Medico: ");
        texto3.setBounds(50, 120, 100, 50);
        add(texto3);
        
        JTextField medico = new javax.swing.JTextField("Ex: Veronica");
        medico.setBounds(120, 135, 180, 20);
        add(medico);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Tipo da Consulta:");
        texto4.setBounds(50, 145, 100, 50);
        add(texto4);
        
        ButtonGroup grupo1 = new ButtonGroup();
        
        JRadioButton particular = new javax.swing.JRadioButton();
        particular.setText("Normal");
        particular.setBounds(50, 180, 100, 20);
        grupo1.add(particular);
        add(particular);
        
        JRadioButton plano = new javax.swing.JRadioButton();
        plano.setText("Retorno");
        plano.setBounds(150, 180, 120, 20);
        grupo1.add(plano);
        add(plano);
        
        JButton botao1 = new javax.swing.JButton("Cadastrar");
        botao1.setBounds(200, 210, 120, 30);
        add(botao1);
        
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(50, 210, 120, 30);
        add(voltar);
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                String cpf1 = cpf.getText();
                String data1 = data.getText();
                String horario1 = horario.getText();
                String medico1 = medico.getText();
                String tipo;
                if (particular.isSelected()){
                    tipo = "Normal";
                }
                else {
                    tipo = "Retorno";
                }
                sec.cadastrarConsulta(data1, horario1, medico1, cpf1, tipo, emf);
                
            }
        });
        
        
    }
    
}