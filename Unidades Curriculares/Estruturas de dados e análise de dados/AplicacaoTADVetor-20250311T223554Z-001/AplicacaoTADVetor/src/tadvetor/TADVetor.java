/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadvetor;

/**
 *
 * @author profslabs
 */
public class TADVetor {

    private double[] vetor;

    public TADVetor() {
        this.vetor = new double[0];
    }

    public void insere(double valor) {

        double[] aux = new double[this.vetor.length];

        for (int i = 0; i < this.vetor.length; i++) {
            aux[i] = this.vetor[i];
        }

        this.vetor = null;
        this.vetor = new double[aux.length + 1];

        for (int i = 0; i < aux.length; i++) {
            this.vetor[i] = aux[i];
        }

        this.vetor[this.vetor.length - 1] = valor;
    }

    public String print() {
        if (this.vetor.length == 0) {
            return "TADVetor vazio";
        }
        String txt = " ";
        for (double b : this.vetor) {
            txt = txt + b + " - ";
        }
        return txt;

    }

}
