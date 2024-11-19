import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HistoricoResiduosDoados {

    private List<String> doacoes;

    public  HistoricoResiduosDoados() {
        this.doacoes = new ArrayList<>();
    }

    public void registrarDoacao(String alimento){
        doacoes.add(alimento);


    }

    @Override
    public String toString() {
        return "HistoricoResiduosDoados{" +
                "doacoes=" + doacoes +
                '}';
    }
}
