public class Seguranca extends Funcionario{
    @Override
    public void gerarRelatorio(String relatorio) {
        System.out.println("Relatório Segurança: " + relatorio);
        super.gerarRelatorio(relatorio);
    }
}
