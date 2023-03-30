/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner e  = new Scanner(System.in);
        double s,ns,b,a;
        System.out.println("Insira o salario");
        s = e.nextDouble();
        
        if (s<500) {
            b=0.05*s;
        } else if(s>500 && s< 1200) {
             b=0.12*s;
        } else {
            b=0;
        }
        
        if (s<600) {
            a=150;
        } else {
            a=100;
        }
 
        //salalrio
        ns =s+b+a;
        System.out.println("O valor do Salario será de: " + ns);
    }
    
}
