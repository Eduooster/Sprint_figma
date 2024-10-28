public class Manutencao extends Funcionario{

    @Override
    public void gerarRelatorio(String relatorio) {
        System.out.println("Relatório Manutenção: " + relatorio);
        super.gerarRelatorio(relatorio);
    }
}
