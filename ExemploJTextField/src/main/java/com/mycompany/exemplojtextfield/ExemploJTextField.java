/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojtextfield;  // Define onde o código está localizado dentro do projeto

import javax.swing.*;  // Importa as ferramentas que vamos usar para criar a interface gráfica, como janelas e botões
import java.awt.*;  // Importa as ferramentas para trabalhar com o layout da janela

/**
 * Este exemplo mostra como usar JTextField para criar campos onde o usuário pode digitar texto.
 * Cada campo de texto tem um nome ao lado para informar o que o usuário deve digitar.
 */
public class ExemploJTextField extends JFrame {  // Início da nossa classe que vai criar a janela
    
    // Aqui, estamos criando rótulos (labels) e campos de texto (text fields) para nossa janela.
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;  // Rótulos para os campos
    JTextField texto1, texto2, texto3, texto4;  // Campos onde o usuário pode digitar o texto
    
    // Construtor da classe, onde a janela e seus componentes são configurados
    public ExemploJTextField() {
        super("Exemplo com JTextField");  // Define o título da janela
        Container tela = getContentPane();  // Obtém a área da janela onde vamos colocar os componentes
        setLayout(null);  // Diz que vamos organizar os componentes manualmente, sem usar um layout pré-definido
        
        // Criamos os rótulos com textos explicativos para os campos
        rotulo1 = new JLabel("Nome: ");
        rotulo2 = new JLabel("Idade: ");
        rotulo3 = new JLabel("Telefone: ");
        rotulo4 = new JLabel("Celular: ");
        
        // Criamos os campos de texto onde o usuário vai digitar
        texto1 = new JTextField(50);  // O primeiro campo pode ter até 50 caracteres
        texto2 = new JTextField(3);   // O segundo campo tem 3 caracteres
        texto3 = new JTextField(10);  // O terceiro campo tem 10 caracteres
        texto4 = new JTextField(10);  // O quarto campo também tem 10 caracteres
        
        // Agora, definimos onde cada rótulo e campo de texto vão aparecer na tela
        rotulo1.setBounds(50, 20, 80, 20);  // O primeiro rótulo vai para a posição (50, 20) e vai ter 80x20 pixels
        rotulo2.setBounds(50, 60, 80, 20);  // O segundo rótulo vai para (50, 60) e terá o mesmo tamanho
        rotulo3.setBounds(50, 100, 80, 20); // O terceiro rótulo vai para (50, 100)
        rotulo4.setBounds(50, 140, 80, 20); // O quarto rótulo vai para (50, 140)
        
        texto1.setBounds(110, 20, 200, 20);  // O primeiro campo de texto vai para a posição (110, 20) e vai ter 200x20 pixels
        texto2.setBounds(110, 60, 20, 20);   // O segundo campo de texto vai para (110, 60) com 20x20 pixels
        texto3.setBounds(110, 100, 80, 20);  // O terceiro campo vai para (110, 100) com 80x20 pixels
        texto4.setBounds(110, 140, 80, 20);  // O quarto campo vai para (110, 140)
        
        // Agora, adicionamos os rótulos e campos de texto na tela (janela)
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        // Define o tamanho da janela, 400 pixels de largura e 250 pixels de altura
        setSize(400, 250);
        
        // Torna a janela visível para o usuário
        setVisible(true);
        
        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);
    }

    // Função principal para iniciar o programa
    public static void main(String[] args) {
        ExemploJTextField app = new ExemploJTextField();  // Cria a janela com os campos
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define que o programa deve fechar quando a janela for fechada
    }
}

