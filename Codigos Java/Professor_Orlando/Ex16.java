/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

/**
 *
 * @author maiad
 */
public class Ex06 {

    public static void main(String[] args) {
        int Resultado = factorial(6);
        System.out.println("O valor do fatorial é: " + Resultado);
    }

    public static int factorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;

    }

}
