/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex05 {
     public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int op;
        double n1,n2,a,r;
        
         System.out.println("Menu de opções:\n" + "1.Somar dois numeros\n" + "2.Raiz Quadrada de um numero.\n"
         +  "Digite a opção desejada");
         
          op = e.nextInt();
          
          switch(op){
              case 1:
       System.out.println("A opção escolhido foi: 1.");
       System.out.println("Digite os numeros para a soma: ");
        n1 = e.nextDouble();
        n2 = e.nextDouble();
        a = n1 + n2;
        System.out.println("A soma dos numero é igual: " + a);
       break;
       
              case 2:
       System.out.println("A opção escolhido foi: 2.");
       System.out.println("Digite os numeros para a Raiz Quadrada: ");
        n1 = e.nextDouble();
        r = Math.sqrt(n1);
        System.out.println("A A raiz quadrada do nuemro é igual: " + r);
       break;
       
              
          }
        
    }
    
}
