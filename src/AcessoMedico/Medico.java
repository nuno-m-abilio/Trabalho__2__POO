/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoMedico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/*
 * Médico é uma classe sem atributos utilizada para realizar a manipulação dos dados do Historico dos Pacientes
 * e dos Prontuarios, mudando diretamente o banco de dados. Além disso, ele gera documetos extras como atestados,
 * receitas, declarações de acompanhamentos e relatório do número total de pacientes.
 */
public class Medico {
    
    public Medico(){}
    
    // CADASTRAR DADOS ADICIONAIS
    public boolean insereHistorico(String cpfPaciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabetes, boolean doencaCardiaca, String cirurgias, String alergias, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Historico historico = new Historico(fuma, bebe, colesterol, diabetes, doencaCardiaca, cirurgias, alergias);
            em.persist(historico);
            pacientesEncontrados.get(0).setHistorico(historico);   
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    //ATUALIZA DADOS ADICIONAIS
    public boolean atualizaHistorico(String cpfPaciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabetes, boolean doencaCardiaca, String cirurgias, String alergias, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Historico historico = new Historico(fuma, bebe, colesterol, diabetes, doencaCardiaca, cirurgias, alergias);
            em.persist(historico);
            pacientesEncontrados.get(0).setHistorico(historico);   
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    //REMOVE DADOS ADICIONAIS 
    public boolean removerHistorico(String cpfPaciente, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Historico historico = pacientesEncontrados.get(0).getHistorico();
            if (historico != null){
                em.remove(historico);
            }
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // CADASTRA PRONTUARIO MEDICO
    public boolean inserirProntuario(String cpfPaciente, String protocolo, String sintomas, String diagnostico, String prescricaoTratamento, String medico, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente>pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Prontuario prontuario = new Prontuario(pacientesEncontrados.get(0), protocolo, sintomas, diagnostico, prescricaoTratamento, medico);
            em.persist(prontuario);
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // ATUALIZA PRONTUARIO MEDICO
    public boolean atualizarProntuario(String cpfPaciente, String protocolo, String sintomas, String diagnostico, String prescricaoTratamento, String medico, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Prontuario p WHERE p.paciente.cpf LIKE :cpf AND p.protocolo LIKE :protocolo");
        query.setParameter("cpf", cpfPaciente);
        query.setParameter("protocolo", protocolo);
        List<Prontuario> prontuariosEncontrados = query.getResultList();
        if (!prontuariosEncontrados.isEmpty()){
            Prontuario prontuario = prontuariosEncontrados.get(0);
            prontuario.setSintomas(sintomas);
            prontuario.setDiagnostico(diagnostico);
            prontuario.setPrescricaoTratamento(prescricaoTratamento);
            prontuario.setMedico(medico);
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // REMOVE PRONTUARIO MEDICO DO BANCO DE DADOS
    public boolean removerProntuario(String cpfPaciente, String protocolo, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Prontuario p WHERE p.paciente.cpf LIKE :cpf AND p.protocolo LIKE :protocolo");
        query.setParameter("cpf", cpfPaciente);
        query.setParameter("protocolo", protocolo);
        List<Prontuario> prontuariosEncontrados = query.getResultList();
        if (!prontuariosEncontrados.isEmpty()){
            em.remove(prontuariosEncontrados.get(0));
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // GERA ATESTADO A PARTIR DE INFORMACOES PASSADAS
    public void gerarAtestado(String nome, String cpf, String dias){
        System.out.println("--------ATESTADO MÉDICO--------");
        System.out.println("Atesto que o(a) paciente " + nome + "portador(a) do CPF: " +  cpf); 
        System.out.println("esteve presente na clínica Saude & Cia e necessita de " + dias + " de repouso");
    } 

    // GERA RECEITA A PARTIR DE INFORMACOES PASSADAS
    public void gerarReceita(String nome, String remedio, String dose){
        System.out.println("--------RECEITA MÉDICA--------");
        System.out.println("Paciente: " + nome); 
        System.out.println("Remédio: " + remedio);
        System.out.println("Doses ao dia: " + dose);
    }

    // GERA DECLARACAO A PARTIR DE INFORMACOES PASSADAS
    public void gerarDeclaracaoAcompanhante(String paciente, String acompanhante){
        System.out.println("--------DECLARAÇÃO DE ACOMPANHANTE--------");
        System.out.println("Declaro que " + acompanhante + " esteve acompanhando o(a) paciente " + paciente + " durante sua permanência na clinica Saúde & Cia.");
    }
    
    //GERA O NUMERO TOTAL DE PACIENTES SEM PRECISAR DE NENHUMA INFORMAÇÃO PASSADA ALÉM DO EMF
    public long gerarTotalClientes(EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p");
        List<Paciente> pacientesEncontrados = query.getResultList();
        long total = pacientesEncontrados.size();
        em.getTransaction().commit();
        em.close();
        return total;
    }
}