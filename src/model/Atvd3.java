package model;

public class Atvd3 {
    private int a;
    private int b;

    public Atvd3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int somaSe(int a, int b){
        if (saoIguais(a, b)){
            int c = a+b;
            System.out.println("C: " + c);
            return a+b;
        } else {
            int c = a*b;
            System.out.println("C: " + c);
            return a*b;
        }
    }
    public boolean saoIguais(int a, int b){
        return a == b;
    }
}
