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


public class MensageiroSMS extends Mensageiro{

    public boolean enviarMensagem(String antigoCpfPaciente, String antigaData, String antigaHora, EntityManagerFactory emf) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.paciente.cpf LIKE :cpf AND c.dataa LIKE :data AND c.horario LIKE :horario");
        query.setParameter("cpf", antigoCpfPaciente);
        query.setParameter("data", antigaData);
        query.setParameter("horario", antigaHora);
        List<Consulta> consultasEncontradas = query.getResultList();
        if (!consultasEncontradas.isEmpty()){
            Consulta consulta = consultasEncontradas.get(0);
            System.out.println();
        System.out.println("Bom dia senhor(a) " + consulta.getPaciente().getNome() + " (" + consulta.getPaciente().getCelular() + ") " + " sua consulta ficou agendada para o dia " + consulta.getData() + " às " + consulta.getHorario() + ".");
            em.getTransaction().commit();
            em.close();
            return true;
       }else{
            em.getTransaction().commit();
            em.close();
            return false;
        } 
        
    }
}