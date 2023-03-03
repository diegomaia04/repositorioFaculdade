/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg07;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         //variaveis
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        if (idade >= 18) {
         System.out.println("A pessoa é maior de idade");
         
        } else {
              System.out.println("A pessoa é menor de idade");
        }
    
   }
}