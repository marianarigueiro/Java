/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplolabel;  // Define onde o código está no projeto, como uma pasta no seu computador.

import javax.swing.*;  // Importa as ferramentas para criar janelas, botões e outros componentes gráficos
import java.awt.*;  // Importa as ferramentas para trabalhar com as características visuais, como cores e fontes

/**
 * Exemplo de uma janela com rótulos (labels) que possuem cores e fontes diferentes.
 * Os rótulos são usados para mostrar texto informativo para o usuário.
 */
public class ExemploLabel extends JFrame {  // Início da classe que vai criar a janela com os rótulos
    
    // Aqui estamos criando os rótulos (labels) que vão mostrar texto na janela
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    
    // Construtor da classe, onde a janela e seus componentes são configurados
    public ExemploLabel() {
        super("Exemplo com Label");  // Define o título da janela que aparecerá na parte de cima
        Container tela = getContentPane();  // Obtém a área da janela onde vamos colocar os rótulos
        setLayout(null);  // Diz que vamos organizar os componentes manualmente (sem usar layout fixo)
        
        // Criamos os rótulos com textos explicativos para o usuário
        rotulo1 = new JLabel("Nome: ");
        rotulo2 = new JLabel("Idade: ");
        rotulo3 = new JLabel("Telefone: ");
        rotulo4 = new JLabel("Celular: ");
        
        // Agora, definimos onde cada rótulo vai ficar na janela (posição e tamanho)
        rotulo1.setBounds(50, 20, 80, 20);  // Define que o primeiro rótulo vai para a posição (50, 20) e tem 80x20 pixels
        rotulo2.setBounds(50, 60, 80, 20);  // O segundo rótulo vai para a posição (50, 60) e também tem 80x20 pixels
        rotulo3.setBounds(50, 100, 80, 20); // O terceiro rótulo vai para (50, 100)
        rotulo4.setBounds(50, 140, 80, 20); // O quarto rótulo vai para (50, 140)
        
        // Agora, damos uma cor para cada rótulo para deixá-los diferentes
        rotulo1.setForeground(Color.red);  // O primeiro rótulo ficará vermelho
        rotulo2.setForeground(Color.blue);  // O segundo rótulo ficará azul
        rotulo3.setForeground(new Color(190, 152, 142));  // O terceiro rótulo terá uma cor personalizada (bege claro)
        rotulo4.setForeground(new Color(201, 200, 100));  // O quarto rótulo terá uma cor personalizada (amarelo esverdeado)
        
        // Também podemos mudar a fonte (o estilo de texto) de cada rótulo
        rotulo1.setFont(new Font("Arial", Font.BOLD, 14));  // O primeiro rótulo vai usar a fonte Arial, negrito, tamanho 14
        rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));  // O segundo rótulo vai usar Comic Sans MS, negrito, tamanho 16
        rotulo3.setFont(new Font("Courier New", Font.BOLD, 18));  // O terceiro rótulo vai usar Courier New, negrito, tamanho 18
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD, 20));  // O quarto rótulo vai usar Times New Roman, negrito, tamanho 20
        
        // Agora, adicionamos todos os rótulos à tela (janela)
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        // Define o tamanho da janela (largura de 400px e altura de 250px)
        setSize(400, 250);
        
        // Torna a janela visível para o usuário
        setVisible(true);
        
        // Coloca a janela no centro da tela
        setLocationRelativeTo(null);
    }

    // Função principal que inicia o programa
    public static void main(String[] args) {
        ExemploLabel app = new ExemploLabel();  // Cria a janela com os rótulos
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define que o programa deve fechar quando a janela for fechada
    }
}
