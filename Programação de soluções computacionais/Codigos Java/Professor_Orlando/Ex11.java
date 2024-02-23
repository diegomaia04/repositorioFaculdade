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
public class Ex04 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Informe a medida dos lados do Triângulo");
        n1 = e.nextDouble();
        n2 = e.nextDouble();
        n3 = e.nextDouble();

        if (n1 == n2 && n2 == n3) {
            System.out.println("O triângulo é equilatero");

        } else if (n1 == n3 || n2 == n3) {
            System.out.println("O triângulo é Isósceles");

        } else  {
            System.out.println("O triângulo é Escaleno");
        }
    }

}
