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
        return peso / Math.pow(altura,2);
    }
    public String resultIMC() {
        double imc = calculateIMC(getPeso(), getAltura());
        if (imc <= 18.5) {
            return "Abaixo do peso";
        } else if (imc > 18.5 && imc <= 24.9) {
            return "Peso ideal! Parabéns";
        } else if (imc > 24.9 && imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc > 29.9 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc > 34.9 && imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        } else if (imc > 39.9) {
            return "Obesidade Grau III (mórbida)";
        } else {
            return "Indisponível";
        }
    }
}
