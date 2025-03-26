/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodecliente;

import javax.swing.*;
import java.awt.*;

/**
 * Classe responsável por criar a interface gráfica de cadastro de clientes.
 * Estende JFrame para criar uma janela e utilizar componentes gráficos.
 */
public class CadastroDeCliente extends JFrame {
    
    // Definindo os rótulos e campos de texto que serão utilizados na interface
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    
    // Construtor da classe, onde a interface é configurada
    public CadastroDeCliente(){
        super("Cadastro de Clientes");  // Define o título da janela
        Container tela = getContentPane();  // Obtém o conteúdo da janela
        setLayout(null);  // Define o layout como nulo para permitir o posicionamento manual
        
        // Inicializando os rótulos (labels) para cada campo
        rotulo1 = new JLabel("Nome: ");
        rotulo2 = new JLabel("CPF: ");
        rotulo3 = new JLabel("RG: ");
        rotulo4 = new JLabel("Endereço: ");
        rotulo5 = new JLabel("Cidade: ");
        rotulo6 = new JLabel("Estado: ");
        rotulo7 = new JLabel("CEP: ");
        
        // Inicializando os campos de texto para entrada de dados
        texto1 = new JTextField(50);  // Para o nome do cliente
        texto2 = new JTextField(11);  // Para o CPF
        texto3 = new JTextField(9);   // Para o RG
        texto4 = new JTextField(50);  // Para o endereço
        texto5 = new JTextField(50);  // Para a cidade
        texto6 = new JTextField(50);  // Para o estado
        texto7 = new JTextField(50);  // Para o CEP
        
        // Definindo a posição e o tamanho dos rótulos e campos de texto na tela
        rotulo1.setBounds(50, 20, 80, 20);
        rotulo2.setBounds(50, 60, 80, 20);
        rotulo3.setBounds(50, 100, 80, 20);
        rotulo4.setBounds(50, 140, 80, 20);
        rotulo5.setBounds(50, 180, 80, 20);
        rotulo6.setBounds(50, 220, 80, 20);
        rotulo7.setBounds(50, 260, 80, 20);
        
        texto1.setBounds(110, 20, 200, 20);
        texto2.setBounds(110, 60, 200, 20);
        texto3.setBounds(110, 100, 200, 20);
        texto4.setBounds(110, 140, 200, 20);
        texto5.setBounds(110, 180, 200, 20);
        texto6.setBounds(110, 220, 200, 20);
        texto7.setBounds(110, 260, 200, 20);
                
        // Adicionando os rótulos e campos de texto à tela (janela)
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        
        // Definindo o tamanho da janela, visibilidade e centralizando-a na tela
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);  // Centraliza a janela na tela
    }

    // Método main para executar a aplicação
    public static void main(String[] args) {
        CadastroDeCliente app = new CadastroDeCliente();  // Cria uma instância da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define o comportamento de fechamento da janela
    }
}

