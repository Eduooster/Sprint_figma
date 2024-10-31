import java.util.Date;
import java.util.Objects;

public class Evento {
    private String nome;
    private String Descricao;
    private String status_atual;//Default:Pendente...No futuro:(Em andamento/Resolvido)
    private String local;
    private Date data;
    private String cargoAlvo;

    public Evento() {
    }
    public Evento(String nome, String descricao, String status_atual, String local, String cargoAlvo) {
        this.nome = nome;
        this.Descricao = descricao;
        this.status_atual = status_atual;
        this.local = local;
        this.cargoAlvo = cargoAlvo;
        this.data = new Date();

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setData(Date data) {
        this.data = data;
    }

    public String getCargoAlvo() {
        return cargoAlvo;
    }

    public void setCargoAlvo(String cargoAlvo) {
        this.cargoAlvo = cargoAlvo;
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
                "nome " + nome + '\'' +
                ", Descricao: " + Descricao + '\'' +
                ", status_atual: '" + status_atual + '\'' +
                ", local: " + local + '\'' +
                ", data: " + data +
                ", cargoAlvo: " + cargoAlvo + '\'' +
                '}';
    }
}
