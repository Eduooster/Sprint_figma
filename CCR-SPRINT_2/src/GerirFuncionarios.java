import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerirFuncionarios {
    private List<Funcionario> Listafuncionarios = new ArrayList<>();

    public GerirFuncionarios(){

    }
    public GerirFuncionarios(List listafuncionarios) {
        this.Listafuncionarios = listafuncionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        Listafuncionarios.add(funcionario);
    }

    public List<Funcionario> getListafuncionarios() {
        return Listafuncionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        GerirFuncionarios that = (GerirFuncionarios) o;
        return Objects.equals(Listafuncionarios, that.Listafuncionarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Listafuncionarios);
    }

    @Override
    public String toString() {
        return "GerirFuncionarios{" +
                "Listafuncionarios=" + Listafuncionarios +
                '}';
    }
}
