/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.corrgblavanda;
import javax.swing.*;
import java.awt.*;

/**
 * Classe que cria uma janela com a cor de fundo alterada para lavanda.
 * A cor lavanda é representada no modelo RGB (128, 125, 150).
 */
public class CorRGBLavanda extends JFrame {
    
    // Construtor da classe onde a janela é configurada
    public CorRGBLavanda() {
        // Define o título da janela que aparecerá na barra de título
        super("Cor de fundo lavanda");
        
        // Obtém o conteúdo da janela (tela)
        Container tela = getContentPane();
        
        // Define a cor de fundo da janela utilizando o modelo RGB (128, 125, 150)
        // Isso resulta em uma cor lavanda suave.
        tela.setBackground(new Color(128, 125, 150));
        
        // Define o tamanho da janela (largura: 300px, altura: 150px)
        setSize(300, 150);
        
        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe CorRGBLavanda, ou seja, abre a janela
        CorRGBLavanda app = new CorRGBLavanda();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

