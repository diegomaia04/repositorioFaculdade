/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2, nota3, m, exame;
        Scanner e = new Scanner(System.in);

        System.out.println("Insira as Notas");
        nota1 = e.nextDouble();
        nota2 = e.nextDouble();
        nota3 = e.nextDouble();
        m = (nota1+nota2+nota3)/3.0;
        if (m>0&&m<3) {
            System.out.println("reprovado");               
        } 
        if (m>=3&&m<7) {
            System.out.println("Exame");  
            exame=12-m;
            System.out.println("exame : " + exame); 
                    
        } 
        if(m>=7&&m<=10){
            System.out.println("Aprovado");
        }

    }

}
