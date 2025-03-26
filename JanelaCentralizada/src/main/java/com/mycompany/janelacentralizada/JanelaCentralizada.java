/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janelacentralizada;  // Define onde o código está localizado no projeto, como uma pasta dentro do projeto

import javax.swing.*;  // Importa as ferramentas para criar a interface gráfica da janela

/**
 * A classe JanelaCentralizada cria uma janela e a posiciona no centro da tela do computador.
 * A janela terá o título "Janela centralizada" e tamanho de 300x150 pixels.
 */
public class JanelaCentralizada extends JFrame {  // Início da classe JanelaCentralizada, que herda as funcionalidades da classe JFrame (janela)
    
    // Construtor da classe, onde a janela é configurada
    public JanelaCentralizada() {
        super("Janela centralizada");  // Define o título que aparecerá na parte superior da janela
        setSize(300, 150);  // Define o tamanho da janela, com 300px de largura e 150px de altura
        setVisible(true);  // Torna a janela visível para o usuário
        setLocationRelativeTo(null);  // Posiciona a janela no centro da tela, independentemente do tamanho da tela
    }

    // Função principal, onde o programa começa
    public static void main(String[] args) {
        JanelaCentralizada app = new JanelaCentralizada();  // Cria uma instância da classe JanelaCentralizada, ou seja, abre a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define que o programa será fechado quando a janela for fechada
    }
}
