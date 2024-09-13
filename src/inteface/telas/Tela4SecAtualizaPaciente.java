package inteface.telas;

import AcessoMedico.Medico;
import AcessoSecretaria.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManagerFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Tela4SecAtualizaPaciente extends JFrame{
    
    Tela4SecAtualizaPaciente(JFrame telaAnterior, EntityManagerFactory emf, Secretaria sec){
        setTitle("Atualiza Cadastro"); 
        setSize(380, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        texto1.setText("Atualiza Dados");
        texto1.setBounds(110, 1, 500, 50);
        add(texto1);
        
        JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Nome*: ");
        jLabel1.setBounds(50, 50, 100, 20);
        add(jLabel1);
        
        JTextField nome = new javax.swing.JTextField("Ex: João");
        nome.setBounds(120, 50, 180, 20);
        add(nome);
        
        JLabel jLabel2 = new javax.swing.JLabel();
        jLabel2.setText("CPF Antigo: ");
        jLabel2.setBounds(50, 80, 100, 20);
        add(jLabel2);
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(120, 80, 180, 20);
        add(cpf);
        
        JLabel jLabel3 = new javax.swing.JLabel();
        jLabel3.setText("Endereço*: ");
        jLabel3.setBounds(50, 110, 100, 20);
        add(jLabel3);
        
        JTextField endereco = new javax.swing.JTextField("Ex: Av. Pioneiro Angelo");
        endereco.setBounds(120, 110, 180, 20);
        add(endereco);
        
        JLabel jLabel4 = new javax.swing.JLabel();
        jLabel4.setText("Data Nasc*: ");
        jLabel4.setBounds(50, 140, 100, 20);
        add(jLabel4);
        
        JTextField nascimento = new javax.swing.JTextField("Ex: 18/08/2004");
        nascimento.setBounds(120, 140, 180, 20);
        add(nascimento);
        
        JLabel jLabel5 = new javax.swing.JLabel();
        jLabel5.setText("Número: ");
        jLabel5.setBounds(50, 170, 100, 20);
        add(jLabel5);
        
        JTextField numero = new javax.swing.JTextField("Ex: 44 98765-4321");
        numero.setBounds(120, 170, 180, 20);
        add(numero);
        
        JLabel jLabel6 = new javax.swing.JLabel();
        jLabel6.setText("Email: ");
        jLabel6.setBounds(50, 200, 100, 20);
        add(jLabel6);
        
        JTextField email = new javax.swing.JTextField("Ex: JGamerXD@gmail.com");
        email.setBounds(120, 200, 180, 20);
        add(email);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Novo CPF:");
        texto2.setBounds(50, 230, 100, 20);
        add(texto2);
        
        JTextField novo_cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        novo_cpf.setBounds(120, 230, 180, 20);
        add(novo_cpf);
        
        JLabel jLabel7 = new javax.swing.JLabel();
        jLabel7.setText("Convênio: ");
        jLabel7.setBounds(50, 260, 100, 20);
        add(jLabel7);

        ButtonGroup G1 = new ButtonGroup();
        
        JRadioButton jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.setText("Particular");
        jRadioButton1.setBounds(120, 260, 80, 20);
        G1.add(jRadioButton1);
        add(jRadioButton1);
        
        JRadioButton jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.setText("Plano");
        jRadioButton2.setBounds(200, 260, 120, 20);
        G1.add(jRadioButton2);
        add(jRadioButton2);
        
        JButton botao1 = new JButton("Enviar");
        botao1.setBounds(190, 300, 100, 30 );
        add(botao1);
        
        
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jRadioButton1.isSelected()){
                    String data1 =  jRadioButton1.getText(); // Obtém o texto do JTextField
                    System.out.println("Data inserida: " + data1); // Exibe no console
                }
            }
        });
        
        
        
        
        JButton voltar = new javax.swing.JButton("Voltar");
        voltar.setBounds(60, 300, 100, 30);
        add(voltar);
        
        
        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            telaAnterior.setVisible(true);
            dispose();
            }
        });
        
        botao1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String nome1 = nome.getText();
                String cpfantigo1 = cpf.getText();
                String endereco1 = endereco.getText();
                String nascimento1 = nascimento.getText();
                String numero1 = numero.getText();
                String email1 = email.getText();
                String cpfnovo = novo_cpf.getText();
                String convenio;
                if (jRadioButton1.isSelected()){
                    convenio = "Particular";
                }
                else {
                    convenio = "Plano";
                }
                sec.atualizarPaciente(cpfantigo1, nome1, cpfnovo, nascimento1, endereco1, numero1, email1, convenio,  emf);
                
            }
        });

    }
        
}