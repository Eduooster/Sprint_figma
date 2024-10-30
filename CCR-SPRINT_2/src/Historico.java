import java.util.ArrayList;
import java.util.List;

public class Historico {

    private String status_final;
    private String soluco;
    private List<Evento> eventos;

    public Historico() {
    }

    public Historico(String status_final, String soluco) {
        this.status_final = status_final;
        this.soluco = soluco;
        this.eventos = new ArrayList<>();
    }

    public String getStatus_final() {
        return status_final;
    }

    public void setStatus_final(String status_final) {
        this.status_final = status_final;
    }

    public String getSoluco() {
        return soluco;
    }

    public void setSoluco(String soluco) {
        this.soluco = soluco;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Evento Novoevento) {
        eventos.add(Novoevento);
    }
}
