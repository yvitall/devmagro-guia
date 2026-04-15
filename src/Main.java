import model.*;

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
        imparOuPar.setValor(value2);
        imparOuPar.ParOuImpar();

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

        //exercicio 4
        System.out.println("\n------- EXERCICIO 4 -------");
        System.out.print("Digite um valor: ");
        int ex4 = sc.nextInt();
        sc.nextLine();
        Atvd4 atvd4 = new Atvd4();
        atvd4.setValor(ex4);
        atvd4.antecSucessor();

        //exercicio 5
        System.out.println("\n------- EXERCICIO 5 -------");
        System.out.print("Digite seu salário: R$");
        double salario = sc.nextDouble();
        sc.nextLine();

        Atvd5 atvd5 = new Atvd5();
        atvd5.setSalario(salario);
        atvd5.qtdSalarios();

    }
}
