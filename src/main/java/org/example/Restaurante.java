package org.example;

import java.util.Scanner;

public class Restaurante {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema Sabor e Arte");
        System.out.println("---Cardapio--Sabor e Arte----");
        System.out.println("1 - Picanha       R$ 25,00");
        System.out.println("2 - Lasanha       R$ 20,00");
        System.out.println("3 - Strogonoff    R$ 18,00");
        System.out.println("4 - Bife acebolado R$ 15,00");
        System.out.println("5 - Pão com ovo   R$ 5,00");

        System.out.println("Digite o código do prato:");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Você escolheu Picanha");
                break;
            case 2:
                System.out.println("Você escolheu Lasanha");
                break;
            case 3:
                System.out.println("Você escolheu Strogonoff");
                break;
            case 4:
                System.out.println("Você escolheu Bife acebolado");
                break;
            case 5:
                System.out.println("Você escolheu Pão com ovo ");
                break;
            default:
                System.out.println("Codigo Invalido");
        }


    }
}
