import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public abstract class Funcionario {
    private String nome;
    private Login login;
    private Cargo cargo;
    private List<Notificacao> notificacoes;
    private Historico historico_eventos;

    public Funcionario() {
    }

    public Funcionario(String nome, Login login, Cargo cargo) {
        this.nome = nome;
        this.login = login;
        this.cargo = cargo;
        this.notificacoes = new ArrayList<>();
        this.historico_eventos = new Historico();
    }

    public String getNome() {
        return nome;
    }


    public Login getLogin() {
        return login;
    }


    public Cargo getCargo() {
        return cargo;
    }

    public void setNotificacoes(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void atualizarListaNotificacoes() {
        notificacoes.removeIf(notificacao -> notificacao.isVisualizada());

    }

    public void verficiarHistoricoEventos() {
        System.out.println("Seu histórico de eventos: ");
        historico_eventos.getEventos().stream().forEach(historico -> {
            System.out.println("Nome: " + historico.getNome() + "\nDescrição: " + historico.getDescricao() +
                    "\nLocal: " + historico.getLocal() + "\nData: " + historico.getData() + "\nStatus: "+ historico.getStatus_atual()) ;
            System.out.println("_______________________");
        });
    }

    public static Evento coletaInputEvento(){
        Scanner scanner = new Scanner(System.in);


        System.out.print(
                """
                        Digite o tipo do evento para:
                        Seguranças:  [Briga,roubo,comportamento suspeito]\s
                        Tencnico de manutenção: [Elevador quebrado, telao de aviso quebrado, falha de iluminacao]
                        Limpeza:[Limpeza banheiro,Lixo acumulado,Derramamento]
                        Atendente plataforma:[ajuda passageiro, objeto perdido, orientação embarque ]\n""");


        System.out.print("Digite o evento: ");
        String nome = scanner.nextLine();



        var tipoEvento = obterTipoEventoDoUsuario(nome);

        while (tipoEvento == null ) {
            System.out.print("Por favor, insira o tipo de evento: ");
            nome = scanner.nextLine();
            tipoEvento = obterTipoEventoDoUsuario(nome);

            if (tipoEvento == null) {
                System.out.println("Tipo de evento inválido. Tente novamente.");
            }
        }

        System.out.println("Tipo evento: "  + tipoEvento);




        System.out.print("Descrição do evento: ");
        String descricao = scanner.nextLine();

        System.out.print("Local do evento: ");
        String local = scanner.nextLine();

        System.out.println(tipoEvento);
        System.out.println(tipoEvento.getResponsavel());

        Cargo cargoAlvo = tipoEvento.getResponsavel();
        var statusEvent = "Pendente";

        return new Evento(tipoEvento, descricao, statusEvent, local,cargoAlvo);

    }

    public static TipoEvento obterTipoEventoDoUsuario(String input) {
        try {

            return TipoEvento.valueOf(input.trim().toUpperCase().replace(" ", "_"));
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de evento inválido. Tente novamente.");
            return null;
        }
    }

    public void reportarEvento(List<Funcionario> bancoDadosFuncionarios) {

        Evento evento = coletaInputEvento();
        Notificacao notificacao = new Notificacao(evento.getDescricao(),evento,false);


        notificacao.setNotificaoCargo(notificacao,bancoDadosFuncionarios);
    }

    public void notifacacoesNaoVisualizadas(){
        System.out.println("Essas são suas notificações não visualizadas");
        notificacoes.stream().filter(notificacao ->  !notificacao.isVisualizada())
                .forEach(System.out::println);
    }

    public void marcarNotificacaoComoVisualizada(TipoEvento nomeNotificacao){
        notificacoes.stream().filter(notificacao -> notificacao.getEvento().getNome().equals(nomeNotificacao))
                .forEach(Notificacao::marcarComoVisualizada);

        atualizarListaNotificacoes();
    }

    public List<Notificacao> buscarNotificacoesPorPrioridade(String prioridade) {
        System.out.println("Notificacoes por prioridade" + prioridade);

        return this.notificacoes.stream()
                .filter(notificacao -> notificacao.getPrioridade().equals(prioridade))
                .toList();
    }

    void atualizarStatusEvento(TipoEvento nomeEvento){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo Status: ");
        String novoStatus = scanner.nextLine();

        if(novoStatus.equals("Resolvido")){
            this.getHistorico().getEventos().stream()
                    .filter(evento -> evento.getNome().equals(nomeEvento))
                    .forEach(evento -> evento.setStatus_atual(novoStatus));


            System.out.print("Digite a solução: ");
            String solucao = scanner.nextLine();

            this.getHistorico().setSolucao(solucao);
            this.getHistorico().setStatus_final(novoStatus);

        }



    }

    public String verQuantidadeDeNotificacoes() {

        if(!notificacoes.isEmpty()){
            long QtdNotificacoes = notificacoes.stream().count();

            long QtdNotificacoesVisualizadas =
                    notificacoes.stream().filter(notificacao -> notificacao.isVisualizada())
                            .count();

            return "Quantidade totais  de notificações:" + QtdNotificacoes + "\nVisualizadas: " + QtdNotificacoesVisualizadas + "\nNão visualizadas: " + (QtdNotificacoes - QtdNotificacoesVisualizadas);


        }
        return "Não há notificações";



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
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getNotificacoes(), that.getNotificacoes()) && Objects.equals(getHistorico(), that.getHistorico());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLogin(), getCargo(), getNotificacoes(), getHistorico());
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

    public abstract String gerarRelatorio();

    public Map<TipoEvento, Long> dicionarioOcorrido() {
        Map<TipoEvento, Long> contagem = getNotificacoes().stream()
                .filter(notificacao -> notificacao.getEvento().getNome() != null)
                .collect(Collectors.groupingBy(
                        notificacao -> notificacao.getEvento().getNome(),
                        Collectors.counting()
                ));

        return contagem;
    }
}





