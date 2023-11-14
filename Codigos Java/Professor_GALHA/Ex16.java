/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1003;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int idade;
        double hemo;

        System.out.println("Digite seu nome:");
        String nome = e.nextLine();

        System.out.println("Digite sua idade:");
        idade = e.nextInt();

        System.out.println("Digite seu Sexo(M/F):");
        char sexo = e.next().charAt(0);

        System.out.println("Digite o nivel de hemoglobina: ");
        hemo = e.nextDouble();

        if (idade >= 2 && idade <= 6) {
            if (hemo >= 11.5 && hemo <= 13.5) {
                System.out.println(" está em niveis normais");
            } else {
                System.out.println("Possui alterações e não está em niveis normais ");
            }

        } else if (idade > 6 && idade <= 12) {
            if (hemo >= 11.5 && hemo <= 15.5) {
                System.out.println(" a hemoglobina está em niveis normais");
            } else {
                System.out.println("Possui alterações e não está em niveis normais ");
            }

        } else if (sexo == 'M') {
            if (hemo >= 14 && hemo <= 18) {
                System.out.println(" a hemoglobina está em niveis normais");
            } else {
                System.out.println("Possui alterações e não está em niveis normais ");
            }
        } else if (sexo == 'F') {
            System.out.println("Voc~e está gravida(S/N)");
            char resposta = e.next().charAt(0);

            if (resposta == 'S') {
                if (hemo >= 11 && hemo <= 11) {
                    System.out.println(" a hemoglobina está em niveis normais");
                } else {
                    System.out.println("Possui alterações e não está em niveis normais ");
                }

            }
            if (resposta == 'N') {
                if (hemo >= 12 && hemo <= 16) {
                    System.out.println(" a hemoglobina está em niveis normais");
                } else {
                    System.out.println("Possui alterações e não está em niveis normais ");
                }
            }

        } else {
            System.out.println("Os dado apresentados são invalidos, tente novamente");
        }

    }

}
