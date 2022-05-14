import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

/*  Resolvi esse desafio há muito tempo atrás, no dia 22/05/2020, quando estava começando na programação.
    Ele está resolvido na minha conta do beecrowd, antigo URI Online Judge. Somente reaproveitei o código.

    Hoje em dia, resolveria da seguinte forma:
    -Criaria um array de BigDecimal com todos os valores (moedas e notas)
    -Criaria um array para qtd correspondente à mesma posição da nota/moeda do array de BigDecimal
    -Subtrairia do input o valor da nota/moeda até não ser mais possível, incrementando o array de qtd a cada iteração
    -Retornaria o resultado

Meu perfil: https://www.beecrowd.com.br/judge/pt/profile/433832 */

public class Desafio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        DecimalFormat df1 = new DecimalFormat("0.00");

        double valor = sc.nextDouble();
        double inicial = valor;

        int valueInt = (int) valor;

        System.out.println("NOTAS:");

        int notas100 = valueInt / 100;
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        valueInt -= notas100 * 100;

        int notas50 = valueInt / 50;
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        valueInt -= notas50 * 50;

        int notas20 = valueInt / 20;
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        valueInt -= notas20 * 20;

        int notas10 = valueInt / 10;
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        valueInt -= notas10 * 10;

        int notas5 = valueInt / 5;
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        valueInt -= notas5 * 5;

        int notas2 = valueInt / 2;
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        valueInt -= notas2 * 2;

        System.out.println("MOEDAS:");

        int moedas1 = valueInt;
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        //ATÉ AQUI TA CERTO

        String conversao = String.valueOf(inicial);
        int index = conversao.indexOf(".");

        conversao = conversao.substring(index+1, conversao.length());

        if(conversao.length() == 1){
            conversao = conversao.concat("0");
        }
        BigDecimal bd = new BigDecimal(conversao);
        BigDecimal bd0 = new BigDecimal("0.00");
        BigDecimal bd50 = new BigDecimal("50");
        BigDecimal bd25 = new BigDecimal("25");
        BigDecimal bd10 = new BigDecimal("10");
        BigDecimal bd5 = new BigDecimal("5");
        BigDecimal bd1 = new BigDecimal("1");

        if (bd.subtract(bd50).compareTo(bd0) >= 0) {
            System.out.println("1 moeda(s) de R$ 0.50");
            bd = bd.subtract(bd50);
        } else {
            System.out.println("0 moeda(s) de R$ 0.50");
        }

        if (bd.subtract(bd25).compareTo(bd0) >= 0) {
            System.out.println("1 moeda(s) de R$ 0.25");
            bd = bd.subtract(bd25);
        } else {
            System.out.println("0 moeda(s) de R$ 0.25");
        }

        int contador10 = 0;
        for (int i = 0; i < 2; i++) {
            if (bd.subtract(bd10).compareTo(bd0) >= 0) {
                contador10++;
                bd = bd.subtract(bd10);
            }
        }
        System.out.println(contador10 + " moeda(s) de R$ 0.10");


        if (bd.subtract(bd5).compareTo(bd0) >= 0) {
            System.out.println("1 moeda(s) de R$ 0.05");
            bd = bd.subtract(bd5);
        } else {
            System.out.println("0 moeda(s) de R$ 0.05");
        }

        int contador1 = 0;
        for (int i = 0; i < 4; i++) {
            if (bd.subtract(bd1).compareTo(bd0) >= 0) {
                contador1++;
                bd = bd.subtract(bd1);
            }
        }
        System.out.println(contador1 + " moeda(s) de R$ 0.01");
    }
}