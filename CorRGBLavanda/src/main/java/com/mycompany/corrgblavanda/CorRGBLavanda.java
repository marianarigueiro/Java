/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.corrgblavanda;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yo
 */
public class CorRGBLavanda extends JFrame{
    public CorRGBLavanda(){
        super("Cor de fundo lavanda");
        Container tela = getContentPane();
        tela.setBackground(new Color(128,125,150));
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        CorRGBLavanda app = new CorRGBLavanda();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
