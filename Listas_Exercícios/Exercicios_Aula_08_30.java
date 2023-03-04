package Listas_Exercícios;

import java.util.Scanner;

public class Exercicios_Aula_08_30 {

    public static void main(String[] args) {

        //exercicio1();
        exercicio2();

    }

    public static void exercicio1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 10: ");
        int tamanho = input.nextInt();

        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {

                System.out.print(" # ");

            }

            System.out.println();

        }

    }

    public static void exercicio2() {

        int vlr1 = 0;
        int vlr2 = 1;
        int resultado;

        System.out.println(vlr1);
        System.out.println(vlr2);

        for (int n = 0; n <= 20; n++) {

            resultado = (vlr1 + vlr2);
            vlr1 = vlr2;
            vlr2 = resultado;

            System.out.println(resultado);

        }

    }

}
