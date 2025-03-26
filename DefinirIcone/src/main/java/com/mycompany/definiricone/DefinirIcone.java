/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.definiricone;
import javax.swing.*;

/**
 * Classe que define o ícone da janela principal utilizando uma imagem.
 * A imagem do ícone é carregada a partir de um arquivo externo.
 */
public class DefinirIcone extends JFrame {
    
    // Construtor da classe onde a janela é configurada
    public DefinirIcone() {
        // Define o título da janela que aparecerá na barra de título
        super("Como definir o ícone para a janela");
        
        // Carrega a imagem do ícone a partir do arquivo "teste.gif"
        ImageIcon icone = new ImageIcon("teste.gif");
        
        // Define o ícone da janela utilizando a imagem carregada
        setIconImage(icone.getImage());
        
        // Define o tamanho da janela (largura: 300px, altura: 150px)
        setSize(300, 150);
        
        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe DefinirIcone, ou seja, abre a janela
        DefinirIcone app = new DefinirIcone();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

