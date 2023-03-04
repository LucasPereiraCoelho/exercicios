package Listas_Exercícios;

import POOaulas.OperacaoMatematica;
import java.util.Scanner;

public class Exercicios_Aula_08_23 {

    public static void main(String[] args) {
        
        //exercicio1();
        exercicio2();

    }

    public static void exercicio1() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o mês do ano (1 a 12):  ");
        int mes = input.nextInt();

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias nesse mês.");
                break;
            case 2:
                System.out.println("28 dias nesse mês.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias nesse mês.");
                break;
        }

    }
    
    
    public static void exercicio2() {
        
        Scanner input = new Scanner(System.in);
        OperacaoMatematica operacao = new OperacaoMatematica();
        
        System.out.println("Informe o primeiro número inteiro: ");
        int vlr1 = input.nextInt();
        
        System.out.println("Informe o segundo número inteiro: ");
        int vlr2 = input.nextInt();
        
        System.out.println("Informe qual operação você deseja (+, -, *, /): ");
        String operacaoDesejada = input.next();
        
        
        switch (operacaoDesejada){
        
            case "+":
                
                int resultadoMais = operacao.somarNumeros(vlr1, vlr2);
                System.out.println(resultadoMais);
                break;
            
            case "-":
                int resultadoMenos = operacao.subtrairNumeros(vlr1, vlr2);
                System.out.println(resultadoMenos);
                break;
            
            case "*":
                int resultadoVezes = operacao.multiplicarNumeros(vlr1, vlr2);
                System.out.println(resultadoVezes);
                break;
                
            case "/":
                double resultadoDivisao = operacao.dividirNumeros(vlr1, vlr2);
                System.out.println(resultadoDivisao);
                break;
                     
        
        
        }
        
        
        
        
        



    }

}
