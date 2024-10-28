public class Main {
    public static void main(String[] args) {
        var login1 = new Login("Antonio", "123456");
        var login2 = new Login("Maria", "654321");


        var funcionario1 = new Funcionario("Maria",login1, "Limpeza");
        var funcionario2 = new Funcionario("Antonio",login2, "Segurança");

        var evento1 = new Evento("");

        var notificacao1 = new Notificacao("Vomito na estação");
    }
}
