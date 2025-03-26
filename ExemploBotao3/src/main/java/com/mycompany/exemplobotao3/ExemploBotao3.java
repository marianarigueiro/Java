/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobotao3;  // Isso define onde o código está localizado dentro do projeto

import java.awt.*;  // Esse comando importa ferramentas para trabalhar com a aparência da janela
import javax.swing.*;  // Importa ferramentas para trabalhar com botões, janelas e outros componentes
import java.awt.event.*;  // Importa ferramentas para trabalhar com eventos (como quando o usuário clica em um botão)

/**
 * Exemplo de uma aplicação com vários botões, cada um com uma cor de fundo diferente.
 * A janela contém botões que podem ser clicados, mas aqui, eles ainda não têm ações atribuídas.
 */
public class ExemploBotao3 extends JFrame {  // Aqui começamos a classe ExemploBotao3 que vai criar a janela com os botões
    
    // Aqui, criamos quatro botões, que serão usados na janela
    JButton botao1, botao2, botao3, botao4;

    // Construtor da classe, onde a janela é criada e configurada
    public ExemploBotao3() {
        super("Exemplo com JButton3");  // Define o título da janela que aparece na parte de cima
        Container tela = getContentPane();  // Pega o conteúdo da janela, para adicionar os botões
        setLayout(null);  // Diz que não queremos usar um layout fixo, vamos colocar os botões em lugares específicos

        // Criamos os botões e colocamos textos neles
        botao1 = new JButton("Procurar");
        botao2 = new JButton("Voltar>>");
        botao3 = new JButton("Próximo>>");
        botao4 = new JButton("Abrir");

        // Agora colocamos cada botão na tela, com uma posição específica e um tamanho determinado
        botao1.setBounds(50, 20, 100, 20);  // Define que o primeiro botão vai ficar no ponto (50, 20) e terá 100 de largura e 20 de altura
        botao2.setBounds(50, 60, 100, 20);  // O segundo botão vai começar no ponto (50, 60) e vai ter 100 de largura e 20 de altura
        botao3.setBounds(50, 100, 100, 20);  // O terceiro botão vai começar no ponto (50, 100) e terá o mesmo tamanho
        botao4.setBounds(50, 140, 100, 20);  // O quarto botão vai começar no ponto (50, 140) e também terá 100x20

        // Agora vamos mudar a cor de fundo de cada botão
        botao1.setBackground(Color.yellow);  // O primeiro botão ficará com o fundo amarelo
        botao2.setBackground(Color.red);  // O segundo botão ficará com o fundo vermelho
        botao3.setBackground(Color.blue);  // O terceiro botão ficará com o fundo azul
        botao4.setBackground(Color.white);  // O quarto botão ficará com o fundo branco

        // Agora adicionamos os botões à tela da janela
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);

        // Definimos o tamanho da janela (400 de largura e 250 de altura)
        setSize(400, 250);

        // Tornamos a janela visível, ou seja, ela aparece na tela para o usuário
        setVisible(true);
    }

    // Função principal que começa o programa
    public static void main(String[] args) {
        ExemploBotao3 app = new ExemploBotao3();  // Aqui criamos o objeto app que vai exibir a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Isso garante que o programa vai fechar quando a janela for fechada
    }
}
