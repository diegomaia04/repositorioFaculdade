package ex3;

import java.util.Scanner;

/**
 *
 * @author 12523169668
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Insira os Numeros: ");
        n1 = e.nextInt();
        n2 = e.nextInt();
        n3 = e.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println("A Ordem Crescente é: " + n1 + " " + n2 + " " + n3);

            } else {
                System.out.println("A Ordem Crescente é: " + n1 + " " + n3 + " " + n2);
            }
        }

        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println("A Ordem Crescente é: " + n2 + " " + n1 + " " + n3);

            } else {
                System.out.println("A Ordem Crescente é: " + n2 + " " + n3 + " " + n1);
            }
        }

        if (n3 < n1 && n3 < n2) {
            if (n1 < n3) {
                System.out.println("A Ordem Crescente é: " + n3 + " " + n1 + " " + n2);

            } else {
                System.out.println("A Ordem Crescente é: " + n3 + " " + n2 + " " + n1);
            }
        }

    }

}
