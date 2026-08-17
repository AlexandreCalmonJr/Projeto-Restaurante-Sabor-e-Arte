package org.example;

import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        executar(scanner);

        scanner.close();
    }

    public static void executar(Scanner scanner) {

        double total = 0;
        char continuar;

        do {

            exibirCardapio();

            int codigo = lerCodigoPrato(scanner);

            double preco = obterPrecoPrato(codigo);

            total += preco;

            continuar = perguntarContinuar(scanner);

        } while (continuar == 'S');

        System.out.printf("%nTotal da comanda: R$ %.2f%n%n", total);
    }

    public static void exibirCardapio() {
        System.out.println("Bem vindo ao Sistema Sabor e Arte");
        System.out.println("---Cardapio--Sabor e Arte----");
        System.out.println("1 - Picanha        R$ 25,00");
        System.out.println("2 - Lasanha        R$ 20,00");
        System.out.println("3 - Strogonoff     R$ 18,00");
        System.out.println("4 - Bife acebolado R$ 15,00");
        System.out.println("5 - Pão com ovo    R$ 5,00");
    }

    public static int lerCodigoPrato(Scanner scanner) {

        int codigo;

        while (true) {

            System.out.println("Digite o código do prato:");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número de 1 a 5:");
                scanner.next();
                continue;
            }

            codigo = scanner.nextInt();

            if (codigo >= 1 && codigo <= 5) {
                return codigo;
            }

            System.out.println("Código inválido. Digite um número de 1 a 5.");
        }
    }

    public static double obterPrecoPrato(int codigo) {

        switch (codigo) {
            case 1:
                System.out.println("Você escolheu Picanha");
                return 25;

            case 2:
                System.out.println("Você escolheu Lasanha");
                return 20;

            case 3:
                System.out.println("Você escolheu Strogonoff");
                return 18;

            case 4:
                System.out.println("Você escolheu Bife acebolado");
                return 15;

            case 5:
                System.out.println("Você escolheu Pão com ovo");
                return 5;

            default:
                System.out.println("Código inválido.");
                return 0;
        }
    }

    public static char perguntarContinuar(Scanner scanner) {

        char continuar;

        do {
            System.out.println("Deseja adicionar outro prato? (S/N)");

            continuar = scanner.next()
                    .toUpperCase()
                    .charAt(0);

            if (continuar != 'S' && continuar != 'N') {
                System.out.println("Opção inválida. Digite apenas S ou N.");
            }

        } while (continuar != 'S' && continuar != 'N');

        return continuar;
    }
}