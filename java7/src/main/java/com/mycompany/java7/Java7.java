/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java7;

/**
 *
 * @author Yo
 */
import javax.swing.JOptionPane;

public class Java7 {

    public static void main(String[] args) {
        final int N_Lin = 3;  N_Col = 3;// final para definir constante
        int[][] mat = new int [N_Lin] [N_Col];
        int l,c:

JOptionPane.showMessageDialog(null, "** Cadastrando dados na matriz **\n Entre com o valor em cada posição da matriz");

//atribuição dos valores na matriz for (1;1< N Lin; 1++)
for (l = 0; l < N_Lin; l++)
{
    for (c = 0; c < N_Col; c++)
    {
        mat[1][c]=Integer.parseInt(JOptionPane.showInputDialog("Valor linha "+(l+l)"coluna"+(c+l)+"::"));
    }
}
    }
}
