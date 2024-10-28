import java.time.LocalDateTime;

public class Evento {
    private String nome;
    private String descricao;
    private String statusAtual;
    private String local;
    private LocalDateTime data;
    private String cargoAlvo;

    public Evento(String nome, String descricao, String statusAtual, String local, LocalDateTime data, String cargoAlvo) {
        this.nome = nome;
        this.descricao = descricao;
        this.statusAtual = statusAtual;
        this.local = local;
        this.data = data;
        this.cargoAlvo = cargoAlvo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(String statusAtual) {
        this.statusAtual = statusAtual;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getCargoAlvo() {
        return cargoAlvo;
    }

    public void setCargoAlvo(String cargoAlvo) {
        this.cargoAlvo = cargoAlvo;
    }

}
