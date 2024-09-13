/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoSecretaria;

import AcessoMedico.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.Query;

/**
 * Secretaria é uma classe sem atributos utilizada para realizar a manipulação dos dados dos Pacientes e das
 * e das Consultas, mudando diretamente o banco de dados. Além disso, ele também gera um relatório com todas
 * as consultas de um dia e seus respctivos pacientes.
 */
public class Secretaria {
    
    public static void Secretaria(){}
    
    // CRIA E INSERE PACIENTE NO BANCO DE DADOS
    public void cadastrarPaciente(String nome, String cpf, String dataNascimento, String endereco, String celular, String email, String tipoConvenio, EntityManagerFactory emf){
        Paciente paciente = new Paciente(nome, cpf, dataNascimento, endereco, celular, email, tipoConvenio);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(paciente);
        em.getTransaction().commit();
        em.close();
    }
    
    //CRIA E INSERE CONSULTA NO BANCO DE DADOS
    public boolean cadastrarConsulta(String data, String horario, String medico, String cpfPaciente, String tipo, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Consulta consulta = new Consulta(data, horario, medico, pacientesEncontrados.get(0), tipo);
            em.persist(consulta);
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // ATUALIZA PACIENTE NO BANCO DE DADOS
    public boolean atualizarPaciente(String cpfAntigo, String nome, String cpf, String dataNascimento, String endereco, String celular, String email, String tipoConvenio, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfAntigo);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            Paciente paciente = pacientesEncontrados.get(0);
            paciente.setNome(nome);
            paciente.setCpf(cpf);
            paciente.setDataNascimento(dataNascimento);
            paciente.setEndereco(endereco);
            paciente.setCelular(celular);
            paciente.setEmail(email);
            paciente.setTipoConvenio(tipoConvenio);
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // ATUALIZA CONSULTA NO BANCO DE DADOS
    public boolean atualizarConsulta(String antigoCpfPaciente, String antigaData, String antigoHorario, String data, String horario, String medico, String cpfPaciente, String tipo, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.paciente.cpf LIKE :cpf AND c.dataa LIKE :data AND c.horario LIKE :horario");
        query.setParameter("cpf", antigoCpfPaciente);
        query.setParameter("data", antigaData);
        query.setParameter("horario", antigoHorario);
        List<Consulta> consultasEncontradas = query.getResultList();
        if (!consultasEncontradas.isEmpty()){
            Consulta consulta = consultasEncontradas.get(0);
            consulta.setData(data);
            consulta.setHorario(horario);
            consulta.setMedico(medico);
            Query query2 = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
            query2.setParameter("cpf", cpfPaciente);
            List<Paciente> pacientesEncontrados = query2.getResultList();
                if (!pacientesEncontrados.isEmpty()){
                    consulta.setPaciente(pacientesEncontrados.get(0));
                }
            consulta.setTipo(tipo);
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
    
    // REMOVE PACIENTE DO BANCO DE DADOS
    public boolean removerPaciente(String cpfPaciente, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> pacientesEncontrados = query.getResultList();
        if (!pacientesEncontrados.isEmpty()){
            em.remove(pacientesEncontrados.get(0));
            em.getTransaction().commit();
            em.close();
            return true;
        }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
     // REMOVE CONSULTA DO BANCO DE DADOS
    public boolean removerConsulta(String antigoCpfPaciente, String antigaData, String antigaHora, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.paciente.cpf LIKE :cpf AND c.dataa LIKE :data AND c.horario LIKE :horario");
        query.setParameter("cpf", antigoCpfPaciente);
        query.setParameter("data", antigaData);
        query.setParameter("horario", antigaHora);
        List<Consulta> consultasEncontradas = query.getResultList();
        if (!consultasEncontradas.isEmpty()){
            em.remove(consultasEncontradas.get(0));
            em.getTransaction().commit();
            em.close();
            return true;
       }else{
            em.getTransaction().commit();
            em.close();
            return false;
        }
    }
            
    // Função que toma como entrada uma data e retorna todas as consultas neste dia  
    public void relatorioConsultas(String data, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            String jpql = "SELECT consulta FROM Consulta consulta WHERE consulta.dataa = :data";
            TypedQuery<Consulta> query = em.createQuery(jpql, Consulta.class);
            query.setParameter("data", data);
            List<Consulta> consultasDoDia = query.getResultList();
            
            System.out.println();
            System.out.println("--------RELATÓRIO DAS CONSULTAS DO DIA " + data + "--------");
            System.out.println("\nÉ NECESSÁRIO ENVIAR EMAILS PARA AS CONSULTAS:");
            for (int i = 0; i < consultasDoDia.size(); i++){
               Consulta consulta = consultasDoDia.get(i);
               String email = consulta.getPaciente().getEmail();
                if (!email.equals("/")){
                    System.out.println("Consulta do tipo " + consulta.getTipo() + ", que será realizada às " + consulta.getHorario() + ", cujo paciente é" + consulta.getPaciente().getNome() + " e que será examinado pelo médico" + consulta.getHorario() + ". Contato: " + email + ".");
                }
            }
            System.out.println("\nÉ NECESSÁRIO ENVIAR SMS PARA AS CONSULTAS:");
            for (int i = 0; i < consultasDoDia.size(); i++){
               Consulta consulta = consultasDoDia.get(i);
               String celular = consulta.getPaciente().getCelular();
                if (!celular.equals("/")){
                System.out.println("Consulta do tipo " + consulta.getTipo() + ", que será realizada às " + consulta.getHorario() + ", cujo paciente é" + consulta.getPaciente().getNome() + " e que será examinado pelo médico" + consulta.getHorario() + ". Contato: " + celular + ".");
                }
            }
        // Pesquisando descobri que esse erro poderia acontecer, então optamos por colocar esse catch só para considerá-lo    
        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        // sempre tem que chamar esse para finalizar
        } finally {
            em.getTransaction().commit(); 
            em.close();
        }
    }
}