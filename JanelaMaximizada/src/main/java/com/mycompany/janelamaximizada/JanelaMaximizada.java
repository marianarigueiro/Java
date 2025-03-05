/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janelamaximizada;
import javax.swing.*;

/**
 *
 * @author Yo
 */
public class JanelaMaximizada extends JFrame{
    
    //Aparece na tela inteira
    
    public JanelaMaximizada(){
        super("Como eximir a janela maximizada");
        setSize(300, 150);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        JanelaMaximizada app = new JanelaMaximizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
