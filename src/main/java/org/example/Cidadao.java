package org.example;

import java.util.List;

public class Cidadao {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private List<String> documentos;
    private String status;

    public Cidadao(String nome, String cpf, String dataNascimento, List<String> documentos, String status) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.documentos = documentos;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Status: " + status + ", Documentos: " + documentos;
    }
}
