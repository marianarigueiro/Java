package com.mycompany.calculadorajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJava extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, resto, dobro, quadrado, cubo, raiz;
    
    public CalculadoraJava() {
        super("Calculadora Java");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("1º Número:");
        rotulo2 = new JLabel("2º Número:");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        
        somar = new JButton("+");
        subtrair = new JButton("-");
        multiplicar = new JButton("*");
        dividir = new JButton("/");
        resto = new JButton("%");
        dobro = new JButton("Dobro");
        quadrado = new JButton("x²");
        cubo = new JButton("x³");
        raiz = new JButton("√");
        
        rotulo1.setBounds(30, 20, 100, 20);
        rotulo2.setBounds(30, 50, 100, 20);
        texto1.setBounds(120, 20, 100, 20);
        texto2.setBounds(120, 50, 100, 20);
        
        somar.setBounds(30, 80, 50, 30);
        subtrair.setBounds(90, 80, 50, 30);
        multiplicar.setBounds(150, 80, 50, 30);
        dividir.setBounds(210, 80, 50, 30);
        resto.setBounds(270, 80, 50, 30);
        
        dobro.setBounds(30, 120, 80, 30);
        quadrado.setBounds(120, 120, 80, 30);
        cubo.setBounds(210, 120, 80, 30);
        raiz.setBounds(300, 120, 80, 30);
        
        exibir.setBounds(30, 160, 350, 20);
        exibir.setVisible(false);
        
        ActionListener operacao = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(texto1.getText());
                    double num2 = Double.parseDouble(texto2.getText()); // Removido o isEnabled
                    double resultado = 0;
                    
                    if (e.getSource() == somar) resultado = num1 + num2;
                    if (e.getSource() == subtrair) resultado = num1 - num2;
                    if (e.getSource() == multiplicar) resultado = num1 * num2;
                    if (e.getSource() == dividir) resultado = num2 != 0 ? num1 / num2 : Double.NaN;
                    if (e.getSource() == resto) resultado = num2 != 0 ? num1 % num2 : Double.NaN;
                    if (e.getSource() == dobro) resultado = num1 * 2;
                    if (e.getSource() == quadrado) resultado = Math.pow(num1, 2);
                    if (e.getSource() == cubo) resultado = Math.pow(num1, 3);
                    if (e.getSource() == raiz) resultado = Math.sqrt(num1);
                    
                    exibir.setText("Resultado: " + resultado);
                    exibir.setVisible(true);
                } catch (NumberFormatException ex) {
                    exibir.setText("Erro: Insira números válidos!");
                    exibir.setVisible(true);
                }
            }
        };
        
        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);
        resto.addActionListener(operacao);
        dobro.addActionListener(operacao);
        quadrado.addActionListener(operacao);
        cubo.addActionListener(operacao);
        raiz.addActionListener(operacao);
        
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
        
        setSize(420, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        CalculadoraJava calculadoraJava = new CalculadoraJava();
    }
}
