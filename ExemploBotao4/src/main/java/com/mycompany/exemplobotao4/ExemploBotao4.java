/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobotao4;  // Define onde o código está no projeto, tipo uma pasta onde ele vai morar.

import java.awt.*;  // Importa as ferramentas que vamos usar para mudar o visual da janela.
import javax.swing.*;  // Importa as ferramentas para criar botões e outros componentes gráficos.
import java.awt.event.*;  // Importa as ferramentas que ajudam a lidar com eventos, como quando o usuário clica no botão.

/**
 * Este é o exemplo de como criar botões em uma janela. Além disso, ele mostra como colocar atalhos de teclado para os botões.
 * Cada botão terá uma cor diferente e um atalho de teclado.
 */
public class ExemploBotao4 extends JFrame {  // Início da nossa classe que cria a janela com os botões
    
    // Aqui estamos criando os botões. Cada um vai ter um nome.
    JButton botao1, botao2, botao3, botao4;
    
    // Este é o construtor que vai configurar a janela e os botões.
    public ExemploBotao4() {
        super("Exemplo com JButton4");  // Define o nome que aparece no topo da janela.
        Container tela = getContentPane();  // Obtém a área da janela onde vamos adicionar os botões.
        setLayout(null);  // Diz que vamos posicionar tudo manualmente na tela.

        // Criamos os botões com textos diferentes.
        botao1 = new JButton("Procurar");
        botao2 = new JButton("Voltar>>");
        botao3 = new JButton("Próximo>>");
        botao4 = new JButton("Abrir");

        // Definimos a posição e o tamanho de cada botão (onde eles vão ficar e o tamanho deles).
        botao1.setBounds(50, 20, 100, 20);  // O primeiro botão vai começar no ponto (50, 20) e vai ter 100 de largura e 20 de altura.
        botao2.setBounds(50, 60, 100, 20);  // O segundo botão vai começar no ponto (50, 60) e terá 100x20.
        botao3.setBounds(50, 100, 100, 20);  // O terceiro botão vai para (50, 100), também com 100x20.
        botao4.setBounds(50, 140, 100, 20);  // O quarto botão vai para (50, 140), igualmente 100x20.

        // Agora, damos cores para cada botão.
        botao1.setBackground(Color.yellow);  // O primeiro botão vai ser amarelo.
        botao2.setBackground(Color.red);  // O segundo botão vai ser vermelho.
        botao3.setBackground(Color.blue);  // O terceiro botão vai ser azul.
        botao4.setBackground(Color.white);  // O quarto botão vai ser branco.

        // Aqui, configuramos os atalhos de teclado (mnemônicos) para cada botão.
        botao1.setMnemonic(KeyEvent.VK_P);  // O atalho do botão "Procurar" será a tecla "P".
        botao2.setMnemonic(KeyEvent.VK_V);  // O atalho do botão "Voltar" será a tecla "V".
        botao3.setMnemonic(KeyEvent.VK_X);  // O atalho do botão "Próximo" será a tecla "X".
        botao4.setMnemonic(KeyEvent.VK_S);  // O atalho do botão "Abrir" será a tecla "S".

        // Adicionamos todos os botões à janela.
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);

        // Define o tamanho da janela (largura de 400px e altura de 250px).
        setSize(400, 250);

        // Torna a janela visível para que o usuário possa ver.
        setVisible(true);
    }

    // Função principal que inicia o programa.
    public static void main(String[] args) {
        ExemploBotao4 app = new ExemploBotao4();  // Cria a janela com os botões.
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha o programa quando a janela for fechada.
    }
}
