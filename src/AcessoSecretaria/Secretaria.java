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
 *
 * @author 55449
 */
public class Secretaria {
    
    public static void Secretaria(){}
    
    public void cadastrarPaciente(String nome, String cpf, String dataNascimento, String endereco, String celular, String email, String tipoConvenio, EntityManagerFactory emf){
        Paciente paciente = new Paciente(nome, cpf, dataNascimento, endereco, celular, email, tipoConvenio);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(paciente);
        em.getTransaction().commit();
        em.close();
    }
    
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
    
    public boolean atualizarConsulta(String antigoCpfPaciente, String antigaData, String antigoHorario, String data, String horario, String medico, String cpfPaciente, String tipo, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.paciente.cpf LIKE :cpf AND c.data LIKE :data AND c.horario LIKE :horario");
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
    
    public boolean removerConsulta(String antigoCpfPaciente, String antigaData, String antigaHora, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select c FROM Consulta c WHERE c.paciente.cpf LIKE :cpf AND c.data LIKE :data AND c.horario LIKE :horario");
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
    
    public void relatorioConsultas(String data, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            String jpql = "SELECT consulta FROM Consulta consulta WHERE consulta.data = :data";
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

