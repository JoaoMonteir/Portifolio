package petshop;

import java.util.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de Cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        // Cadastro de Pet
        System.out.print("Digite o nome do pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Digite a espécie do pet: ");
        String especie = scanner.nextLine();
        System.out.print("Digite a idade do pet: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        Pet pet = new Pet(nomePet, especie, idade, cliente);
        cliente.adicionarPet(pet);

        // Escolha do serviço
        System.out.println("Escolha o serviço:");
        System.out.println("1 - Banho (R$40,00)");
        System.out.println("2 - Tosa (R$50,00)");
        System.out.println("3 - Consulta (R$100,00)");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        Servico servico = null;
        switch (opcao) {
            case 1 -> servico = new Servico("Banho", 40.0);
            case 2 -> servico = new Servico("Tosa", 50.0);
            case 3 -> servico = new Servico("Consulta", 100.0);
            default -> {
                System.out.println("Serviço inválido.");
                System.exit(0);
            }
        }

        // Agendamento
        Agendamento agendamento = new Agendamento(cliente, pet, servico, LocalDateTime.now());

        // Exibição
        System.out.println("\n--- Agendamento Realizado ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Pet: " + pet.getNome() + " (" + pet.getEspecie() + ")");
        System.out.println("Serviço: " + servico.getTipo() + " - R$" + servico.getPreco());
        System.out.println("Data/Hora: " + agendamento.getDataHora());

        scanner.close();
    }
}