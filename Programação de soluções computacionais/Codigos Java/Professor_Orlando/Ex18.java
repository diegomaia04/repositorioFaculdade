/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

/**
 *
 * @author maiad
 */
public class Ex10 {

    public static void main(String[] args) {
        double Resultado = imc(50,1.70);
        System.out.println("Resultado: " + Resultado);

    }

    public static double imc(double peso, double altura) {
       // IMC = Massa (kg) ÷ Altura (m)².
        double imc =  peso / (altura*altura);
        return imc;

    }
}
