/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenarnumerosdecrecentes;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Yo
 */
public class OrdenarNumerosDecrecentes {

    public static void main(String[] args){ {
        
                Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];

        // Leitura dos 50 números
        System.out.println("Digite 50 números:");
        for (int i = 0; i < 50; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordenação do vetor em ordem crescente
        Arrays.sort(vetor);

        // Invertendo o vetor para obter a ordem decrescente
        int[] vetorDecrescente = new int[50];
        for (int i = 0; i < 50; i++) {
            vetorDecrescente[i] = vetor[49 - i];
        }

        // Exibição do vetor ordenado em ordem decrescente
        System.out.println("Números em ordem decrescente:");
        for (int num : vetorDecrescente) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    }
}
