package org.example;

public class Visto {
    private Cidadao cidadao;
    private String tipo;
    private String dataSolicitacao;
    private String status;

    public Visto(Cidadao cidadao, String tipo, String dataSolicitacao, String status) {
        this.cidadao = cidadao;
        this.tipo = tipo;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Visto de " + tipo + " para " + cidadao.getNome() + " (CPF: " + cidadao.getCpf() + ") - Status: " + status;
    }
}
