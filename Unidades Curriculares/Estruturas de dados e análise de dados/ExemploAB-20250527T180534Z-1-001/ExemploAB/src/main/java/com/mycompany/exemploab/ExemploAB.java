/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploab;

import abb.ABB;

/**
 *
 * @author profslabs
 */
public class ExemploAB {

    public static void main(String[] args) {
       ABB arvore  = new ABB();
       
       arvore.insere(10);
       arvore.insere(5);
       arvore.insere(20);
       arvore.insere(15);
       arvore.insere(30);
       arvore.insere(19);
       arvore.insere(99);
       
        System.out.println(arvore.busca(10));
        arvore.printPrecurso();
    }
}
