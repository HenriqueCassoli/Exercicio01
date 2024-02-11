package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int id_itens1, id_itens2, number_intens1,number_intens2;
        double price1,price2,pricefinal;

        System.out.println("fale o código do produto 1");
        id_itens1 = sc.nextInt();

        System.out.println("números de peças");
         number_intens1 = sc.nextInt();

        System.out.println("preço de produtos");
        price1 = sc.nextDouble();


        System.out.println("fale o código do produto 2");
        id_itens2 = sc.nextInt();

        System.out.println("números de peças");
        number_intens2 =sc.nextInt();

        System.out.println("preço de produtos");
        price2 = sc.nextDouble();

        pricefinal =(number_intens1*price1)+(number_intens2*price2);

        System.out.printf("O valor a pagar:R$ %.2f%n",pricefinal);

    }
}
