/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_8;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Yo
 */
public class Exemplo_8 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        double[][] matriz = {{4.5,5.2},{4.2,1}};
        int x,y;
        JOptionPane.showMessageDialog(null, "****** Imprimindo a matriz ******");
        
        //exibição dos valores na matriz
        for (x = 0; x < 2; x++);
        {
            for (y = 0; y < 2; y++);
            {
              System.out.println("mat["+x+"]["+y+"] = "+matriz[x][y]+"");
            }// fim do for da coluna (y)
        }// fim do for da linha (x)
    }
}
