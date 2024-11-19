public class PontoColeta {
    private LocalColeta local_coleta;
    private String horario_funcionamento;
    private int capacidade;
    private Residuo tipoResiduo; //Aqui, é para saber se o local de coleta aceita organico e/ou inorganico

    public PontoColeta(LocalColeta local, String horario_funcionamento, int capacidade, Residuo tipoResiduo) {
        this.local_coleta = local;
        this.horario_funcionamento = horario_funcionamento;
        this.capacidade = capacidade;
        this.tipoResiduo = tipoResiduo;
    }
}
