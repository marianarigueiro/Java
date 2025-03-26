/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cordefundo;

import javax.swing.*;
import java.awt.*;

/**
 * Classe que cria uma janela com cor de fundo modificada.
 * A janela será de tamanho pequeno e terá o fundo azul.
 */
public class CorDeFundo extends JFrame {
    
    // Construtor da classe, onde a janela é configurada
    public CorDeFundo() {
        // Define o título da janela que aparecerá na barra de título
        super("Definindo a cor de fundo para a janela");
        
        // Obtém o conteúdo da janela (tela)
        Container tela = getContentPane();
        
        // Define a cor de fundo da janela como azul
        tela.setBackground(Color.blue);
        
        // Define o tamanho da janela (largura: 300px, altura: 150px)
        setSize(300, 150);
        
        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe CorDeFundo, ou seja, abre a janela
        CorDeFundo app = new CorDeFundo();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
