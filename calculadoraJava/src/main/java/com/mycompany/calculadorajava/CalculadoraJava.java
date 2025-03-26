package com.mycompany.calculadorajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJava extends JFrame {
    // Essas são as "etiquetas" ou "rótulos" que mostram o nome dos campos na tela.
    JLabel rotulo1, rotulo2, exibir;
    
    // Esses são os campos onde o usuário vai digitar os números.
    JTextField texto1, texto2;
    
    // Esses são os botões que o usuário vai clicar para fazer as operações.
    JButton somar, subtrair, multiplicar, dividir, resto, dobro, quadrado, cubo, raiz;
    
    // Este é o construtor da calculadora, onde tudo é configurado.
    public CalculadoraJava() {
        super("Calculadora Java"); // Aqui o nome da calculadora aparece na tela.
        Container tela = getContentPane(); // Esse comando prepara a tela.
        setLayout(null); // Aqui não estamos usando layout automático, vamos arranjar tudo manualmente.
        
        // Definindo os rótulos com as palavras que indicam o que o usuário deve digitar.
        rotulo1 = new JLabel("1º Número:");
        rotulo2 = new JLabel("2º Número:");
        
        // Criando os campos de texto onde o usuário digita os números.
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        // Esse é o lugar onde vamos mostrar o resultado.
        exibir = new JLabel("");
        
        // Criando os botões para as operações matemáticas.
        somar = new JButton("+");
        subtrair = new JButton("-");
        multiplicar = new JButton("*");
        dividir = new JButton("/");
        resto = new JButton("%");
        dobro = new JButton("Dobro");
        quadrado = new JButton("x²");
        cubo = new JButton("x³");
        raiz = new JButton("√");
        
        // Agora colocamos todos os botões e rótulos na tela, ajustando onde eles vão ficar.
        rotulo1.setBounds(30, 20, 100, 20);
        rotulo2.setBounds(30, 50, 100, 20);
        texto1.setBounds(120, 20, 100, 20);
        texto2.setBounds(120, 50, 100, 20);
        
        // Organizando os botões.
        somar.setBounds(30, 80, 50, 30);
        subtrair.setBounds(90, 80, 50, 30);
        multiplicar.setBounds(150, 80, 50, 30);
        dividir.setBounds(210, 80, 50, 30);
        resto.setBounds(270, 80, 50, 30);
        
        dobro.setBounds(30, 120, 80, 30);
        quadrado.setBounds(120, 120, 80, 30);
        cubo.setBounds(210, 120, 80, 30);
        raiz.setBounds(300, 120, 80, 30);
        
        // Exibir vai mostrar o resultado na tela.
        exibir.setBounds(30, 160, 350, 20);
        exibir.setVisible(false); // Começa escondido até o resultado aparecer.
        
        // Aqui temos uma ação que vai acontecer quando o usuário clicar em qualquer botão.
        ActionListener operacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Pega os números que o usuário digitou.
                    double num1 = Double.parseDouble(texto1.getText());
                    double num2 = Double.parseDouble(texto2.getText());
                    double resultado = 0; // Aqui guardamos o resultado da operação.
                    
                    // Verifica qual operação o usuário escolheu.
                    if (e.getSource() == somar) resultado = num1 + num2;  // Soma
                    if (e.getSource() == subtrair) resultado = num1 - num2;  // Subtração
                    if (e.getSource() == multiplicar) resultado = num1 * num2;  // Multiplicação
                    if (e.getSource() == dividir) resultado = num2 != 0 ? num1 / num2 : Double.NaN;  // Divisão
                    if (e.getSource() == resto) resultado = num2 != 0 ? num1 % num2 : Double.NaN;  // Resto
                    if (e.getSource() == dobro) resultado = num1 * 2;  // Dobro
                    if (e.getSource() == quadrado) resultado = Math.pow(num1, 2);  // Quadrado
                    if (e.getSource() == cubo) resultado = Math.pow(num1, 3);  // Cubo
                    if (e.getSource() == raiz) resultado = Math.sqrt(num1);  // Raiz quadrada
                    
                    // Exibe o resultado na tela.
                    exibir.setText("Resultado: " + resultado);
                    exibir.setVisible(true); // Faz o resultado aparecer.
                } catch (NumberFormatException ex) {
                    // Se o usuário digitar algo errado, mostra um erro.
                    exibir.setText("Erro: Insira números válidos!");
                    exibir.setVisible(true); // Faz a mensagem de erro aparecer.
                }
            }
        };
        
        // Ligando os botões com a ação que vai acontecer quando forem clicados.
        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);
        resto.addActionListener(operacao);
        dobro.addActionListener(operacao);
        quadrado.addActionListener(operacao);
        cubo.addActionListener(operacao);
        raiz.addActionListener(operacao);
        
        // Adicionando tudo na tela.
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(resto);
        tela.add(dobro);
        tela.add(quadrado);
        tela.add(cubo);
        tela.add(raiz);
        tela.add(exibir);
        
        // Definindo o tamanho da janela e outras configurações.
        setSize(420, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela.
        setVisible(true); // Faz a janela aparecer na tela.
    }
    
    public static void main(String[] args) {
        // Criando a calculadora e fazendo ela aparecer na tela.
        CalculadoraJava calculadoraJava = new CalculadoraJava();
    }
}

