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
public class Ex07 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fim;
        
        System.out.print("Digite o valor de início: ");
        inicio = scanner.nextInt();
        
        System.out.print("Digite o valor de fim: ");
        fim = scanner.nextInt();
        
        System.out.println("Números no intervalo de " + inicio + " até " + fim + ":");
        
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}

