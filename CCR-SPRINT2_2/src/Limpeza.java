public class Limpeza extends Funcionario {
    public Limpeza() {

    }
    public Limpeza(String nome, Login login, Cargo cargo) {
        super(nome, login,cargo);
    }

    @Override
    public String gerarRelatorio() {
        return "Limpeza: " + getNome() + "\n" + "Seus eventos da semana: " + dicionarioOcorrido();
    }
}
