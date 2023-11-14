/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0414;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex03 {
     public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int []numeros = new int[5];
        String[] ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite " + ordem[i] + " numero: ");
            numeros[i] = tc.nextInt();
        }
        
        for (int anterior = 0; anterior < numeros.length; anterior++) {
            for (int proximo = anterior + 1; proximo < numeros.length; proximo++) {
                if (numeros[proximo] < numeros[anterior]) {
                    int aux = numeros[anterior];
                    numeros[anterior] = numeros[proximo];
                    numeros[proximo] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
    

