/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

/**
 *
 * @author maiad
 */
public class Ex03 {
    public static void main(String[] args) {
        double geoResultado = mediaGeo(2,8);
        System.out.println("A media geometrica é de: " + geoResultado);
    }
    
    public static double mediaGeo (int n1, int n2){
        double media = Math. sqrt((n1 * n2));
        return media;
        
    }
    
}
