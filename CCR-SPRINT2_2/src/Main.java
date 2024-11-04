import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Criação "Banco de dados" com as infos dos funcionarios;
        GerirFuncionarios BancoDadosFuncionarios = new GerirFuncionarios();

        //Login dos usuarios;
        Login login1 = new Login("RO233","123");

        //Funcionarios
        Seguranca funcionario1 = new Seguranca("Germias",login1,Cargo.SEGURANCA);
        Limpeza funcionario2 = new Limpeza("Ademar",login1,Cargo.LIMPEZA);
        AtendentePlataforma funcionario3 = new AtendentePlataforma("Roaimo",login1,Cargo.ATENDENTE_PLATAFORMA);

        //Adicionando os funcionários no Banco de dados;
        BancoDadosFuncionarios.adicionarFuncionario(funcionario1);
        BancoDadosFuncionarios.adicionarFuncionario(funcionario2);
        BancoDadosFuncionarios.adicionarFuncionario(funcionario3);


        //Reportando eventos
        funcionario3.reportarEvento(BancoDadosFuncionarios.getListafuncionarios());
        funcionario1.reportarEvento(BancoDadosFuncionarios.getListafuncionarios());




        //Métodos dos funcionarios para manipular notificações/eventos;
        System.out.println(funcionario1.gerarRelatorio());
































        



    }
}
