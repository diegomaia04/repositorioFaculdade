/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0505;


    public class Carros {

        // ATRIBUTOS
        final int numeroRodas = 4;
        int aroRodas;
        String cor; //verde, amarelo, preto...
        String categoria; // Sedan, Hatch, Picape
        double motor; //1.0, 1.4, 2.0, 2.2, 4.0, v8
        int numeroPortas = 2;
        int velocidade;
        int x; // contador de distância (metros)

        // MÉTODOS
        // MÉTODO CONSTRUTOR
        public Carros(String cor, String categoria, int aroRodas,
                double motor) {
            this.cor = cor;
            this.categoria = categoria;
            this.aroRodas = aroRodas;
            this.motor = motor;
        }

        public int acelerar() {
            if (x < 10) {
                velocidade += 5;
                x++;
            }
            return velocidade;
        }

        public int frear() {
            if (velocidade > 0 && x < 10) {
                x--;
                return velocidade -= 5;
            }
            return velocidade = 0;
        }

    }

