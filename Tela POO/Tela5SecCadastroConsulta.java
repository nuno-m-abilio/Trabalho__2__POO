package Telas;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Tela5SecCadastroConsulta extends JFrame{
    
    public Tela5SecCadastroConsulta(){
        
        setTitle("Menu Consulta");
        setSize(380, 300);
        setLocationRelativeTo(null);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Cadastra Consulta");
        inicio.setBounds(100, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Data: ");
        texto1.setBounds(50, 50, 100, 50);
        add(texto1);
        
        JTextField data = new javax.swing.JTextField("Ex: 02/08/2024");
        data.setBounds(120, 65, 180, 20);
        add(data);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Horario: ");
        texto2.setBounds(50, 80, 100, 50);
        add(texto2);
        
        JTextField horario = new javax.swing.JTextField("Ex: 17:40");
        horario.setBounds(120, 95, 180, 20);
        add(horario);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Médico: ");
        texto3.setBounds(50, 110, 100, 50);
        add(texto3);
        
        JTextField cpf = new javax.swing.JTextField("Ex: Veronica");
        cpf.setBounds(120, 125, 180, 20);
        add(cpf);
        
        JLabel texto4 = new javax.swing.JLabel();
        texto4.setText("Tipo da Consulta:");
        texto4.setBounds(50, 140, 100, 50);
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
        botao1.setBounds(100, 220, 180, 30);
        add(botao1);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Tela5SecCadastroConsulta();
    }
}
