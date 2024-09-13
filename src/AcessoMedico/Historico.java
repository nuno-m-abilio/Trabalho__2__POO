/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoMedico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
/**
 *
 * @author 55449
 */
@Entity
@Table(name = "HISTORICO")
public class Historico {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "FUMA")
    private boolean fuma;
    @Column(name = "BEBE")
    private boolean bebe;
    @Column(name = "COLESTEROL")
    private boolean colesterol;
    @Column(name = "DIABETES")
    private boolean diabetes;
    @Column(name = "DOENCACARDIACA")
    private boolean doencaCardiaca;
    @Column(name = "CIRURGIAS")
    private String cirurgias;
    @Column(name = "ALERGIAS")
    private String alergias;
    
    protected Historico(){
        String a = "";
        this.cirurgias = a;
        this.alergias = a;
    }
    
    protected Historico(boolean fuma, boolean bebe, boolean colesterol, boolean diabetes, boolean doencaCardiaca, String cirurgias, String alergias) {
        this.fuma = fuma;
        this.bebe = bebe;
        this.colesterol = colesterol;
        this.diabetes = diabetes;
        this.doencaCardiaca = doencaCardiaca;
        this.cirurgias = cirurgias;
        this.alergias = alergias;
    }
    
    public long getId() {
        return id;
    }
        
    protected boolean getFuma() {
        return fuma;
    }

    protected void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    protected boolean getBebe() {
        return bebe;
    }

    protected void setBebe(Boolean bebe) {
        this.bebe = bebe;
    }

    protected boolean getColesterol() {
        return colesterol;
    }

    protected void setColesterol(Boolean colesterol) {
        this.colesterol = colesterol;
    }

    protected boolean getDiabetes() {
        return diabetes;
    }

    protected void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    protected boolean getDoencaCardiaca() {
        return doencaCardiaca;
    }

    protected void setDoencaCardiaca(Boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    protected String getCirurgias() {
        return cirurgias;
    }

    protected void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    protected String getAlergias() {
        return alergias;
    }

    protected void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
