/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

/**
 *
 * @author maiad
 */
public class Ex05 {

    public static void main(String[] args) {
        int resultadoPotencia = potencia(3, 2);
        System.out.println(resultadoPotencia + " valor elevado");
    }

    public static int potencia(int num1, int num2) {
        int potencia = (int) Math.pow(num1, num2);
        return potencia;
    }

}
