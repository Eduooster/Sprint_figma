import java.time.LocalDateTime;

public class Notificacao {
    private String mensagem;
    private String prioridadeNotificacao;
    private Evento evento;
    private String nivelUrgencia;
    private LocalDateTime dataHora;

    public Notificacao(Evento evento) {
        this.evento = evento;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPrioridadeNotificacao() {
        return prioridadeNotificacao;
    }

    public void setPrioridadeNotificacao(String prioridadeNotificacao) {
        this.prioridadeNotificacao = prioridadeNotificacao;
    }

    public Evento getEnvento() {
        return evento;
    }

    public void setEnvento(Evento envento) {
        this.evento = envento;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
