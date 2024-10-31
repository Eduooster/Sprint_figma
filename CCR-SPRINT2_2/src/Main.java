import java.util.List;

public class Main {
    public static void main(String[] args){
        GerirFuncionarios BancoDadosFuncionarios = new GerirFuncionarios();

        Login login1 = new Login("RO233","123");
        Seguranca funcionario1 = new Seguranca("Germias",login1,"S");
        Limpeza funcionario2 = new Limpeza("Ademar",login1,"L");

        BancoDadosFuncionarios.adicionarFuncionario(funcionario1);
        BancoDadosFuncionarios.adicionarFuncionario(funcionario2);

        funcionario1.reportarEvento(BancoDadosFuncionarios.getListafuncionarios());
        funcionario1.reportarEvento(BancoDadosFuncionarios.getListafuncionarios());
        System.out.println("______________________");
        funcionario2.reportarEvento(BancoDadosFuncionarios.getListafuncionarios());

        funcionario1.buscarNotificacoesPorPrioridade("Baixa");


        System.out.println(funcionario1.getHistorico());
        System.out.println("_________");
        System.out.println(funcionario1.getNotificacoes());


        



    }
}
