package Listas_Exercícios;

import java.util.Scanner;

public class Exercicios_Aula_08_29 {

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        //exercicio3();
        doWhileExercicio1();
    }

    public static void exercicio1() {

        int contador = 0;

        while (++contador <= 99) {

            if (contador % 2 != 0) {

                System.out.println(contador);

            }

        }

    }

    public static void exercicio2() {

        int valor = 50;

        while (valor != 1) {

            if (valor % 2 == 0) {

                valor = valor / 2;
                System.out.println(valor);

            } else {

                valor = (valor * 3 + 1) / 2;
                System.out.println(valor);

            }

        }

    }

    public static void exercicio3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = input.nextInt();
        int total = valor;

        while (valor != 0) {

            System.out.println("Informe um valor: ");
            valor = input.nextInt();

            total += valor;
            System.out.println(total);

        }

    }

    public static void doWhileExercicio1() {

        Scanner input = new Scanner(System.in);

        int totalPar = 0;
        int totalImpar = 0;
        String again;

        do {

            System.out.println("Informe um número inteiro: ");
            int vlr = input.nextInt();

            if (vlr % 2 == 0) {

                System.out.println("Par");
                totalPar += vlr;

            } else {

                System.out.println("Impar");
                totalImpar += vlr;

            }

            System.out.println("Deseja tentar de novo SIM ou NAO:");
            again = input.next();

        } while (again.equalsIgnoreCase("S"));

        System.out.println("Total de pares é de: " + totalPar);
        System.out.println("Total de impares é de: " + totalImpar);

   }
    
}
