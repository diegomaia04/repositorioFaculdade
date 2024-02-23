/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao;

/**
 *
 * @author 12523169668
 */
public class Ex01 {

    public static void main(String[] args) {
        double mediaRetomanada = Media(19, 19);
        System.out.println("MEDIA: " + mediaRetomanada);
    }

    public static double Media(double num1, double num2) {
        double media = (num1 + num2) / 2;
        return media;
    }

}
