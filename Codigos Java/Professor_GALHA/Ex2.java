/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double n1, n2;

        System.out.println("Insira os Numeros: ");
        n1 = e.nextDouble();
        n2 = e.nextDouble();
       
        if (n1>n2) {
            System.out.println("N1 é o maior Número: " + n1);      
        } else {
            System.out.println("N2 é o maior Número: " + n2);
        }
    }

}
