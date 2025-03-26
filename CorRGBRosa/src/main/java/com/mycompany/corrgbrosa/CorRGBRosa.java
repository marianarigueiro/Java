/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.corrgbrosa;
import javax.swing.*;
import java.awt.*;

/**
 * Classe que cria uma janela com a cor de fundo alterada para rosa.
 * A cor rosa é representada no modelo RGB (255, 128, 128).
 */
public class CorRGBRosa extends JFrame {
    
    // Construtor da classe onde a janela é configurada
    public CorRGBRosa() {
        // Define o título da janela que aparecerá na barra de título
        super("Cor de fundo rosa");
        
        // Obtém o conteúdo da janela (tela)
        Container tela = getContentPane();
        
        // Define a cor de fundo da janela utilizando o modelo RGB (255, 128, 128)
        // Isso resulta em uma cor rosa suave.
        tela.setBackground(new Color(255, 128, 128));
        
        // Define o tamanho da janela (largura: 300px, altura: 150px)
        setSize(300, 150);
        
        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe CorRGBRosa, ou seja, abre a janela
        CorRGBRosa app = new CorRGBRosa();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

