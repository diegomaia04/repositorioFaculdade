/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio09;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1,n2;
       
       System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite segundo numero: ");
        n2 = entrada.nextInt();
        
        if (n1>n2) {
             System.out.println("O Maior entre os nuemros é: " + n1);
        } else if(n2>n1) {
             System.out.println("O Maior entre os numeros é: " + n2);
        } else{
        System.out.println("Os números são iguais");
        }
    }
           
}
