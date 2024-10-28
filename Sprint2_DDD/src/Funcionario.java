import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public void gerarRelatorio(String relatorio) {
        System.out.println("Relatório Gerado: " + relatorio);
    }

    public List<Notificacao> getNotificacoesEmAberto(){
        return notificacoes;
    }

    public void solicitarAjuda(String cargoAlvo, Evento evento) {
        System.out.println("Solicitando ajuda: " + cargoAlvo + "\n" + "Evento: " + evento );
    }

    public void atualizarStatus(Notificacao notificacao) {

    }

    public void adicionarNotificacao(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getNotificacoes(), that.getNotificacoes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLogin(), getCargo(), getNotificacoes());
    }

    @Override
    public String toString() {
        return """
                Funcionario{
                    nome='$nome', 
                    login=$login, 
                    cargo='$cargo', 
                    notificacoes=$notificacoes
                }""";
    }
}
