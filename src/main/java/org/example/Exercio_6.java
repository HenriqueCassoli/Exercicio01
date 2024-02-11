package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercio_6 {

    public static void main(String[]args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A , B,C;
        double TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;

        System.out.println("coloque os numeros");

        A = sc.nextDouble();
        B =sc.nextDouble();
        C = sc.nextDouble();

        TRIANGULO = (A*C)/2;
        CIRCULO = Math.PI*Math.pow(C,2);
        TRAPEZIO = (A+B)/C*2.0;
        QUADRADO = B*B;
        RETANGULO = A*B;

        System.out.printf("TRIANGULO %.3f%n",TRIANGULO);
        System.out.printf("CIRCULO %.3f%n",CIRCULO);
        System.out.printf("TRAPEZIO %.3f%n",TRAPEZIO);
        System.out.printf("QUADRADO %.3f%n",QUADRADO);
        System.out.printf("RETANGULO %.3f%n",RETANGULO);

    }
}
