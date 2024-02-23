/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0505;

import java.util.Random;

/**
 *
 * @author maiad
 */
public class Personagem {
  
    // Atributos
    String nome;
    int vida;
    int defesa = 2;
    
    // Métodos
    // Construtor
    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }
    
    public int ataque() {
        Random gerador = new Random();
        return gerador.nextInt(6) + 1;// 1 -> 6
    }
    
    public void dano(int ataque) {
        if (ataque > this.defesa) {
            int dano = ataque - this.defesa;
            this.vida -= dano;
        }
    }
}
