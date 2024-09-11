
package inteface.telas;



import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Tela4MedReceita extends JFrame {
    Tela4MedReceita(){
        setSize(500, 200);
        //setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);
        setLayout(null);     
        
        JLabel inicio = new javax.swing.JLabel();
        inicio.setFont(new java.awt.Font("Tahoma", 1, 20));
        inicio.setText("Gerar Receita");
        inicio.setBounds(170, 10, 300, 50);
        add(inicio);
        
        JLabel texto1 = new javax.swing.JLabel();
        texto1.setText("Nome do paciente: ");
        texto1.setBounds(20, 45, 300, 50);
        add(texto1);
        
        
        JTextField nome = new javax.swing.JTextField("");
        nome.setBounds(128, 60, 250, 20);
        add(nome);
        
        JLabel texto2 = new javax.swing.JLabel();
        texto2.setText("Nome do remédio:");
        texto2.setBounds(20, 75, 300, 50);
        add(texto2);
        
        JTextField remedio = new javax.swing.JTextField("");
        remedio.setBounds(128, 90, 250, 20);
        add(remedio);
        
        JLabel texto3 = new javax.swing.JLabel();
        texto3.setText("Doses Diárias:");
        texto3.setBounds(20, 105, 300, 50);
        add(texto3);
        
                
        JTextField doses = new javax.swing.JTextField("");
        doses.setBounds(128, 120, 250, 20);
        add(doses);
        
        JButton botao1 = new JButton("Gerar");
        botao1.setBounds(390, 60, 80, 80);
        add(botao1);
        
        setVisible(true);
    }
    public static void main(String[] args) {
    new Tela4MedReceita();
    }
    
}
