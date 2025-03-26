/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobotao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Exemplo de uma aplicação com um botão que possui uma imagem como ícone.
 * Ao clicar no botão, podemos configurar ações adicionais, caso necessário.
 */
public class ExemploBotao extends JFrame {
    
    // Declaração do botão e do ícone
    JButton botao;
    ImageIcon icone;
    
    // Construtor da classe, onde a interface é configurada
    public ExemploBotao() {
        super("Exemplo com JButton");  // Define o título da janela

        Container tela = getContentPane();  // Obtém o conteúdo da janela
        setLayout(null);  // Utiliza layout nulo, para posicionar os componentes manualmente
        
        // Carrega o ícone a partir do arquivo "abrir.gif"
        icone = new ImageIcon("abrir.gif");
        
        // Cria o botão com o ícone carregado
        botao = new JButton(icone);
        
        // Define as posições e o tamanho do botão
        botao.setBounds(50, 20, 100, 20);
        
        // Adiciona o botão à tela da janela
        tela.add(botao);
        
        // Define o tamanho da janela (largura: 400px, altura: 250px)
        setSize(400, 250);
        
        // Torna a janela visível
        setVisible(true);
        
        // Posiciona a janela no centro da tela
        setLocationRelativeTo(null);
    }

    // Função main para executar o programa
    public static void main(String[] args) {
        // Cria uma instância da classe ExemploBotao (abre a janela)
        ExemploBotao app = new ExemploBotao();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

