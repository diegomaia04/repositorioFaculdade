/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         double n1,n2,resultado,resultado2;
       
       System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextDouble();
        
        System.out.print("Digite segundo numero: ");
        n2 = entrada.nextDouble();
        
        //processamnto
        resultado = (n1-n2);
        resultado2 = (n2-n1);
        
        if ( n1 == n2) {
            System.out.print("Os núemros são iguais! ");
        } else if(n1>n2) {
            System.out.print("A diferença entre os nuemros é:" + resultado);
        } else {
        System.out.print("A diferença entre os nuemros é:" + resultado2);
        }
    }
    
}
