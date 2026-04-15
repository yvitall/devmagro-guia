package model;

public class Atvd5 {
    public static final double SALARIOMIN = 1293.20;

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void qtdSalarios(){
        if (salario > 0){
            double qtdSal = salario/SALARIOMIN;
            System.out.printf("Fulano recebe: %.1f salários mínimos", qtdSal);
        } else {
            System.err.println("Não foi possível calcular, valor menor que 0");
        }
    }

}
