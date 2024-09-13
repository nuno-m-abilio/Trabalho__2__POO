/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensageiros;

import AcessoSecretaria.Consulta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
* MensageiroSMS é uma classe filha que, tendo como objetivo avisar os pacientes da consulta de um determinado dia,
* tem como mãe uma versão genérica Mensageiro. Não há atributos, apenas a função de fazer a comunicação, aqui
* especificamente por SMS a partir do celular. Não é enviado para quem tem celular inválido "\".
*/
public class MensageiroSMS extends Mensageiro{
    
    public void enviarMensagem(String data, EntityManagerFactory emf) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.dataa LIKE :data");
        query.setParameter("data", data);
        List<Consulta> consultasEncontradas = query.getResultList();
        for (Consulta c : consultasEncontradas){
            if (!"/".equals(c.getPaciente().getCelular())){
                System.out.println("Bom dia senhor(a) " + c.getPaciente().getNome() + " (" + c.getPaciente().getCelular() + ") " + " sua consulta ficou agendada para o dia " + c.getData() + " às " + c.getHorario() + ".");
            }
        }
        em.getTransaction().commit();
        em.close();
    }
}