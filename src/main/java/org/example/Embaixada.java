package org.example;
import java.util.ArrayList;
import java.util.List;

public class Embaixada {
    private List<Cidadao> cidados;
    private List<Agendamento> agendamentos;
    private List<Visto> vistos;

    public Embaixada() {
        cidados = new ArrayList<>();
        agendamentos = new ArrayList<>();
        vistos = new ArrayList<>();
    }

    public void cadastrarCidadao(String nome, String cpf, String dataNascimento, List<String> documentos, String status) {
        Cidadao cidadao = new Cidadao(nome, cpf, dataNascimento, documentos, status);
        cidados.add(cidadao);
        System.out.println("Cidadão " + nome + " cadastrado com sucesso!");
    }

    public void marcarAgendamento(String cpf, String data, String servico) {
        Cidadao cidadao = buscarCidadaoPorCpf(cpf);
        if (cidadao != null) {
            Agendamento agendamento = new Agendamento(cidadao, data, servico);
            agendamentos.add(agendamento);
            System.out.println("Agendamento realizado para " + cidadao.getNome() + " para o serviço " + servico + " em " + data);
        } else {
            System.out.println("Cidadão com CPF " + cpf + " não encontrado.");
        }
    }

    public void registrarVisto(String cpf, String tipo, String dataSolicitacao, String status) {
        Cidadao cidadao = buscarCidadaoPorCpf(cpf);
        if (cidadao != null) {
            Visto visto = new Visto(cidadao, tipo, dataSolicitacao, status);
            vistos.add(visto);
            System.out.println("Visto " + tipo + " para " + cidadao.getNome() + " registrado com sucesso!");
        } else {
            System.out.println("Cidadão com CPF " + cpf + " não encontrado.");
        }
    }

    private Cidadao buscarCidadaoPorCpf(String cpf) {
        for (Cidadao cidadao : cidados) {
            if (cidadao.getCpf().equals(cpf)) {
                return cidadao;
            }
        }
        return null;
    }

    public void gerarRelatorioAtendimentos() {
        System.out.println("\nRelatório de Atendimentos:");
        for (Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
        }
    }

    public void gerarRelatorioVistos() {
        System.out.println("\nRelatório de Vistos:");
        for (Visto visto : vistos) {
            System.out.println(visto);
        }
    }

    public void gerarRelatorioCidadãos() {
        System.out.println("\nRelatório de Cidadãos:");
        for (Cidadao cidadao : cidados) {
            System.out.println(cidadao);
        }
    }
}
