/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoSecretaria;

import AcessoMedico.Paciente;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
/**
 *
 * @author 55449
 */
@Entity
@Table(name = "CONSULTA")
public class Consulta {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 10, nullable = false, name = "DATACONSULTA")
    private String data;
    @Column(length = 5, nullable = false, name = "HORARIO")
    private String horario;
    @Column(length = 100, nullable = false, name = "MEDICO")
    private String medico;
    @OneToOne(cascade = CascadeType.ALL)
    private Paciente paciente;
    @Column(length = 50, nullable = false, name = "TIPO")
    private String tipo;
    
    protected Consulta(){}
    
    protected Consulta(String data, String horario, String medico, Paciente paciente, String tipo) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }
    
    public long getId() {
        return id;
    }
    
    public String getData() {
        return data;
    }

    protected void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    protected void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    protected void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    protected void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}    
