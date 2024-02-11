package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x,y,z;

        System.out.println("Digite um número ");

         x = sc.nextInt();

        System.out.println("Digite outro  número ");

         y = sc.nextInt();

        z = x+y;

        System.out.println("SOMA "+z);

        sc.close();
    }
}