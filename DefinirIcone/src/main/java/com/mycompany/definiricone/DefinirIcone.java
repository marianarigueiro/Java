/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.definiricone;
import javax.swing.*;

/**
 *
 * @author Yo
 */
public class DefinirIcone extends JFrame{
    public DefinirIcone(){
        super("Como definir o ícone para a janela");
        ImageIcon icone = new ImageIcon("teste.gif");
        setIconImage(icone.getImage());
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        DefinirIcone app = new DefinirIcone();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
