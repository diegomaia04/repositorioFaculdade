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
public class Exercico8 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //  char Ap, An, Bp, Bn, ABp, ABn, Op, On;

        System.out.println("Informe o seu Tipo Sanguíneo: ");
        char tipo = e.next().charAt(0);

        if (tipo == 'A') {
            System.out.println("Se for A+: Recebe de A+, A-, O+, O-");
            System.out.println("Se for A-: Recebe de A-, O-");

        } else if (tipo == 'B') {
            System.out.println("Se for B+: Recebe de B+, B-, O+, O-");
            System.out.println("Se for B-: Recebe de B-, O-");

        } else if (tipo == 'O') {
            System.out.println("Se for O+: Recebe de  O+, O-");
            System.out.println("Se for O-: Recebe de  O-");
        } else {
            System.out.println("Se for AB+: Recebe de todos os tipos sanguineos");
            System.out.println("Se for AB-: Recebe de  A-,B-,AB-,O-");
        }

    }

}
