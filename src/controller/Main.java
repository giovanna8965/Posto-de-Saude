package controller;

import model.Paciente;
import service.PostoSaudeService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostoSaudeService service = new PostoSaudeService();

        System.out.println("Bem-vindo ao Sistema do Posto de Saúde!");
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Listar Pacientes");
        // Outras opções

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        switch (opcao) {
            case 1:
                System.out.println("Nome:");
                String nome = scanner.nextLine();
                System.out.println("CPF:");
                String cpf = scanner.nextLine();
                System.out.println("Telefone:");
                String telefone = scanner.nextLine();
                System.out.println("Endereço:");
                String endereco = scanner.nextLine();

                Paciente paciente = new Paciente(nome, cpf, telefone, endereco);
                service.cadastrarPaciente(paciente);
                System.out.println("Paciente cadastrado com sucesso!");
                break;
            case 2:
                for (Paciente p : service.listarPacientes()) {
                    System.out.println(p.getNome() + " - " + p.getCpf());
                }
                break;
            // Outras opções
        }

        scanner.close();
    }
}

