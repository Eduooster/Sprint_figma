public class TecnicoManutencao extends Funcionario{
    public TecnicoManutencao() {
    }
    public TecnicoManutencao(String nome, Login login, Cargo cargo) {
        super(nome, login,cargo);
    }

    @Override
    public String gerarRelatorio() {
        return "TecnicoManutencao: " + getNome() + "\n" + "Seus eventos da semana: " + dicionarioOcorrido();
    }
}

