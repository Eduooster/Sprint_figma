public class AtendentePlataforma extends Funcionario{
    public AtendentePlataforma() {
    }
    public AtendentePlataforma(String nome, Login login, Cargo cargo) {
        super(nome, login,cargo);
    }

    @Override
    public String gerarRelatorio() {
        return "Atendente de plataforma: " + getNome() + "\n" + "Seus eventos da semana: " + dicionarioOcorrido();
    }
}

