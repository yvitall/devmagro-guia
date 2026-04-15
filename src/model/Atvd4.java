package model;

public class Atvd4 {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public void antecSucessor(){
        int antecessor = getValor()-1;
        int sucessor = getValor()+1;
        System.out.println(antecessor);
        System.out.println(valor);
        System.out.println(sucessor);
    }

}
