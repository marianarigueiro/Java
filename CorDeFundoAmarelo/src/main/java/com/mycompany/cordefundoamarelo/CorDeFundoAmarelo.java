/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cordefundoamarelo;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yo
 */
public class CorDeFundoAmarelo extends JFrame{
    public CorDeFundoAmarelo(){
        super("Cor de fundo amarela");
        Container tela = getContentPane();
        tela.setBackground(Color.yellow);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        CorDeFundoAmarelo app = new CorDeFundoAmarelo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
