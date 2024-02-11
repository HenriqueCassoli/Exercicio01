package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B,C,D,diferencia;

        System.out.println("digite seus numeros");

         A = sc.nextInt();

         B =sc.nextInt();

         C=sc.nextInt();

          D=sc.nextInt();

        diferencia =(A*B - C*D);

        System.out.println("a diferencia é "+diferencia);

        sc.close();
    }


}
