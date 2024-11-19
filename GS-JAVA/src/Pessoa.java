import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private String endereco;
    private HistoricoResiduosDoados historico_residuos_doados;

    public Pessoa(String nome, int idade, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.historico_residuos_doados = new HistoricoResiduosDoados();
    }

    public void doarResiduo(PontoColeta ponto_coleta,Residuo residuo){
        historico_residuos_doados.registrarDoacao("teste");

    }

    public HistoricoResiduosDoados getHistorico_residuos_doados() {
        return historico_residuos_doados;
    }

    public void registrarDoacao(){

    }
}
