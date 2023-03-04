package Listas_Exercícios;

import POOaulas.OperacaoMatematica;
import java.util.Scanner;


public class Exercicios_Aula_08_09 {
    
    public static void main(String[] args) {
        
        //exercicio1();
        //exercicio2();
        //exercicio3();
    }
    
    
    public static void exercicio1(){
    OperacaoMatematica operacao = new OperacaoMatematica();
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o nome do produto: ");
        String nome = input.next();
        
        System.out.println("Digite o valor do produto: ");
        float valor = input.nextFloat();
        
        float aumento = operacao.porcentagem(valor, 65);

        
        System.out.println("O " + nome + " com aumento de 65% fica: " + (aumento + valor));
    }
   
    
    
    public static void exercicio2(){
    OperacaoMatematica operacao = new OperacaoMatematica();
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o valor do primeiro produto: ");
    float preco1 = input.nextFloat();
    
    System.out.println("Digite o valor do segundo produto: ");
    float preco2 = input.nextFloat();    
    
    System.out.println("Digite o valor do terceiro produto: ");
    float preco3 = input.nextFloat();            
            
    float mediaVendas = operacao.media(preco1, preco2, preco3, 3);
    
    System.out.println("A media das vendas das três últimas vendas foram: " + mediaVendas);
    
    }
    
    
    public static void exercicio3(){
    OperacaoMatematica operacao = new OperacaoMatematica();
    Scanner input = new Scanner(System.in);
    
        System.out.println("Informe o seu peso: ");
        float peso = input.nextFloat();
        
        System.out.println("Informe a sua altura: ");
        float altura = input.nextFloat();
        
        float imcresultado = operacao.imc(peso, altura);
        
        System.out.println("O calculo do seu IMC e de: " + imcresultado);
    }
    
    
}
