/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoMedico;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Paciente é uma classe que representa as ifnormações de uma paciente da clínica. Há várias Strings representando
 * informações pessoais como nome, cpf, data de nascimento, endereço, celular, email e tipo do convenio, além de um
 * objeto da classe Historico que somente o  médico pode acessar. A persistência dados é feita sem muitos detalhes
 * extras e os seus métodos são apensas contrutores, sets e gets (ele é um POJO). Um detalhe importante é a anotação
 * @OneToOne com cascade usada no atributo historico, que conecta diretamente essas duas classes - Quando uma é
 * alterada, a outra também é. Outro detalhe é que a manipulação dos dados gerais do paciente são feitos pela
 * secretária, mas o Historico é feito somente pelo Medico.
 */
@Entity
@Table(name = "PACIENTE")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "DATANASCIMENTO")
    private String dataNascimento;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TIPOCONVENIO")
    private String tipoConvenio;
    @OneToOne(cascade = CascadeType.ALL)
    private Historico historico;
    
    public Paciente(){
        String a = "";
        this.nome = a;
        this.cpf = a;
        this.dataNascimento = a;
        this.endereco = a;
        this.celular = a;
        this.email = a;
        this.tipoConvenio = a;
        this.historico = new Historico();
    }
    
    public Paciente(String nome, String cpf, String dataNascimento, String endereco, String celular, String email, String tipoConvenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
        this.tipoConvenio = tipoConvenio;
        this.historico = new Historico();
    }
    
    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }
    
    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }
}