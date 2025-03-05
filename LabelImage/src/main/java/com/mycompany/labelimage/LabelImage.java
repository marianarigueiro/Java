/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labelimage;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yo
 */
public class LabelImage extends JFrame{
    
    JLabel imagem;
    
    public LabelImage(){
        super("Uso da classe JLabel com Imagem");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("logo_java.gif");
        imagem = new JLabel(icone);
        tela.add(imagem);
        setSize(500, 460);
        setVisible(true);
    }

    public static void main(String[] args) {
        LabelImage app = new LabelImage();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
