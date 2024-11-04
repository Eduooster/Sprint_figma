import java.util.List;
import java.util.Objects;
import java.util.Random;


public class Notificacao {
    private String mensagem;//Descricao do evento
    private String prioridade;//Gerada randomicamente pelo sistema.
    private Evento evento;
    private boolean statusVisualizacao;//Visualizada ou Não (True/False)

    public Notificacao() {
    }

    public Notificacao(String mensagem, Evento evento, Boolean status) {
        this.mensagem = mensagem;
        this.prioridade = gerarPrioridadeAleatoria();
        this.evento = evento;
        this.statusVisualizacao = status;


    }


    public boolean isVisualizada() {
        return statusVisualizacao;
    }
    public void marcarComoVisualizada() {
        this.statusVisualizacao = true;
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
    public String getPrioridade() {
        return prioridade;
    }
    public Evento getEvento() {
        return evento;
    }
    public Boolean getStatus() {
        return statusVisualizacao;
    }


    public void setNotificaoCargo(Notificacao notificacaoReportada, List<Funcionario> bancoDadosFuncionarios){

        bancoDadosFuncionarios.stream()
                .filter(funcionario -> funcionario.getCargo().equals(evento.getCargoAlvo()))
                .forEach(funcionario -> {
                    funcionario.getHistorico().setEventos(evento);
                    funcionario.setNotificacoes(notificacaoReportada);
                });
        System.out.println("Reporte concluido!");
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
        return "Notificacao" + "\n" +
                "Mensagem: " + mensagem + '\n' +
                "Prioridade: " + prioridade + '\n' +
                "Evento: " + evento + '\n' +
                "Visualizado: " + statusVisualizacao + "\n";
    }
}


