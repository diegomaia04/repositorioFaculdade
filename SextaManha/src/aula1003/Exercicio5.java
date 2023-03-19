/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1003;

import java.util.Scanner;

public class Exercicio5
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite seu sexo (M/F): ");
		char sexo = input.next().charAt(0);
		
		System.out.print("Digite sua altura (em cm): ");
		double altura = input.nextDouble();
		
		if (Character.toUpperCase(sexo) == 'M') {
		    System.out.printf("Seu peso ideal é %.2f kg.", (72.7 * (altura / 100)) - 58);
		} else if (Character.toUpperCase(sexo) == 'F') {
		    System.out.printf("Seu peso ideal é %.2f kg.", (62.1 * (altura / 100)) - 44.7);
		} else {
		    System.out.printf("Dados inválidos. Por favor, tente novamente");
		}
	}
}
