package org.example;

import java.util.Scanner;

public class Restaurante {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        char continuar;

        do {

            System.out.println("Bem vindo ao Sistema Sabor e Arte");
            System.out.println("---Cardapio--Sabor e Arte----");
            System.out.println("1 - Picanha        R$ 25,00");
            System.out.println("2 - Lasanha        R$ 20,00");
            System.out.println("3 - Strogonoff     R$ 18,00");
            System.out.println("4 - Bife acebolado R$ 15,00");
            System.out.println("5 - Pão com ovo    R$ 5,00");

            System.out.println("Digite o código do prato:");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número de 1 a 5:");
                scanner.next();
            }

            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    System.out.println("Você escolheu Picanha");
                    total += 25;
                    break;

                case 2:
                    System.out.println("Você escolheu Lasanha");
                    total += 20;
                    break;

                case 3:
                    System.out.println("Você escolheu Strogonoff");
                    total += 18;
                    break;

                case 4:
                    System.out.println("Você escolheu Bife acebolado");
                    total += 15;
                    break;

                case 5:
                    System.out.println("Você escolheu Pão com ovo");
                    total += 5;
                    break;

                default:
                    System.out.println("Código inválido.");
            }

            do {
                System.out.println("Deseja adicionar outro prato? (S/N)");
                continuar = scanner.next().toUpperCase().charAt(0);

                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Opção inválida. Digite apenas S ou N.");
                }

            } while (continuar != 'S' && continuar != 'N');

        } while (continuar == 'S');

        System.out.printf("Total da comanda: R$ %.2f%n", total);

        scanner.close();
    }
}