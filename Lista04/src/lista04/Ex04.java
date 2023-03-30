/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner e  = new Scanner(System.in);
        System.out.println("Insira o numero");
        n = e.nextInt();
        
        if (n%2==0) {
            System.out.printf("%d e par\n", n);
        } else {
                System.out.printf("%d e impar\n", n);
        }
    }
    
}
