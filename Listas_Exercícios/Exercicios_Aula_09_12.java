package Listas_Exercícios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios_Aula_09_12 {

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        exercicio3();

    }

    public static void exercicio1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos para armazenar: ");
        int qtd = input.nextInt();

        String[] produtos = new String[qtd];

        for (int n = 0; n < produtos.length; n++) {

            System.out.println("Informe um produto: ");
            produtos[n] = input.next();

        }

        Arrays.sort(produtos);

        for (int i = 0; i < produtos.length; i++) {

            System.out.println(produtos[i]);
        }
    }

    public static void exercicio2() {

        Scanner input = new Scanner(System.in);
        String palavra = "";

        do {

            System.out.println("Digite algo para recebe-lo invertido: ");
            palavra = input.next();

        } while (palavra.length() < 2);

        char[] toCharArray = palavra.toCharArray();

        for (int a = toCharArray.length - 1; a >= 0; a--) {

            System.out.print(toCharArray[a]);

        }

    }

    public static void exercicio3() {

        Scanner entrada = new Scanner(System.in);

        int[] respostas = new int[30];

        for (int i = 0; i < respostas.length; i++) {
            System.out.println("Digite a nota do aluno: " + i);
            int notaAluno = entrada.nextInt();
            respostas[i] = notaAluno;
        }

        int[] frequencia = new int[11];

        for (int resposta = 0; resposta < respostas.length; resposta++) {
            int valor = respostas[resposta];
            
            frequencia[valor] = frequencia[valor] + 1;
        }

        System.out.printf("%s%10s\n", "Nota", "Qtd Respostas");

        for (int nota = 1; nota < frequencia.length; nota++) {
            if (frequencia[nota] > 0) {
                System.out.printf("%d%10d\n", nota, frequencia[nota]);
            }
        }
    }
}
