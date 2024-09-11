package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela4SecVerificaConsulta extends JFrame{
    
    public Tela4SecVerificaConsulta(){
        
        setTitle("Menu Consulta");
        setSize(380, 250);
        setLocationRelativeTo(null);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inicio.setText("Busca Consulta");
        inicio.setBounds(115, 1, 500, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("CPF: ");
        texto1.setBounds(50, 50, 100, 50);
        add(texto1);
        
        JTextField cpf = new javax.swing.JTextField("Ex: 123.456.789.10");
        cpf.setBounds(120, 65, 180, 20);
        add(cpf);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Data: ");
        texto2.setBounds(50, 80, 100, 50);
        add(texto2);
        
        JTextField data = new javax.swing.JTextField("Ex: 02/08/2024");
        data.setBounds(120, 95, 180, 20);
        add(data);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Horario: ");
        texto3.setBounds(50, 110, 100, 50);
        add(texto3);
        
        JTextField horario = new javax.swing.JTextField("Ex: 17:40");
        horario.setBounds(120, 125, 180, 20);
        add(horario);
        
        JButton botao1 = new javax.swing.JButton("Buscar");
        botao1.setBounds(100, 165, 180, 30);
        add(botao1);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Tela4SecVerificaConsulta();
    }
}
