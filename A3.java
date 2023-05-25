package com.mycompany.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A3 {

    private static final double PRECO_1_BOLA = 3.0;
    private static final double PRECO_2_BOLAS = 5.0;
    private static final double PRECO_3_BOLAS = 7.0;

    private static final int MAX_SABORES = 20;
    private static final int MAX_ADICIONAIS = 10;

    public static void main(String[] args) {
        List<String> sabores = new ArrayList<>();
        List<String> adicionais = new ArrayList<>();

        // Adicione aqui os 20 sabores de sorvete diferentes
        sabores.add("Baunilha");
        sabores.add("Chocolate");
        sabores.add("Morango");
        sabores.add("Flocos");
        sabores.add("Chiclete");
        sabores.add("Blue ice");
        sabores.add("Limão");
        sabores.add("Abacaxi ao vinho");
        sabores.add("Pistache");
        sabores.add("Milho verde");
        sabores.add("Uva");
        sabores.add("Maracujá");
        sabores.add("Leite condensado");
        sabores.add("Passas ao rum");
        sabores.add("Coco");
        sabores.add("Doce de leite");
        sabores.add("Chocolate com menta");
        sabores.add("Brigadeiro");
        sabores.add("Amendoim");
        sabores.add("Açai");

        // Adicione aqui os 10 sabores adicionais
        adicionais.add("Granulado preto");
        adicionais.add("Granulado colorido");
        adicionais.add("Confete");
        adicionais.add("Leite condensado");
        adicionais.add("Leite em pó");
        adicionais.add("Granola");
        adicionais.add("Calda de chocolate");
        adicionais.add("Calda de morango");
        adicionais.add("Calda de caramelo");
        adicionais.add("Chantilli");

        exibirMenu(sabores, adicionais);
    }

    private static void exibirMenu(List<String> sabores, List<String> adicionais) {
        System.out.println("Cardápio de Sorveteria\n");
        System.out.println("1 bola: R$ " + PRECO_1_BOLA);
        System.out.println("2 bolas: R$ " + PRECO_2_BOLAS);
        System.out.println("3 bolas: R$ " + PRECO_3_BOLAS);
        System.out.println("\nSabores Disponíveis:");

        for (int i = 0; i < sabores.size(); i++) {
            System.out.println((i + 1) + ". " + sabores.get(i));
        }

        System.out.println("\nAdicionais Disponíveis:");

        for (int i = 0; i < adicionais.size(); i++) {
            System.out.println((i + 1) + ". " + adicionais.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de bolas desejado: ");
        int numeroBolas = scanner.nextInt();

        System.out.print("\nDigite o número do sabor da primeira bola desejado: ");
        int numeroSabor = scanner.nextInt();

        if (numeroBolas == 2 ) {
            System.out.print("\nDigite o número do sabor da segunda bola desejado: ");
            int numeroSabor2 = scanner.nextInt();

        }

        if (numeroBolas == 3 || numeroBolas == 2) {
            System.out.print("\nDigite o número do sabor da segunda bola desejado: ");
            int numeroSabor2 = scanner.nextInt();

            System.out.print("\nDigite o número do sabor da terceira bola desejado: ");
            int numeroSabor3 = scanner.nextInt();
        }

        System.out.println("Cada adicional custa R$2,00 a mais em seu pedido");
        System.out.println("Digite o número do adicional desejado (0 para nenhum): ");
        int numeroAdicional = scanner.nextInt();

        // Lógica para calcular o preço total
        double precoTotal = 0.0;

        switch (numeroBolas) {
            case 1:
                precoTotal += PRECO_1_BOLA;
                break;
            case 2:
                precoTotal += PRECO_2_BOLAS;
                break;
            case 3:
                precoTotal += PRECO_3_BOLAS;
                break;
            default:
                System.out.println("Número inválido de bolas selecionado.");
                return;
        }

        if (numeroSabor >= 1 && numeroSabor <= sabores.size()) {
            System.out.println("Sabores selecionados: " + sabores.get(numeroSabor - 1));
        } else if (numeroSabor >= 1 && numeroSabor <= sabores.size()) {
            System.out.println("Sabor selecionado: " + sabores.get(numeroSabor - 1));
        } else {
            System.out.println("Número inválido de sabor selecionado.");
            return;
        }

        if (numeroAdicional >= 1 && numeroAdicional
                <= adicionais.size()) {
            System.out.println("Adicional selecionado: " + adicionais.get(numeroAdicional - 1));
            precoTotal += 2.0; // Adicional
            System.out.println(" O Preço total do pedido ficou: " + "R$" + precoTotal );
        }
    }

}
