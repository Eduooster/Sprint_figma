import java.sql.Date;
import java.util.Objects;
import java.util.Random;


public class Notificacao {

    private String mensagem;
    private String prioridade;
    private Evento evento;
    private String status;


    public Notificacao() {
    }

    public Notificacao(String mensagem, Evento evento, String status) {
        this.mensagem = mensagem;
        this.prioridade = gerarPrioridadeAleatoria();
        this.evento = evento;
        this.status = status;

    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String gerarPrioridadeAleatoria() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(3);

        return switch (valorAleatorio) {
            case 0 ->
                    "Baixa";
            case 1 ->
                    "Média";
            case 2 ->
                    "Alta";
            default ->
                    "Baixa";
        };
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getStatus() {
        return status;
    }

    public void setNivelUrgencia(String status) {
        this.status = status;
    }





    public void setNotificaoCargo(String cargo){
        System.out.println("Notificao criada para:" + cargo);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Notificacao that = (Notificacao) o;
        return Objects.equals(getMensagem(), that.getMensagem()) && Objects.equals(getPrioridade(), that.getPrioridade()) && Objects.equals(getEvento(), that.getEvento()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMensagem(), getPrioridade(), getEvento(), getStatus());
    }

    @Override
    public String
    toString() {
        return "Notificacao{" +
                "mensagem='" + mensagem + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", evento=" + evento +
                ", status='" + status + '\'' +
                '}';
    }
}
