package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Embaixada embaixada = new Embaixada();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmbaixada - Sistema de Gestão");
            System.out.println("1. Cadastrar Cidadão");
            System.out.println("2. Marcar Agendamento");
            System.out.println("3. Registrar Visto");
            System.out.println("4. Gerar Relatório de Cidadãos");
            System.out.println("5. Gerar Relatório de Atendimentos");
            System.out.println("6. Gerar Relatório de Vistos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1: // Cadastrar Cidadão
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de Nascimento (AAAA-MM-DD): ");
                    String dataNascimento = scanner.nextLine();
                    System.out.print("Status (Ex: Ativo, Pendente): ");
                    String status = scanner.nextLine();

                    List<String> documentos = new ArrayList<>();
                    System.out.print("Digite o número de documentos: ");
                    int numDocs = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    for (int i = 0; i < numDocs; i++) {
                        System.out.print("Documento " + (i + 1) + ": ");
                        documentos.add(scanner.nextLine());
                    }

                    embaixada.cadastrarCidadao(nome, cpf, dataNascimento, documentos, status);
                    break;

                case 2: // Marcar Agendamento
                    System.out.print("Digite o CPF do cidadão: ");
                    cpf = scanner.nextLine();
                    System.out.print("Digite a data do agendamento (AAAA-MM-DD): ");
                    String data = scanner.nextLine();
                    System.out.print("Digite o serviço (Ex: Consulta, Apoio a Visto): ");
                    String servico = scanner.nextLine();

                    embaixada.marcarAgendamento(cpf, data, servico);
                    break;

                case 3: // Registrar Visto
                    System.out.print("Digite o CPF do cidadão: ");
                    cpf = scanner.nextLine();
                    System.out.print("Digite o tipo de visto (Ex: Turismo, Trabalho): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite a data de solicitação (AAAA-MM-DD): ");
                    String dataSolicitacao = scanner.nextLine();
                    System.out.print("Digite o status do visto (Ex: Aprovado, Em Análise): ");
                    String vistoStatus = scanner.nextLine();

                    embaixada.registrarVisto(cpf, tipo, dataSolicitacao, vistoStatus);
                    break;

                case 4: // Gerar Relatório de Cidadãos
                    embaixada.gerarRelatorioCidadãos();
                    break;

                case 5: // Gerar Relatório de Atendimentos
                    embaixada.gerarRelatorioAtendimentos();
                    break;

                case 6: // Gerar Relatório de Vistos
                    embaixada.gerarRelatorioVistos();
                    break;

                case 7: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
