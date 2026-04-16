package model;

public class Atvd7 {
    private boolean firstValue;
    private boolean secondValue;

    public Atvd7(boolean firstValue, boolean secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Atvd7() {
    }

    public boolean isFirstValue() {
        return firstValue;
    }

    public boolean isSecondValue() {
        return secondValue;
    }

    public boolean isTrue(){
        if (firstValue == true && secondValue == true){
            System.out.println("AMBOS VALORES SÃO VERDADEIROS");
            return true;
        } else if (firstValue == false && secondValue == false){
            System.out.println("AMBOS VALORES SÃO FALSOS");
            return false;
        } else {
            System.out.printf("OS VALORES NÃO SÃO IGUAIS\nFirst Value: %b\nSecond Value: %b\n", firstValue, secondValue);
            return false;
        }
    }

    public void decided(char valor, char valor2){
        if (valor == 'v' && valor2 == 'v') {
            this.firstValue = true;
            this.secondValue = true;
        } else if (valor == 'f' && valor2 == 'f'){
            this.firstValue = false;
            this.secondValue = false;
        } else {
            if (valor == 'f'){
                this.firstValue = false;
                this.secondValue = true;
            } else {
                this.firstValue = true;
                this.secondValue = false;
            }
        }
    }


}
