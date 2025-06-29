package Classes.eventos;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

        EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
            this.nomeDoEvento = nomeDoEvento;
            this.localDoEvento = (localDoEvento.isEmpty()? "UFERSA" : localDoEvento);
            this.numeroDeParticipantes = (numeroDeParticipantes>0? numeroDeParticipantes:1);
        }

    void mostraEvento(){
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }
}
