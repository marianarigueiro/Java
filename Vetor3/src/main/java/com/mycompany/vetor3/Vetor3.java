/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Yo
 */
public class Vetor3 {

    public static void main(String[] args){ {
       
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];

        // Leitura dos 50 números
        System.out.println("Digite 50 números:");
        for (int i = 0; i < 50; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordenação do vetor
        Arrays.sort(vetor);

        // Exibição do vetor ordenado
        System.out.println("Números em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    }
}
