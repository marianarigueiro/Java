/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.namesordenados;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Yo
 */
public class NamesOrdenados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[15];
        // Leitura dos nomes
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

                // Ordenar os nomes em ordem crescente
        Arrays.sort(nomes);
        
                System.out.println("\nNomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
                scanner.close();


    }
}
