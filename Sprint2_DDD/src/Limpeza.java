public class Limpeza extends Funcionario{
    @Override
    public void gerarRelatorio(String relatorio) {
        System.out.println("Relatório Limpeza: " + relatorio);
        super.gerarRelatorio(relatorio);
    }

}
