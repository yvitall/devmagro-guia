import model.Atvd8;
import model.Atvd9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); //objeto tipo SCANNER

       /* //exercicio 1
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

        //exercicio 6
        System.out.println("\n------- EXERCICIO 6 -------");
        System.out.println("Digite qualquer valor: R$");
        double valorReajust = sc.nextDouble();
        sc.nextLine();

        Atvd6 atvd6 = new Atvd6();
        atvd6.setValor(valorReajust);
        System.out.println(atvd6.reajust());

        //exercicio 7
        System.out.println("\n------- EXERCICIO 7 -------");
        System.out.print("Digite 'VERDADEIRO' ou 'FALSO' para o primeiro valor: ");
        String vl1 = sc.nextLine();
        char convertVl1 = vl1.toLowerCase().charAt(0);
        System.out.print("Digite 'VERDADEIRO' ou 'FALSO' para o segundo valor: ");
        String vl2 = sc.nextLine();
        char convertVl2 = vl2.toLowerCase().charAt(0);

        Atvd7 atvd7 = new Atvd7();
        atvd7.decided(convertVl1, convertVl2);
        atvd7.isTrue();
*/
        //exercicio 8
        System.out.println("\n------- EXERCICIO 8 -------");
        System.out.print("Digite o valor de início: ");
        int valorAtvd8 = sc.nextInt();
        sc.nextLine();

        Atvd8 atvd8 = new Atvd8();
        atvd8.setInicio(valorAtvd8);
        atvd8.decrescente();

        //exercicio 9
        System.out.println("\n------- EXERCICIO 9 -------");
        Atvd9 atvd9 = new Atvd9();
        System.out.print("Digite seu peso: ");
        atvd9.setPeso(sc.nextDouble());
        System.out.print("Digite sua altura: ");
        atvd9.setAltura(sc.nextDouble());

        atvd9.



    }
}
