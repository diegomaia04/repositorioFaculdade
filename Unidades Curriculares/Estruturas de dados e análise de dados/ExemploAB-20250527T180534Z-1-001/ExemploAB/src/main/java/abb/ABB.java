package abb;

public class ABB {

    private No raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean vazia() {
        return (this.raiz == null);
    }

    public boolean busca(double valor) {
        return recBusca(valor, this.raiz);
    }
    
    private boolean recBusca(double valor, No busca){
        
        if (busca == null) {return false;}
        if (valor == busca.getValor()) {return true;}
        
        if (valor > busca.getValor()) {return recBusca(valor, busca.getDireita());}
        else{return recBusca(valor, busca.getEsquerda());}
    }
  
    public boolean insere(double valor) {

        if (busca(valor)) {
            return false;
        }

        No aux = new No(valor);

        if (vazia()) {
            this.raiz = aux;
            return true;
        }

        No ant = this.raiz;
        No ant2 = this.raiz;

        do {
            if (valor > ant.getValor()) {
                ant2 = ant;
                ant = ant.getDireita();
            } else {
                ant2 = ant;
                ant = ant.getEsquerda();
            }
        } while (ant != null);

        if (valor > ant2.getValor()) {
            ant2.setDireita(aux);
        } else {
            ant2.setEsquerda(aux);
        }
        return true;
    }
    
    public void printPrecurso(){
        recPreOrdem(this.raiz);
    }
    
    private void recPreOrdem(No temp){
        System.out.printf("%.1f", temp.getValor());
        if (temp.getEsquerda() != null) {recPreOrdem(temp.getEsquerda());}
        if (temp.getDireita() != null) {recPreOrdem(temp.getDireita());}
        
    }
}
