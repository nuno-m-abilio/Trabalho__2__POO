package inteface.telas;

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

public class Tela5SecAtualizaConsulta extends JFrame {
    
    public Tela5SecAtualizaConsulta(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        
        setTitle("Menu Consulta");
        setSize(420, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Atualiza Consulta");
        inicio.setBounds(120, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto1.setText("Busca Consulta:");
        texto1.setBounds(30, 30, 180, 50);
        add(texto1);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("CPF:");
        texto2.setBounds(30, 60, 100, 50);
        add(texto2);
        
        JTextField antigo_cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        antigo_cpf.setBounds(140, 75, 180, 20);
        add(antigo_cpf);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Data:");
        texto3.setBounds(30, 90, 100, 50);
        add(texto3);
        
        JTextField antiga_data = new javax.swing.JTextField("Ex: 02/08/2024");
        antiga_data.setBounds(140, 105, 180, 20);
        add(antiga_data);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Horario:");
        texto4.setBounds(30, 120, 100, 50);
        add(texto4);
        
        JTextField antigo_horario = new javax.swing.JTextField("Ex: 17:40");
        antigo_horario.setBounds(140, 135, 180, 20);
        add(antigo_horario);
        
        JLabel texto8 = new javax.swing.JLabel();
        texto8.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto8.setText("Novos Dados da Consulta:");
        texto8.setBounds(30, 150, 220, 50);
        add(texto8);
        
        JLabel texto9 = new javax.swing.JLabel();
        texto9.setText("Nova Data: ");
        texto9.setBounds(30, 180, 100, 50);
        add(texto9);
        
        JTextField nova_data = new javax.swing.JTextField("Ex: 02/08/2024");
        nova_data.setBounds(140, 195, 180, 20);
        add(nova_data);
        
        JLabel texto10 = new javax.swing.JLabel();
        texto10.setText("Novo Horario: ");
        texto10.setBounds(30, 210, 100, 50);
        add(texto10);
        
        JTextField novo_horario = new javax.swing.JTextField("Ex: 17:40");
        novo_horario.setBounds(140, 225, 180, 20);
        add(novo_horario);
        
        JLabel texto11 = new javax.swing.JLabel();
        texto11.setText("Novo Medico:");
        texto11.setBounds(30, 240, 100, 50);
        add(texto11);
        
        JTextField novo_medico = new javax.swing.JTextField("Ex: Marcio");
        novo_medico.setBounds(140, 255, 180, 20);
        add(novo_medico);
        
        JLabel texto12 = new javax.swing.JLabel();
        texto12.setText("Tipo de Consulta:");
        texto12.setBounds(30, 270, 100, 50);
        add(texto12);
        
        ButtonGroup grupo2 = new ButtonGroup();
        
        JRadioButton normal = new javax.swing.JRadioButton();
        normal.setText("Normal");
        normal.setBounds(30, 310, 100, 20);
        grupo2.add(normal);
        add(normal);
        
        JRadioButton retorno = new javax.swing.JRadioButton();
        retorno.setText("Retorno");
        retorno.setBounds(140, 310, 120, 20);
        grupo2.add(retorno);
        add(retorno);
        
        JButton botao1 = new javax.swing.JButton("Atualizar");
        botao1.setBounds(220, 340, 120, 30);
        add(botao1);
        
        
        
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(70, 340, 120, 30);
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
        * BOTÃO QUE REALIZA A ATUALIZAÇÃO DE CONSULTAS, BUSCANDO A CONSULTA 
        * PELO CPF, DATA E HORARIO E DEPOIS INSERE AS NOVAS INFORMAÇÕES DA CONSULTA
        * A SER ATUALIZADA
        */
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                String cpf1 = antigo_cpf.getText();
                String data1 = antiga_data.getText();
                String data2 = nova_data.getText();
                String horario1 = antigo_horario.getText();
                String horario2 = novo_horario.getText();
                String medico1 = novo_medico.getText();
                String tipo;
                if (normal.isSelected()){
                    tipo = "Normal";
                }
                else {
                    tipo = "Retorno";
                }
        sec.atualizarConsulta(cpf1, data1, horario1,data2, horario2, medico1, cpf1, tipo, emf);
                
            }
        });
       
    }

}