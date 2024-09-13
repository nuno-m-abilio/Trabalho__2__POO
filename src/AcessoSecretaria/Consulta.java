/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoSecretaria;

import AcessoMedico.Paciente;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A classe consulta representa os dados de uma consulta médica, estando conectados diretamente com um objeto paciente pela
 * anotação @OneToOne com cascade. Além disso, aoutras informaçõs importantes como data, hora, médico que vai atende e o 
 * tipo de convênio são armazenadas por Stirngs. Aqui Os métodos são apensas contrutores, sets e gets (a classe é um POJO).
 */
@Entity
@Table(name = "CONSULTA")
public class Consulta {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "DATAA")
    private String dataa;
    @Column(name = "HORARIO")
    private String horario;
    @Column(name = "MEDICO")
    private String medico;
    @OneToOne(cascade = CascadeType.ALL)
    private Paciente paciente;
    @Column(name = "TIPO")
    private String tipo;
    
    protected Consulta(){
    String a = "";
        this.dataa = a;
        this.horario = a;
        this.medico = a;
        this.paciente = new Paciente();
        this.tipo = a;
    }
    
    protected Consulta(String data, String horario, String medico, Paciente paciente, String tipo) {
        this.dataa = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }
    
    public long getId() {
        return id;
    }
    
    public String getData() {
        return dataa;
    }

    protected void setData(String data) {
        this.dataa = data;
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