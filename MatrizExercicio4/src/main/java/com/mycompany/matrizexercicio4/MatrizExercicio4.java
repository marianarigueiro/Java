/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizexercicio4;

/**
 *
 * @author Yo
 */
public class MatrizExercicio4 {

    public static void main(String[] args) {
         // Criando e preenchendo a matriz 4x4
        double[][] matriz = {
            {1.1, 2.2, 3.3, 4.4},
            {5.5, 6.6, 7.7, 8.8},
            {9.9, 10.1, 11.2, 12.3},
            {13.4, 14.5, 15.6, 16.7}
        };

        // Exibindo a diagonal principal
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // Exibindo a diagonal secundária
        System.out.println("Diagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
        }
        System.out.println();
    }
}
