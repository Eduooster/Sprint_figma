import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private Login login;
    private String cargo;
    private List<Notificacao> notificacoes;

    public Funcionario() {
    }

    public Funcionario(String nome, Login login, String cargo) {
        this.nome = nome;
        this.login = login;
        this.cargo = cargo;
        this.notificacoes = new ArrayList<>();
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

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }


    public static Evento coletaInputs(){
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

    void reportarEvento(List <Funcionario> funcionarios) {

        var novoEvento = coletaInputs();

        Notificacao notificacao = new Notificacao(novoEvento.getDescricao(),novoEvento,novoEvento.getStatus_atual());

        Historico historico = new Historico();
        historico.setEventos(novoEvento);




        funcionarios.stream()
                .filter(funcionario -> funcionario.getCargo().equals(novoEvento.getCargoAlvo()))
                .forEach(funcionario -> funcionario.setNotificacoes(notificacao));

        System.out.println("Reporte concluído! Todos os funcionários referentes ao cargo, foram notificados.");
    }
    void verificarTarefasPendentes(){
                notificacoes.stream()
                .filter(notificacao -> notificacao.getStatus().equals("Pendente"))
                .forEach(System.out::println);
    }
    void atualizarStatus(String nomeEvento,String Status){
        notificacoes.stream().filter(notificacao -> notificacao.getEvento().getNome().equals(nomeEvento))
                .forEach(notificacao -> notificacao.setStatus(Status));
    }
    void filtra_prioridade(String prioridade){
        List<Notificacao> prioridadeNotificacoes = notificacoes.stream()
                .filter(notificacao -> notificacao.getPrioridade().equals(prioridade))
                .toList();


        if (prioridadeNotificacoes.isEmpty()) {
            System.out.println("Nenhuma notificação encontrada com a prioridade: ");
        } else {
            prioridadeNotificacoes.forEach(System.out::println);
        }


    }

    void adicionariHistorico(){
        Historico historico = new Historico();

        notificacoes.stream().filter(notificacao -> notificacao.getStatus().equals("Resolvido"));

    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getNotificacoes(), that.getNotificacoes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLogin(), getCargo(), getNotificacoes());
    }

    @Override
    public String
    toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", login=" + login +
                ", cargo='" + cargo + '\'' +
                ", notificacoes=" + notificacoes +
                '}';
    }
}

