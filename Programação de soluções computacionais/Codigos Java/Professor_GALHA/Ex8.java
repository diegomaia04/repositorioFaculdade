/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio08;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite o Numero: ");
        numero = entrada.nextInt();
        
        
        if (numero >= 50 && numero <101) {
             System.out.println("O numero esta no intervalo");
        } else {
                System.out.println("O numero não esta no intervalo");
        }
    }
    
}
