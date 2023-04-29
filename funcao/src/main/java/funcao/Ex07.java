/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

/**
 *
 * @author maiad
 */
public class Ex07 {
    public static void main(String[] args) {
        int resultado = fibonacci(5);
        System.out.println(resultado);
    }
    
    public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
    
}
