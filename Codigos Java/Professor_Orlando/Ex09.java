package com.mycompany.listaorlando;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex02 {

    public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
        int sexo;
        double altura, h, f;
        
        System.out.println(" Informe o Seu Sexo: " );
         sexo = e.nextInt();
            
        System.out.println("informe a sua altura: ");
             altura = e.nextDouble(); 
             
        h = ((72.7 * altura) - 58);
        f = ((62.1 * altura)  - 44.7);
        
          
          switch (sexo){
              case 1 -> {
                  System.out.println("A opção escolhido foi: 1.");   
                  System.out.println("o peso ideal é: " + h);
                  break;
            }
       
              case 2 -> {
                  
                  System.out.println("A opção escolhido foi: 2.");
                  System.out.println("o peso ideal é: " + f);
                  break;
            }
       
              
          }
        
    }
    
}