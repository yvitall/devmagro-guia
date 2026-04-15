package model;

public class Atvd2 {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void ParOuImpar(int valor){
        if (valor % 2 != 0 ){
            if (valor < 0){
            System.out.println("O valor é IMPAR e NEGATIVO");
            } else if (valor > 0){
                System.out.println("O valor é ÍMPAR e POSITIVO");
            }
        } else if (valor % 2 == 0) {
            if (valor < 0){
                System.out.println("O valor é PAR e NEGATIVO");
            } else if (valor > 0){
                System.out.println("O valor é PAR e POSITIVO");
            }
        }
    }
}
