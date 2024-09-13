/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoMedico;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 55449
 */
@Entity
@Table(name = "PRONTUARIO")
public class Prontuario{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Paciente paciente;
    @Column(name = "PROTOCOLO")
    private String protocolo;
    @Column(name = "SINTOMAS")
    private String sintomas;
    @Column(name = "DIAGNOSTICO")
    private String diagnostico;
    @Column(name = "PRESCRICAOTRATAMENTO")
    private String prescricaoTratamento;
    @Column(name = "MEDICO")
    private String medico;
    
    public Prontuario(){
        String  a = "";
        this.paciente = new Paciente();
        this.protocolo = a;
        this.sintomas = a;
        this.diagnostico = a;
        this.prescricaoTratamento = a;
        this.medico = a;
    }
    
    public Prontuario(Paciente paciente, String protocolo, String sintomas, String diagnostico, String prescricaoTratamento, String medico) {
        this.paciente = paciente;
        this.protocolo = protocolo;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescricaoTratamento = prescricaoTratamento;
        this.medico = medico;
    }
    
    public long getId() {
        return id;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setCpfPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricaoTratamento() {
        return prescricaoTratamento;
    }

    public void setPrescricaoTratamento(String prescricaoTratamento) {
        this.prescricaoTratamento = prescricaoTratamento;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

}
