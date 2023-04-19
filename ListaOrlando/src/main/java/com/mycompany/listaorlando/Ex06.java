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
public class Ex06 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Digite uma frase (ou 'PARE' para sair): ");
            frase = scanner.nextLine();
        } while (!frase.equalsIgnoreCase("PARE"));
        
        System.out.println("Programa encerrado.");
    }

}
