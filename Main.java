package org.example;

import java.util.Scanner;

public class Main {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=========================================");
            System.out.println("          PAINEL DE SISTEMAS             ");
            System.out.println("=========================================");
            System.out.println("1 - Sistema Restaurante (Sabor e Arte)");
            System.out.println("2 - Sistema Censo Socioeconômico");
            System.out.println("3 - Sair do programa");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite 1, 2 ou 3:");
                scanner.next();
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n>>> Iniciando Restaurante Sabor e Arte <<<\n");
                    Restaurante.executar(scanner);
                    break;

                case 2:
                    System.out.println("\n>>> Iniciando Censo Socioeconômico <<<\n");
                    Censo.executar(scanner);
                    break;

                case 3:
                    System.out.println("\nEncerrando o painel de sistemas. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Escolha 1, 2 ou 3.\n");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
