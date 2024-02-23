/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio06;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         //variaveis
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        if (numero > 20) {
         int metade = numero/2;
         System.out.println("A metade do numero selecionado é: " + metade);
         
        } else {
              System.out.println("O numero é igual ou menos que 20");
        }
    
   }
}