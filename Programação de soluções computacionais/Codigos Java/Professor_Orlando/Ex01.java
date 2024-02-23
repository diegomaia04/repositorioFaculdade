/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       double n1, n2, n3, m, exame;
    
        System.out.println("Insira as notas");
       n1 = e.nextDouble();
       n2 = e.nextDouble();
       n3 = e.nextDouble();
       m = (n1+n2+n3)/3;
       
        if (0<= m && m < 3) {
            System.out.println("O Aluno esta reprovado");
        } else if (m>3 && m<7) {
            exame = 12-m;
            System.out.println("o Aluno devera fazer o exame e precisará tirar: " + exame );
        } else{
              System.out.println("O Aluno esta aprovado");
            
        }

    }
    
}
