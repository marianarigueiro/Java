package com.mycompany.calculadora;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int opcao;  // Variável para armazenar a opção escolhida pelo usuário

        do {
            // Menu de opções que será exibido para o usuário
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

            // Exibe o menu e captura a opção escolhida
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Verifica se a opção está entre 1 e 5 (operações com dois números)
            if (opcao >= 1 && opcao <= 5) {
                // Solicita os dois números para o usuário
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                // Exibe o resultado da operação escolhida
                JOptionPane.showMessageDialog(null, "Resultado: " + calcular(opcao, num1, num2));
            }
            // Verifica se a opção está entre 6 e 9 (operações com um único número)
            else if (opcao >= 6 && opcao <= 9) {
                // Solicita um único número para o usuário
                double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
                // Exibe o resultado da operação escolhida
                JOptionPane.showMessageDialog(null, "Resultado: " + calcular(opcao, num, 0));
            }
            // Se a opção for diferente de 0 e inválida
            else if (opcao != 0) {
                // Exibe uma mensagem de erro se a opção for inválida
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 0);  // Continua o loop até que o usuário escolha a opção 0 para sair

        // Exibe uma mensagem quando o programa é encerrado
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }

    // Função que realiza os cálculos conforme a opção escolhida
    public static double calcular(int opcao, double num1, double num2) {
        return switch (opcao) {
            case 1 -> num1 + num2;  // Soma
            case 2 -> num1 - num2;  // Subtração
            case 3 -> (num2 != 0) ? num1 / num2 : Double.NaN;  // Divisão (verifica se o divisor não é 0)
            case 4 -> num1 * num2;  // Multiplicação
            case 5 -> num1 % num2;  // Resto da divisão
            case 6 -> num1 * 2;     // Dobro do número
            case 7 -> num1 * num1;  // Quadrado do número
            case 8 -> num1 * num1 * num1;  // Cubo do número
            case 9 -> (num1 >= 0) ? Math.sqrt(num1) : Double.NaN;  // Raiz quadrada (verifica se o número é não negativo)
            default -> Double.NaN;  // Se a opção for inválida, retorna NaN
        };
    }
}
