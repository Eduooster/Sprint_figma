import java.util.Date;
import java.util.Objects;

public class Evento {
    private TipoEvento nomeEvento;
    private String Descricao;
    private String status_atual;//Default:Pendente...No futuro:(Em andamento/Resolvido)
    private String local;
    private Date data;
    private Cargo cargoAlvo;

    public Evento() {
    }
    public Evento(TipoEvento nomeEvento, String descricao, String status_atual, String local, Cargo cargoAlvo) {
        this.nomeEvento = nomeEvento;
        this.Descricao = descricao;
        this.status_atual = status_atual;
        this.cargoAlvo = cargoAlvo;
        this.local = local;
        this.data = new Date();

    }
    public TipoEvento getNome() {
        return nomeEvento;
    }

    public void setNome(TipoEvento nome) {
        this.nomeEvento = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getStatus_atual() {
        return status_atual;
    }

    public void setStatus_atual(String status_atual) {
        this.status_atual = status_atual;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }


    public Cargo getCargoAlvo() {
        return cargoAlvo;
    }







    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Evento evento = (Evento) o;
        return Objects.equals(getNome(), evento.getNome()) && Objects.equals(getDescricao(), evento.getDescricao()) && Objects.equals(getStatus_atual(), evento.getStatus_atual()) && Objects.equals(getLocal(), evento.getLocal()) && Objects.equals(getData(), evento.getData()) && Objects.equals(getCargoAlvo(), evento.getCargoAlvo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getStatus_atual(), getLocal(), getData(), getCargoAlvo());
    }

    @Override
    public String toString() {
        return "Evento: " +
                "nome " + nomeEvento + '\'' +
                ", Descricao: " + Descricao + '\'' +
                ", status_atual: '" + status_atual + '\'' +
                ", local: " + local + '\'' +
                ", data: " + data +
                ", cargoAlvo: " + cargoAlvo + '\'' +
                '}';
    }
}
