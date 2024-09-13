package Mensageiros;
import AcessoSecretaria.Consulta;

public class MensageiroEmail extends Mensageiro{

    public void enviarMensagem(Consulta consulta) {

        System.out.println();
        System.out.println("De: clinicamédica@gmail.com");
        System.out.println("Para: " + consulta.getPaciente().getEmail());
        System.out.println("Prezado senhor(a) " + consulta.getPaciente().getNome() + " sua consulta ficou agendada para o dia " + consulta.getData() + " às " + consulta.getHorario());
    }

}
