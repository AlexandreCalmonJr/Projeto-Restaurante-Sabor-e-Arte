package org.example;

import java.util.Scanner;

public class Censo {

    public static void main() {

        Scanner scanner = new Scanner(System.in);

        executar(scanner);

        scanner.close();
    }

    public static void executar(Scanner scanner) {

        int opcao;
        int quantidadePessoas = 0;
        double somaSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int mulheresSalario5000 = 0;

        do {

            exibirMenu();

            opcao = lerOpcao(scanner);

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Cadastro de pessoa ---");

                    int idade = lerIdade(scanner);
                    char sexo = lerSexo(scanner);
                    double salario = lerSalario(scanner);

                    // A primeira pessoa cadastrada define
                    // inicialmente a maior e a menor idade.
                    if (quantidadePessoas == 0) {
                        maiorIdade = idade;
                        menorIdade = idade;
                    } else {

                        if (idade > maiorIdade) {
                            maiorIdade = idade;
                        }

                        if (idade < menorIdade) {
                            menorIdade = idade;
                        }
                    }

                    somaSalarios += salario;
                    quantidadePessoas++;

                    if (sexo == 'F' && salario >= 5000) {
                        mulheresSalario5000++;
                    }

                    System.out.println("Pessoa cadastrada com sucesso!\n");
                    break;

                case 2:
                    exibirResultados(
                            quantidadePessoas,
                            somaSalarios,
                            maiorIdade,
                            menorIdade,
                            mulheresSalario5000
                    );
                    break;

                case 3:
                    System.out.println("\nRetornando ao menu principal...\n");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
            }

        } while (opcao != 3);
    }

    public static void exibirMenu() {

        System.out.println("===== CENSO SOCIOECONÔMICO =====");
        System.out.println("1 - Adicionar pessoa");
        System.out.println("2 - Exibir resultados");
        System.out.println("3 - Sair");
    }

    public static int lerOpcao(Scanner scanner) {

        System.out.print("Escolha uma opção: ");

        return scanner.nextInt();
    }

    public static int lerIdade(Scanner scanner) {

        int idade;

        do {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida! Digite uma idade maior que zero.");
            }

        } while (idade <= 0);

        if (idade < 18) {
            System.out.println("Classificação: Menor de idade.");
        } else {
            System.out.println("Classificação: Maior de idade.");
        }

        return idade;
    }



    public static char lerSexo(Scanner scanner) {

        char sexo;

        do {
            System.out.println("\nSexo:");
            System.out.println("M - Masculino");
            System.out.println("F - Feminino");
            System.out.print("Escolha: ");

            sexo = scanner.next()
                    .toUpperCase()
                    .charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo inválido! Escolha M ou F.");
            }

        } while (sexo != 'M' && sexo != 'F');

        return sexo;
    }


    public static double lerSalario(Scanner scanner) {

        double salario;

        do {
            System.out.print("Digite o salário: R$ ");
            salario = scanner.nextDouble();

            if (salario < 0) {
                System.out.println("Salário inválido! O valor não pode ser negativo.");
            }
        } while (salario < 0);

        return salario;
    }

    public static void exibirResultados(
            int quantidadePessoas,
            double somaSalarios,
            int maiorIdade,
            int menorIdade,
            int mulheresSalario5000
    ) {
        System.out.println("\n===== RESULTADOS DO CENSO =====");

        if (quantidadePessoas == 0) {
            System.out.println("Nenhuma pessoa cadastrada ainda.\n");
            return;
        }

        double mediaSalarial = somaSalarios / quantidadePessoas;

        System.out.printf("Média salarial: R$ %.2f%n", mediaSalarial);
        System.out.println("Maior idade registrada: " + maiorIdade);
        System.out.println("Menor idade registrada: " + menorIdade);
        System.out.println("Mulheres com salário >= R$ 5.000,00: " + mulheresSalario5000);
        System.out.println();
    }
}
