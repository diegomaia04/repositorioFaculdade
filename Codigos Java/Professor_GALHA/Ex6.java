/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2;
        
        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite segundo numero: ");
        n2 = entrada.nextInt();
        
        if (n1>n2) {
             System.out.println("Em ordem descresente é" + n1 + "//" + n2);
        } else if(n2>n1) {
             System.out.println("Em ordem descresente é: " + n2 + "//" + n1);
        } else{
        System.out.println("Os números são iguais");
        }
    }
    
}
