import java.util.Map;
import java.util.stream.Collectors;

public class Seguranca extends Funcionario{


    public Seguranca() {
    }

    public Seguranca(String nome, Login login,Cargo cargo) {
        super(nome, login,cargo);

    }



    @Override
    public String gerarRelatorio() {
        var ocorridos = dicionarioOcorrido();

        return "Segurança: " + getNome() + "\n" + "Seus eventos da semana: " + ocorridos;
    }





}

