package model;

public class Atvd8 {
    private int inicio;

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    public void decrescente(){
        for(int i = getInicio(); i >= 0; i--){
            System.out.println(i);
        }
    }
}
