package Listas_Exercícios;

import POOaulas.OperacaoMatematica;
import java.util.Scanner;

public class Exercicios_Aula_08_15 {

    public static void main(String[] args) {
        exercicio1();
    }

    public static void exercicio1() {

        OperacaoMatematica operacao = new OperacaoMatematica();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        float peso = input.nextFloat();

        System.out.println("Informe a sua altura: ");
        float altura = input.nextFloat();

        float resultadoImc = operacao.imc(peso, altura);

        boolean pesoIdealMulher = (resultadoImc >= 19.1) && (resultadoImc <= 25.8);
        boolean pesoIdealHomem = (resultadoImc >= 20.8) && (resultadoImc <= 26.4);

        if (pesoIdealMulher && pesoIdealHomem) {

            System.out.println("Homem e mulher estão no peso ideal");
        } else if (pesoIdealMulher) {

            System.out.println("Mulher está no peso ideal");
        } else if (pesoIdealHomem) {

            System.out.println("Homem está no peso ideal");
        }

    }

}
