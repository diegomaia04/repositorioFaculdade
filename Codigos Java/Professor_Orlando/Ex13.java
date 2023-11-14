/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

import static funcao.Ex02.maximo;

/**
 *
 * @author maiad
 */
public class Ex02 {

    public static void main(String[] args) {
        double maximoNum = maximo(4,5,2);
        System.out.println(maximoNum + " É o maior entres os numeros");

    }

    public static int maximo(int n1, int n2, int n3) {
        if (n2 > n3 && n2 > n1) {
            return n2;
        } else if (n1 > n2 && n3 <= n1) {
            return n1;
        } else {
        }
        return n3;

    }
}
