/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, poi;

        System.out.print("Digite numero: ");
        numero = entrada.nextInt();
        poi = (numero & 2);

        if (poi == 2) {

            System.out.println("O numero digitado " + numero + " é par");
            if (numero <= -1) {
                System.out.println("O numero digitado é negativo");
            } else {
                System.out.println("O numero digitado é positivo");
            }
        } else {
            System.out.println("O numero digitado " + numero + " é ímpar");
            if (numero <= -1) {
                System.out.println("O numero digitado é negativo");
            } else {
                System.out.println("O numero digitado é positivo");
            }

        }

    }
}
