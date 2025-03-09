package com.mycompany.calculadora;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int opcao;
        
        do {
            String menu = """
                Escolha uma opção:
                1 - Soma
                2 - Subtração
                3 - Divisão
                4 - Multiplicação
                5 - Resto da Divisão
                6 - Dobro
                7 - Quadrado
                8 - Cubo
                9 - Raiz Quadrada
                0 - Sair
                """;

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao >= 1 && opcao <= 5) {
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + calcular(opcao, num1, num2));
            } else if (opcao >= 6 && opcao <= 9) {
                double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                JOptionPane.showMessageDialog(null, "Resultado: " + calcular(opcao, num, 0));
            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 0);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }

    public static double calcular(int opcao, double num1, double num2) {
        return switch (opcao) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> (num2 != 0) ? num1 / num2 : Double.NaN;
            case 4 -> num1 * num2;
            case 5 -> num1 % num2;
            case 6 -> num1 * 2;
            case 7 -> num1 * num1;
            case 8 -> num1 * num1 * num1;
            case 9 -> (num1 >= 0) ? Math.sqrt(num1) : Double.NaN;
            default -> Double.NaN;
        };
    }
}