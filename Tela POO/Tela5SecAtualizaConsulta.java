package Telas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tela5SecAtualizaConsulta extends JFrame {
    
    public Tela5SecAtualizaConsulta(){
        
        setTitle("Menu Consulta");
        setSize(420, 550);
        setLocationRelativeTo(null);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Atualiza Consulta");
        inicio.setBounds(120, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto1.setText("Dados Paciente:");
        texto1.setBounds(30, 30, 180, 50);
        add(texto1);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Primeiro Nome:");
        texto2.setBounds(30, 60, 100, 50);
        add(texto2);
        
        JTextField nome = new javax.swing.JTextField("Ex: José");
        nome.setBounds(140, 75, 180, 20);
        add(nome);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Data de Nascimento:");
        texto3.setBounds(30, 90, 100, 50);
        add(texto3);
        
        JTextField nascimento = new javax.swing.JTextField("Ex: 29/12/2004");
        nascimento.setBounds(140, 105, 180, 20);
        add(nascimento);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Endereço:");
        texto4.setBounds(30, 120, 100, 50);
        add(texto4);
        
        JTextField endereco = new javax.swing.JTextField("Ex: Rua Santos Dumont 116");
        endereco.setBounds(140, 135, 180, 20);
        add(endereco);
        
        JLabel texto5 = new javax.swing.JLabel();
        texto5.setText("Celular:");
        texto5.setBounds(30, 150, 100, 50);
        add(texto5);
        
        JTextField celular = new javax.swing.JTextField("Se não tiver, digite / ");
        celular.setBounds(140, 165, 180, 20);
        add(celular);
        
        JLabel texto6 = new javax.swing.JLabel();
        texto6.setText("Email:");
        texto6.setBounds(30, 180, 100, 50);
        add(texto6);
        
        JTextField email = new javax.swing.JTextField("Se não tiver, digite / ");
        email.setBounds(140, 195, 180, 20);
        add(email);
        
        JLabel texto7 = new javax.swing.JLabel();
        texto7.setText("Tipo de Convenio:");
        texto7.setBounds(30, 210, 100, 50);
        add(texto7);
        
        ButtonGroup grupo1 = new ButtonGroup();
        
        JRadioButton particular = new javax.swing.JRadioButton();
        particular.setText("Particular");
        particular.setBounds(30, 250, 100, 20);
        grupo1.add(particular);
        add(particular);
        
        JRadioButton plano = new javax.swing.JRadioButton();
        plano.setText("Plano");
        plano.setBounds(140, 250, 120, 20);
        grupo1.add(plano);
        add(plano);
        
        JLabel texto8 = new javax.swing.JLabel();
        texto8.setFont(new java.awt.Font("Tahoma", 1, 14));
        texto8.setText("Dados Consulta:");
        texto8.setBounds(30, 265, 180, 50);
        add(texto8);
        
        JLabel texto9 = new javax.swing.JLabel();
        texto9.setText("Data: ");
        texto9.setBounds(30, 300, 100, 50);
        add(texto9);
        
        JTextField data = new javax.swing.JTextField("Ex: 02/08/2024");
        data.setBounds(140, 315, 180, 20);
        add(data);
        
        JLabel texto10 = new javax.swing.JLabel();
        texto10.setText("Horario: ");
        texto10.setBounds(30, 330, 100, 50);
        add(texto10);
        
        JTextField horario = new javax.swing.JTextField("Ex: 17:40");
        horario.setBounds(140, 345, 180, 20);
        add(horario);
        
        JLabel texto11 = new javax.swing.JLabel();
        texto11.setText("Nome do Médico:");
        texto11.setBounds(30, 360, 100, 50);
        add(texto11);
        
        JTextField medico = new javax.swing.JTextField("Ex: Marcio");
        medico.setBounds(140, 375, 180, 20);
        add(medico);
        
        JLabel texto12 = new javax.swing.JLabel();
        texto12.setText("Tipo de Consulta:");
        texto12.setBounds(30, 390, 100, 50);
        add(texto12);
        
        ButtonGroup grupo2 = new ButtonGroup();
        
        JRadioButton normal = new javax.swing.JRadioButton();
        normal.setText("Normal");
        normal.setBounds(30, 430, 100, 20);
        grupo2.add(normal);
        add(normal);
        
        JRadioButton retorno = new javax.swing.JRadioButton();
        retorno.setText("Retorno");
        retorno.setBounds(140, 430, 120, 20);
        grupo2.add(retorno);
        add(retorno);
        
        JButton botao1 = new javax.swing.JButton("Atualizar");
        botao1.setBounds(120, 460, 180, 30);
        add(botao1);
        
        setVisible(true);
    }
    
        public static void main(String[] args) {
        new Tela5SecAtualizaConsulta();
    }
}
