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
public class Ex03 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double lado, n1, n2, n3, areaT, areaQ;

        System.out.println("Insira o Numero de lados do Polígono: ");
        lado = e.nextDouble();

        // areaQ = n1 * n2;
        //  AreaT = (n1 * n2) / 2;
        if (lado == 3) {
            System.out.println("Insira quantos cm tem cada lado: ");
            n1 = e.nextDouble();
            n2 = e.nextDouble();
            n3 = e.nextDouble();
            areaT = (n1 * n2) / 2;
            System.out.println("A area do triângulo é de: " + areaT + "cm2");

        } else if (lado == 4) {
            System.out.println("Insira quantos cm tem a base e a altura do Quadrado: ");
            n1 = e.nextDouble();
            n2 = e.nextDouble();
            areaQ = n1 * n2;
            System.out.println("A area do quadrado é de: " + areaQ + "cm2");

        } else if (lado == 5) {
            System.out.println("O Polígono é um Péntagono. ");

        } else if (lado > 5) {
            System.out.println("Poligono não identificado.");
            
        } else if (lado < 3) {
            System.out.println("Não é um Poligono.");
           
        }
    }

}
