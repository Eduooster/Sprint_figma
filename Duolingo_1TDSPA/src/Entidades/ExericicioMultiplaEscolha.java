package Entidades;

import java.util.ArrayList;
import java.util.List;

public class ExericicioMultiplaEscolha extends Exercicio{
    private List<String> opcoes = new ArrayList<>();

    public ExericicioMultiplaEscolha(String pergunta, String respostaCorreta, int dificuldade, List<String> opcoes) {
        super(pergunta, respostaCorreta, dificuldade);
        this.opcoes = opcoes;
    }

    @Override
    public String getTipo(){
        return "Multipla escolha";
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }
}
