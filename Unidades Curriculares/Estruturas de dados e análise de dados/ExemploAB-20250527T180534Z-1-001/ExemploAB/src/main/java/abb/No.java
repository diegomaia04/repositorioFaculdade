package abb;

public class No {
    
    private double valor;
    private No direita;
    private No esquerda;
   
    public No(double valor){
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }
     

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public double getValor() {
        return valor;
    }

    public No getDireita() {
        return direita;
    }

    public No getEsquerda() {
        return esquerda;
    }
}
