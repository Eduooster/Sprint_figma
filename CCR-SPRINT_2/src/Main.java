import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        var loginFuncionario1 = new Login("geremias-12","senha123");
        var loginFuncionario2 = new Login("Fernando", "sese");
        var loginFuncionario4 = new Login("cleber","sdsdsds");

        Funcionario funcionario1 = new Seguranca(loginFuncionario1.getUserName(),loginFuncionario1,"Seguranca");
        Funcionario funcionario3 = new Seguranca(loginFuncionario2.getUserName(),loginFuncionario2,"Seguranca");
        Funcionario funcionario4 = new Limpeza(loginFuncionario4.getUserName(),loginFuncionario4,"Limpeza");

        var listaFuncionarios = new GerirFuncionarios();

        listaFuncionarios.adicionarFuncionario(funcionario1);
        listaFuncionarios.adicionarFuncionario(funcionario3);
        listaFuncionarios.adicionarFuncionario(funcionario4);




        System.out.println(funcionario1.getNotificacoes());


        funcionario1.reportarEvento(listaFuncionarios.getListafuncionarios());


        funcionario1.verificarTarefasPendentes();
        System.out.println("______________");
        funcionario1.atualizarStatus("e","Resolvido");
        System.out.println("______________");
        funcionario1.verificarTarefasPendentes();

























}
}

