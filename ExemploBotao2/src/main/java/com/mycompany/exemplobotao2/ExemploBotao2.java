/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobotao2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Exemplo de uma aplicação com vários botões utilizando o JButton.
 * Cada botão tem um texto e pode ser configurado para realizar uma ação, 
 * mas neste exemplo, eles ainda não possuem ações atribuídas.
 */
public class ExemploBotao2 extends JFrame {
    
    // Declaração dos botões que aparecerão na interface
    JButton botao1, botao2, botao3, botao4;
    
    // Construtor da classe, onde a interface gráfica é configurada
    public ExemploBotao2() {
        super("Exemplo com JButton2");  // Define o título da janela
        
        // Obtém o conteúdo da janela (tela) e prepara para adicionar os componentes
        Container tela = getContentPane();
        
        // Define o layout como nulo para poder posicionar os componentes manualmente
        setLayout(null);
        
        // Criação dos botões com texto
        botao1 = new JButton("Procurar");
        botao2 = new JButton("Voltar>>");
        botao3 = new JButton("Próximo>>");
        botao4 = new JButton("Abrir");
        
        // Define a posição e tamanho de cada botão
        botao1.setBounds(50, 20, 100, 20);
        botao2.setBounds(50, 60, 100, 20);
        botao3.setBounds(50, 100, 100, 20);
        botao4.setBounds(50, 140, 100, 20);
        
        // Adiciona os botões à tela (janela)
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        
        // Define o tamanho da janela (largura: 400px, altura: 250px)
        setSize(400, 250);
        
        // Torna a janela visível
        setVisible(true);
    }

    // Função main para executar o programa
    public static void main(String[] args) {
        // Cria uma instância da classe ExemploBotao2 (abre a janela)
        ExemploBotao2 app = new ExemploBotao2();
        
        // Define que o programa deve fechar quando a janela for fechada
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
