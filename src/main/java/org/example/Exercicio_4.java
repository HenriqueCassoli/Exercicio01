package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero_funcionario, horas_traba;
        double salario_horas , salario_mesal;

        System.out.println("qual é seu o número de funcionário ?");
        numero_funcionario = sc.nextInt();

        System.out.println("O horas trabalhadas ?");
        horas_traba = sc.nextInt();

        System.out.println("Valor da sua hora");
        salario_horas = sc.nextDouble();

        salario_mesal = salario_horas * horas_traba;

        System.out.println("seu numero é "+ numero_funcionario);
        System.out.printf("seu salario é %.2f%n",salario_mesal);
    }
}
