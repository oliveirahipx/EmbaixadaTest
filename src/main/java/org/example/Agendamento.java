package org.example;

public class Agendamento {
    private Cidadao cidadao;
    private String data;
    private String servico;

    public Agendamento(Cidadao cidadao, String data, String servico) {
        this.cidadao = cidadao;
        this.data = data;
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "Agendamento de " + cidadao.getNome() + " para o serviço: " + servico + " em " + data;
    }
}
