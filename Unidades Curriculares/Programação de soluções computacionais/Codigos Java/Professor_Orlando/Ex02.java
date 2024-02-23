/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex02 {
    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       int n1, n2;
       
        System.out.println("insira dois números");
        n1 = e.nextInt();
        n2 = e.nextInt();
        
        if (n1>n2) {
            System.out.println("A sequência dos numeros são: " + n1 + " e " + n2);
        } else {
             System.out.println("A sequência dos numeros são: " + n2 + " e " + n1);
        }
               
        
    }
    
}
