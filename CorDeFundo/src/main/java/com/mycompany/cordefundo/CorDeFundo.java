/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cordefundo;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yo
 */
public class CorDeFundo extends JFrame{
    public CorDeFundo(){
            super("Definindo a cor de fundo para a janela");
            Container tela = getContentPane();
            tela.setBackground(Color.blue);
            setSize(300, 150);
            setVisible(true);
        }

    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        
}
