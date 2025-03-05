/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janelacentralizada;
import javax.swing.*;

/**
 *
 * @author Yo
 */
public class JanelaCentralizada extends JFrame{
    public JanelaCentralizada(){
        super("Janela centralizada");
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        JanelaCentralizada app = new JanelaCentralizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
