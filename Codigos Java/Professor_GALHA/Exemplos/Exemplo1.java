/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0414;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maiad
 */
public class Exemplo1 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] idade = {1, 2, 3, 4, 5, 41, 32, 25, 12};
        int[] vetor = new int[7];
        String nomes[] = {"JOAO", "FELIPE", "MIGUEL",
            "SORAIA", "FABIANO", "FLAVIO"};

        System.out.print("");
        /*  for (int i = 0; i < idade.length; i++) {
            if (i < idade.length -1){
            System.out.print(idade[i] + ", "); 
            } else {
                System.out.print(idade[i]); 
            }
        }      
         System.out.print("]\n");
        System.out.println(Arrays.toString(idade));
         */
        
        for(int i = 0; i < vetor.length; i++){
        vetor[i] = random.nextInt(11);
        
        System.out.println(Arrays.toString(vetor));
    }

    }

}
