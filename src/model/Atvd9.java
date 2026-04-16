package model;

public class Atvd9 {
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculateIMC(double peso, double altura){
        double calcIMC = peso / Math.pow(altura,2);
        return calcIMC;
    }
    public double resultIMC(){
        switch(calculateIMC(getPeso(), getAltura())) {
            case < 18.5: {
                System.out.println("Peso ideal (parabéns)");
            }
        }
    }
}
