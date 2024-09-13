package Mensageiros;
import AcessoSecretaria.Consulta;


public class MensageiroSMS extends Mensageiro{

    public void enviarMensagem(Consulta consulta){
        System.out.println();
        System.out.println("Bom dia senhor(a) " + consulta.getPaciente().getNome() + " (" + consulta.getPaciente().getCelular() + ") " + " sua consulta ficou agendada para o dia " + consulta.getData() + " às " + consulta.getHorario() + ".");
    }
}