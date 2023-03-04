package Listas_Exercícios;

import java.util.Scanner;

public class Exercicios_Aula_08_01 {

    public static void main(String[] args) {

        exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();

    }

    public static void exercicio1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos anos você tem: ");
        int anos = input.nextInt();

        System.out.println("E quantos meses: ");
        int mes = input.nextInt();

        System.out.println("E quantos dias: ");
        int dias = input.nextInt();

        int totalAnos = anos * 365;
        int totalMeses = mes * 30;

        System.out.println("Você tem " + (totalAnos + totalMeses + dias) + " dias de vida.");

    }

    public static void exercicio2() {

        OperacaoMatematica operacao = new OperacaoMatematica();

        int vlr1 = 8;
        int vlr2 = 9;
        int vlr3 = 7;

        int vlr4 = 4;
        int vlr5 = 5;
        int vlr6 = 6;

        float media1 = operacao.media(vlr1, vlr2, vlr3, 3);
        System.out.println("A média dos valores 8, 9 e 7 é de " + media1);

        float media2 = operacao.media(vlr4, vlr5, vlr6, 3);
        System.out.println("A média dos valores 4, 5 e 6 é de " + media2);

        System.out.println("A soma das duas médias é de " + (media1 + media2));

        System.out.println("A média da soma das duas médias é de " + (media1 + media2) / 2);

    }

    public static void exercicio3() {

        Scanner input = new Scanner(System.in);
        OperacaoMatematica operacao = new OperacaoMatematica();

        System.out.println("Informe um saldo: ");
        float saldo = input.nextFloat();

        float reajusteSaldo = operacao.porcentagem(saldo, 1);

        System.out.println("Seu saldo de " + saldo + " com reajuste de 1% passou a ser " + (saldo + reajusteSaldo));

    }

    public static void exercicio4() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numb = input.nextInt();

        System.out.println("Antecessor: " + --numb);
        ++numb;
        System.out.println("Sucessor: " + ++numb);

    }

    public static void exercicio5() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        String vlr = input.next();

        int conversao = Integer.parseInt(vlr);

        System.out.println(conversao);
        System.out.println(conversao * 2);

    }
}
