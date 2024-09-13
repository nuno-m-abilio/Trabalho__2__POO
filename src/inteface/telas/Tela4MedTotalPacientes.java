/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inteface.telas;


import javax.swing.JOptionPane;

/*
* POPUP QUE EXIBE A QUANTIDADE TOTAL DE PACIENTES ATENDIDOS
*/

public class Tela4MedTotalPacientes extends JOptionPane {

    public Tela4MedTotalPacientes(long numero){
        
        JOptionPane.showMessageDialog(null, "Total de Pacientes: "+ numero );
    }
}
