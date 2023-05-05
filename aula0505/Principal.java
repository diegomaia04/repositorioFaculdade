/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0505;

import java.util.Scanner;

/**
 *
 * @author maiad
 */
public class Principal {

       public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Personagem heroi;
        Personagem monstro = new Personagem("Goblin", 2);

        System.out.println("Digite o nome do Heroi");
        String nome = tc.next();
        heroi = new Personagem(nome, 10);

        System.out.println("Ola, sou " + heroi.nome + " salvarei este mundo "
                + "nefasto!!!!");
        int ataque  = heroi.ataque();
        System.out.println(heroi.nome + " encontrou um " + monstro.nome);
        System.out.println("O nosso heroi correu e atacou o monstro com " 
                + ataque);
        monstro.dano(ataque);
        System.out.println(monstro.nome + " ficou com " + monstro.vida);
    }
}
