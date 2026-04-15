import model.Atvd1;
import model.Atvd2;
import model.Atvd3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); //objeto tipo SCANNER

        //exercicio 1
        System.out.print("Qual valor de A: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual valor de B: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual valor de C: ");
        int c = sc.nextInt();
        sc.nextLine();

        Atvd1 valores = new Atvd1(a, b, c);
        valores.SomaC();
        //exercicio 2
        System.out.println("\n------- EXERCICIO 2 -------");
        System.out.print("Digite um valor: ");
        int value2 = sc.nextInt();
        sc.nextLine();

        Atvd2 imparOuPar = new Atvd2();
        imparOuPar.ParOuImpar(value2);

        //exercicio 3
        System.out.println("\n------- EXERCICIO 3 -------");
        System.out.print("Qual valor de A: ");
        int a3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual valor de B: ");
        int b3 = sc.nextInt();
        sc.nextLine();

        Atvd3 atvd3 = new Atvd3(a3, b3);
        System.out.println(atvd3.somaSe(atvd3.getA(), atvd3.getB()));

    }
}
