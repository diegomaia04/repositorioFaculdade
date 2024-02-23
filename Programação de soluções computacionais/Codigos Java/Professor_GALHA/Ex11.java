/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0414;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int media = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Digite um numero para seu vetor : ");
            numeros[x] = scan.nextInt();
            media += numeros[x];

            maior = (numeros[x] > maior ? numeros[x] : maior);
            menor = (numeros[x] < menor ? numeros[x] : menor);

            if (x == numeros.length - 1) {
                media /= numeros.length;
            }
        }

        System.out.println("A média do vetor é : " + media);
        System.out.println("O maior numero é : " + maior);
        System.out.println("O menor numero é : " + menor);
    }
}
