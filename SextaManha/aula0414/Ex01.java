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
public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int va[] = new int[5];
        int vb[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira os valores do vetor a: ");
            va[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vb[i] = va[i] * 3;
            System.out.println("Valores do vetor b (vetor a * 3): " + vb[i]);
        }

    }
}
