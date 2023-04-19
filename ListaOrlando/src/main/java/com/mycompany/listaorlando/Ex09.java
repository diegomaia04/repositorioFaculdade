/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaorlando;

/**
 *
 * @author maiad
 */
public class Ex09 {
     public static void main(String[] args) {
        System.out.println("Números divisíveis por 5 de 0 a 1000:");
        
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

