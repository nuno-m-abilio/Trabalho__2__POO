/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

import java.util.ArrayList;
import AcessoMedico.Paciente;
import AcessoSecretaria.Consulta;

public class Registros {
    private ArrayList<Paciente> pacientes;
    private ArrayList<Consulta> consultas;
    
    
    public Registros(){
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }
    
    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
        System.out.println("Paciente adidionado com sucesso!");
    }
    
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
        System.out.println("Consulta adicionada com sucesso!");
    }
    
    public boolean encontraPaciente(String buscaCpf) {
       
        boolean encontrou = false;

        for (int i = 0; i < pacientes.size(); i++ ){
            Paciente oldPaciente = pacientes.get(i);
            if (oldPaciente.getCpf().equals(buscaCpf))       
                encontrou = true;
        }
        return encontrou;
                
    }
    
    public void atualizarPaciente(String buscaCpf, Paciente newPaciente){
        for (int i = 0; i < pacientes.size(); i++ ){
            Paciente oldPaciente = pacientes.get(i);
            if (oldPaciente.getCpf().equals(buscaCpf)){
                pacientes.set(i, newPaciente);
            }
        }
    }
        
    public void atualizarConsulta(String cpfPaciente, String dataConsulta, String horaConsulta, Consulta newConsulta){
        for (int i = 0; i < consultas.size(); i++ ){
            Consulta oldConsulta = consultas.get(i);
            Paciente pacienteConsulta = oldConsulta.getPaciente();
            if ((oldConsulta.getData().equals(dataConsulta)) && (oldConsulta.getHorario().equals(horaConsulta)) && (pacienteConsulta.getCpf().equals(cpfPaciente))){
                consultas.set(i, newConsulta);
            }       
        }
    }
    
    public void removerPaciente(String buscaCpf){
        for (int i = 0; i < pacientes.size(); i++ ){
            Paciente oldPaciente = pacientes.get(i);
            if (oldPaciente.getCpf().equals(buscaCpf)){
                pacientes.remove(i);
            }
        }
    }
    
    public void removerConsulta(String cpfPaciente, String dataConsulta, String horaConsulta){
        for (int i = 0; i < consultas.size(); i++ ){
            Consulta oldConsulta = consultas.get(i);
            Paciente pacienteConsulta = oldConsulta.getPaciente();
            if ((oldConsulta.getData().equals(dataConsulta)) && (oldConsulta.getHorario().equals(horaConsulta)) && (pacienteConsulta.getCpf().equals(cpfPaciente))){
                consultas.remove(i);
            }       
        }
    }
    
    public ArrayList<Consulta> consultasDoDia(String dataConsulta){
        ArrayList<Consulta> consultasDoDia = new ArrayList();
        for (int i = 0; i < consultas.size(); i++ ){
            Consulta consulta = consultas.get(i);
            if (consulta.getData().equals(dataConsulta)){
                consultasDoDia.add(consulta);
            }
        }
        return consultasDoDia;
    }
    
    public Paciente retornaPaciente(String buscaCpf) {
        Paciente paciente = new Paciente();

        for (int i = 0; i < pacientes.size(); i++ ){
            paciente = pacientes.get(i);
            if (paciente.getCpf().equals(buscaCpf))
                return paciente;
        }
        return paciente;
    }

    public boolean encontraConsulta(String cpfPaciente, String dataConsulta, String horarioConsulta){
        boolean encontrou = false;

        for (int i = 0; i < consultas.size(); i++ ){
            Consulta consulta = consultas.get(i);
            Paciente pacienteConsulta = consulta.getPaciente();
            if ((consulta.getData().equals(dataConsulta)) && (consulta.getHorario().equals(horarioConsulta)) && (pacienteConsulta.getCpf().equals(cpfPaciente))){
                encontrou = true;
            }
        }
        return encontrou;
    }
}
   
