package model;

public class Atvd1 {
    private int a;
    private int b;
    private int c;

    public Atvd1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void SomaC() {
        int abValue = this.a + this.b;
        if (abValue > this.c){
            System.out.printf("%d é maior que %d", abValue, this.c);
        } else if (abValue <= this.c){
            System.out.printf("%d é menor ou igual a %d", abValue, this.c);
        }
    }
}
