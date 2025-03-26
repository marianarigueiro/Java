/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        Scanner scanner = new Scanner(System.in);

        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha a linha e a coluna (0, 1 ou 2) para jogar:");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            // Verifica se a posição está vazia
            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;

                // Verifica se houve um vencedor
                if (verificarVencedor(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns, jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (tabuleiroCompleto(tabuleiro)) { // Verifica se deu empate
                    exibirTabuleiro(tabuleiro);
                    System.out.println("O jogo terminou em empate!");
                    jogoAtivo = false;
                } else {
                    // Troca o jogador
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição já ocupada. Escolha outra.");
            }
        }
        scanner.close();
    }

    // Função para exibir o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    // Função para verificar se houve um vencedor
    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    // Função para verificar se o tabuleiro está completo (empate)
    public static boolean tabuleiroCompleto(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
}
