public enum TipoEvento {
    BRIGA(Cargo.SEGURANCA),
    ROUBO(Cargo.SEGURANCA),
    COMPORTAMENTO_SUSPEITO(Cargo.SEGURANCA),
    ELEVADOR_QUEBRADO(Cargo.TECNICO_MANUTENCAO),
    TELAO_DE_AVISO_QUEBRADO(Cargo.TECNICO_MANUTENCAO),
    FALHA_DE_ILUMINACAO(Cargo.TECNICO_MANUTENCAO),
    LIMPEZA_BANHEIRO(Cargo.LIMPEZA),
    LIXO_ACUMULADO(Cargo.LIMPEZA),
    DERRAMAMENTO(Cargo.LIMPEZA),
    AJUDA_PASSAGEIRO(Cargo.ATENDENTE_PLATAFORMA),
    OBJETO_PERDIDO(Cargo.ATENDENTE_PLATAFORMA),
    ORIENTACAO_EMBARQUE(Cargo.ATENDENTE_PLATAFORMA);

    private final Cargo responsavel;

    TipoEvento(Cargo responsavel) {
        this.responsavel = responsavel;
    }

    public Cargo getResponsavel() {
        return responsavel;
    }
}