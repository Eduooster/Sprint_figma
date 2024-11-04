import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Historico {

    private String status_final;
    private String solucao;
    private List<Evento> eventos;

    public Historico() {
        this.eventos = new ArrayList<>();
    }


    public String getStatus_final() {
        return status_final;
    }

    public void setStatus_final(String status_final) {
        this.status_final = status_final;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucoa) {
        this.solucao = solucao;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Evento Novoevento) {
        System.out.println("O EVENTO " +  Novoevento.getNome() + " foi adicionado");
        eventos.add(Novoevento);


    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Historico historico = (Historico) o;
        return Objects.equals(getStatus_final(), historico.getStatus_final()) && Objects.equals(getSolucao(), historico.getSolucao()) && Objects.equals(getEventos(), historico.getEventos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus_final(), getSolucao(), getEventos());
    }

    @Override
    public String toString() {
        return "Historico{" +
                "status_final='" + status_final + '\'' +
                ", soluco='" + solucao + '\'' +
                ", eventos=" + eventos +
                '}';
    }
}
