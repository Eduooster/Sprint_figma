import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private Login login;
    private String cargo;
    private List<Notificacao> notificacoes;
    private Historico historico_eventos;

    public Funcionario() {
    }

    public Funcionario(String nome, Login login, String cargo) {
        this.nome = nome;
        this.login = login;
        this.cargo = cargo;
        this.notificacoes = new ArrayList<>();
        this.historico_eventos = new Historico();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNotificacoes(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }
    public Historico getHistorico_eventos() {
        return historico_eventos;
    }

    public static Evento coletaInputEvento(){
        Scanner scanner = new Scanner(System.in);

        // Captura o nome do funcionário que está reportando o evento
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Captura informações adicionais sobre o evento
        System.out.print("Descrição do evento: ");
        String descricao = scanner.nextLine();
        System.out.print("Status do evento (Ex: Pendente): ");
        String statusEvent = scanner.nextLine();
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Cargo alvo da notificação: ");
        String cargoAlvo = scanner.nextLine();

        return new Evento(nome, descricao, statusEvent, local, cargoAlvo);

    }
    public void reportarEvento(List<Funcionario> bancoDadosFuncionarios) {
        Evento evento = coletaInputEvento();
        Notificacao notificacao = new Notificacao(evento.getNome(),evento,false);

        notificacao.setNotificaoCargo(notificacao,bancoDadosFuncionarios);
    }

    public void notifacacoesNaoVisualizadas(){
        System.out.println("Essas são suas notificações não visualizadas");

        notificacoes.stream().filter(notificacao ->  !notificacao.isVisualizada())
                .forEach(System.out::println);
    }

    public void marcarNotificacaoComoVizualizada(String nomeNotificacao){
        notificacoes.stream().filter(notificacao -> notificacao.getEvento().getNome().equals(nomeNotificacao))
                .forEach(notificacao -> notificacao.marcarComoVisualizada());
    }

    public List<Notificacao> buscarNotificacoesPorPrioridade(String prioridade) {
        return this.notificacoes.stream()
                .filter(notificacao -> notificacao.getPrioridade().equals(prioridade))
                .toList();
    }

    public Historico getHistorico() {
        return historico_eventos;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getNotificacoes(), that.getNotificacoes()) && Objects.equals(getHistorico_eventos(), that.getHistorico_eventos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLogin(), getCargo(), getNotificacoes(), getHistorico_eventos());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", login=" + login +
                ", cargo='" + cargo + '\'' +
                ", notificacoes=" + notificacoes +
                ", historico_eventos=" + historico_eventos +
                '}';
    }



}

