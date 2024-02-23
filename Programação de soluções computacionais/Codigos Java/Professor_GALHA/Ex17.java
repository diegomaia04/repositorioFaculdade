/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1003;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Informe o KG do Peixe que foi trago: ");
        double peso = e.nextDouble();
        //  double multa = 0.0;
        double excesso = peso - 50.00;

        if (peso > 50) {
            System.out.println("João terá que pagar de multa: " + excesso * 4.0);
        } else {
            System.out.println("João não tera que pagar a multa");
        }

    }

}
