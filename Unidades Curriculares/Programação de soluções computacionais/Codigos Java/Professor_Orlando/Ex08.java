/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaorlando;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n1,n2,n3;
        
        System.out.println("insira os números");
        n1 = e.nextInt();
        n2 = e.nextInt();
        n3 = e.nextInt();
        
        if (n1 > n2 && n2> n3) {
            System.out.println("Em Ordem Crescente os números são: " + n3 + " ," + n2 + " e " + n1);
        } else if (n1 > n3 && n2> n1) {
                System.out.println("Em Ordem Crescente os números são: " + n3 + " ," + n1 + " e " + n2);
        } else if (n2 > n1 && n1> n3) {
            // System.out.println("Em Ordem Crescente os números são: " + n1 + " ," + n3 + " e " + n2);
        }  else if (n2 > n1 && n3> n2) {
             System.out.println("Em Ordem Crescente os números são: " + n1+ " ," + n2 + " e " + n3);
        } else if (n3 > n1 && n3> n2) {
             System.out.println("Em Ordem Crescente os números são: " + n2 + " ," + n1 + " e " + n3);
        } else if (n3 > n2 && n3> n2) {
             System.out.println("Em Ordem Crescente os números são: " + n2 + " ," + n3 + " e " + n1);
        } else {
             System.out.println("Em Ordem Crescente os números são: " + n1 + " ," + n3 + " e " + n2);
        }
        
    }
    
}
