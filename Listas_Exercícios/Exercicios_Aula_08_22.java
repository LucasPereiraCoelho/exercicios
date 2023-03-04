package Listas_Exercícios;

import POOaulas.OperacaoMatematica;
import java.util.Scanner;

public class Exercicios_Aula_08_22 {

    public static void main(String[] args) {

        //exercicio1();
        exercicio2();
    }

    public static void exercicio1() {

        OperacaoMatematica operacao = new OperacaoMatematica();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int vlr1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int vlr2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int vlr3 = input.nextInt();

        int resultado = operacao.numeroMaior(vlr1, vlr2, vlr3);

        System.out.println("O maior número digitado foi: " + resultado);

    }

    public static void exercicio2() {
        OperacaoMatematica operacao = new OperacaoMatematica();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        float peso = input.nextFloat();

        System.out.println("Informe a sua altura: ");
        float altura = input.nextFloat();

        System.out.println("Informe o seu sexo M para masculino e F para feminino: ");
        String sexo = input.next();

        float resultadoImc = operacao.imc(peso, altura);

        if (sexo.equalsIgnoreCase("M")) {

            if (resultadoImc < 20.7) {

                System.out.println("Homem Abaixo do peso");

            } else if (resultadoImc >= 20.8 && resultadoImc <= 26.4) {

                System.out.println("Homem no peso ideal");

            } else if (resultadoImc >= 26.5 && resultadoImc <= 27.8) {

                System.out.println("Homem um pouco acima do peso");

            } else if (resultadoImc >= 27.9 && resultadoImc <= 31.1) {

                System.out.println("Homem acima do peso ideal");

            } else {

                System.out.println("Homem obeso");

            }

        }
        
        
        else if (sexo.equalsIgnoreCase("F")){
        
            if (resultadoImc < 19.1){
            
                System.out.println("Mulher abaixo do peso");
                
            }else if (resultadoImc >= 19.2 && resultadoImc <= 25.8){
            
                System.out.println("Mulher no peso ideal");
            
            }else if (resultadoImc >= 25.9 && resultadoImc <= 27.3){
            
                System.out.println("Mulher um pouco acima do peso");
            
            }else if (resultadoImc >= 27.4 && resultadoImc <= 32.3){
            
                System.out.println("Mulher acima do peso ideal");
            
            }else{
            
                System.out.println("Mulher obesa");
            
            }
        
        
        }

    }

}
