package Listas_Exercícios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios_Aula_09_20 {

    public static void main(String[] args) {

        //exercicio1();
        exercicio1Complemento();

    }

    public static void exercicio1() {

        Scanner input = new Scanner(System.in);
        List<String> bebidas = new ArrayList<>();

        bebidas.add("Vinho");
        bebidas.add("Coca");
        bebidas.add("Pureza");
        bebidas.add("Água");

        System.out.println("Qual bebida você deseja: ");
        String bebidaCliente = input.next();

        if (bebidas.contains(bebidaCliente)) {

            bebidas.remove(bebidaCliente);

        } else {

            System.out.println("A bebida não existe na lista.");

        }

        System.out.println(bebidas);

    }

    public static void exercicio1Complemento() {

        Scanner input = new Scanner(System.in);
        List<String> bebidas = new ArrayList<>();
        String continuar = "";

        System.out.println("Quantas bebidas você deseja armazenar: ");
        int quantidadeBebidas = input.nextInt();

        for (int n = 0; n <= quantidadeBebidas - 1; n++) {

            System.out.println("Informe a bebida a ser armazenada: ");
            String bebidaArmazenada = input.next();

            bebidas.add(bebidaArmazenada);

        }

        do {

            System.out.println("Qual bebida você deseja: ");
            String bebidaCliente = input.next();

            if (bebidas.contains(bebidaCliente)) {

                bebidas.remove(bebidaCliente);

            } else {

                System.out.println("Não existe");

            }

            System.out.println("Deseja continuar? s ou n: ");
            continuar = input.next();
            
            System.out.println(bebidas);

        } while (continuar.toLowerCase().equals("s"));
    }

}
