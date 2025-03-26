/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cordefundoamarelo;

import javax.swing.*;
import java.awt.*;

/**
 * Classe que cria uma janela com a cor de fundo alterada para amarelo.
 * A janela será de tamanho pequeno e terá o fundo amarelo.
 */
public class CorDeFundoAmarelo extends JFrame {
    
    // Construtor da classe onde a janela é configurada
    public CorDeFundoAmarelo() {
        // Define o título da janela que aparecerá na barra de título
        super("Cor de fundo amarela");
        
        // Obtém o conteúdo da janela (tela)
        Container tela = getContentPane();
        
        // Define a cor de fundo da janela como amarela
        tela.setBackground(Color.yellow);
        
        // Define o tamanho da janela (largura: 300px, altura: 150px)
        setSize(300, 150);
        
        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe CorDeFundoAmarelo, ou seja, abre a janela
        CorDeFundoAmarelo app = new CorDeFundoAmarelo();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

