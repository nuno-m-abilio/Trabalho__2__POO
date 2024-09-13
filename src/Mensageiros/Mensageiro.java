/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensageiros;

/**
* Classe mãe que, tendo como objetivo avisar os pacientes da consulta de um determinado dia, tem como herdeiros uma versão
* para mandar e-mail e uma para mandaar SMS. Não há atributos, apenas a função de fazer a comunicação.
*/
public class Mensageiro {

    public void Mensageiro(){}

    protected void enviarMensagem(){
        System.out.println("----- MENSAGEM -----");
    }
}