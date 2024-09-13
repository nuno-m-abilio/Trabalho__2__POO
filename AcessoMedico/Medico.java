/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AcessoMedico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
/**
 *
 * @author 55449
 */
public class Medico {
    
    public Medico(){}
    
    // IMPORTANTE: ESSAS FUNÇÔES de insere e remove histórico vão ter mudanças na mains que precisam ser feitas.
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
    
    public boolean inserirProntuario(String cpfPaciente, String protocolo, String sintomas, String diagnostico, String prescricaoTratamento, String medico, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Paciente p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", cpfPaciente);
        List<Paciente> consultasEncontradas = query.getResultList();
        if (!consultasEncontradas.isEmpty()){
            Prontuario prontuario = new Prontuario(consultasEncontradas.get(0), protocolo, sintomas, diagnostico, prescricaoTratamento, medico);
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
    
    public boolean atualizarProntuario(String cpfPaciente, String protocolo, String sintomas, String diagnostico, String prescricaoTratamento, String medico, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Prontuario p WHERE p.paciente.cpf LIKE :cpf AND p.protocolo LIKE :protocolo");
        query.setParameter("cpf", cpfPaciente);
        query.setParameter("protocolo", protocolo);
        List<Prontuario> consultasEncontradas = query.getResultList();
        if (!consultasEncontradas.isEmpty()){
            Prontuario prontuario = consultasEncontradas.get(0);
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
    
    // Aqui pode ter um erro de código, conferir caso de algo de errado.
    
    public boolean removerProntuario(String cpfPaciente, String protocolo, EntityManagerFactory emf){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("select p FROM Prontuario p WHERE p.paciente.cpf LIKE :cpf AND p.protocolo LIKE :protocolo");
        query.setParameter("cpf", cpfPaciente);
        query.setParameter("protocolo", protocolo);
        List<Prontuario> consultasEncontradas = query.getResultList();
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
    
    public void gerarAtestado(String nome, String cpf, String dias){
        System.out.println("--------ATESTADO MÉDICO--------");
        System.out.println("Atesto que o(a) paciente " + nome + "portador(a) do CPF: " +  cpf); 
        System.out.println("esteve presente na clínica Saude & Cia e necessita de " + dias + " de repouso");
    } 

    public void gerarReceita(String nome, String remedio, String dose){
        System.out.println("--------RECEITA MÉDICA--------");
        System.out.println("Paciente: " + nome); 
        System.out.println("Remédio: " + remedio);
        System.out.println("Doses ao dia: " + dose);
    }

    public void gerarDeclaracaoAcompanhante(String paciente, String acompanhante){
        System.out.println("--------DECLARAÇÃO DE ACOMPANHANTE--------");
        System.out.println("Declaro que " + acompanhante + " esteve acompanhando o(a) paciente " + paciente + " durante sua permanência na clinica Saúde & Cia.");
    }

    public void gerarTotalClientes(String clientes){
        System.out.println("--------TOTAL CLIENTES--------");
        System.out.println("Total de clientes atendidos no mês: " + clientes);
    }
}
