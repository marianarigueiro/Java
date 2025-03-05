/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.corrgbrosa;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yo
 */
public class CorRGBRosa extends JFrame{
    public CorRGBRosa(){
        super("Cor de fundo rosa");
        Container tela = getContentPane();
        tela.setBackground(new Color(255,128,128));
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        CorRGBRosa app = new CorRGBRosa();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
