/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade03 {
    private static final char VAZIO = ' ';
    private static final char JOGADOR = 'X';
    private static final char COMPUTADOR = 'O';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {
        boolean jogarNovamente;

        //Estrutra de repetição para escolher a dificuldade
        do {
            iniciarTabuleiro();
            System.out.println("Escolha o nível de dificuldade:");
            System.out.println("1. Normal");
            System.out.println("2. Difícil");
            System.out.print("Sua escolha: ");
            int opcao = scanner.nextInt();

            boolean fimDeJogo = false;
            char vencedor = VAZIO;

            while (!fimDeJogo) {
                imprimirTabuleiro();
                Jogador();
                vencedor = verificarVencedor();
                if (vencedor != VAZIO || Empate())
                    break;

                if (opcao == 1) {
                    jogadaAleatoria();
                } else {
                    JogadaDificil();
                }

                vencedor = verificarVencedor();
                if (vencedor != VAZIO || Empate())
                    break;
            }

            imprimirTabuleiro();
            exibirResultado(vencedor);

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.next().toLowerCase().charAt(0) == 's';
        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");
    }

    // Inicializa o tabuleiro vazio
    private static void iniciarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    // Imprime o tabuleiro
    private static void imprimirTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2)
                    System.out.print("|");
            }
            System.out.println();
            if (i < 2)
                System.out.println("  -----");
        }
    }

    // Jogada do jogador
    private static void Jogador() {
        int linha, coluna;
        do {
            System.out.print("Digite a linha e a coluna (ex: 1 1): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
        } while (!posicaoValida(linha, coluna));
        tabuleiro[linha][coluna] = JOGADOR;
    }

    // Verifica se a posição é válida e está vazia
    private static boolean posicaoValida(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == VAZIO;
    }

    // Jogada aleatória para o modo normal
    private static void jogadaAleatoria() {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!posicaoValida(linha, coluna));
        tabuleiro[linha][coluna] = COMPUTADOR;
    }

    // Jogada otimizada usando o algoritmo Minimax
    private static void JogadaDificil() {
        int melhorValor = Integer.MIN_VALUE;
        int melhorLinha = -1, melhorColuna = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = COMPUTADOR;
                    int valor = minimax(false);
                    tabuleiro[i][j] = VAZIO;
                    if (valor > melhorValor) {
                        melhorValor = valor;
                        melhorLinha = i;
                        melhorColuna = j;
                    }
                }
            }
        }
        tabuleiro[melhorLinha][melhorColuna] = COMPUTADOR;
    }

    // Algoritmo Minimax
    private static int minimax(boolean isMaximizando) {
        char vencedor = verificarVencedor();
        if (vencedor == COMPUTADOR)
            return 1;
        if (vencedor == JOGADOR)
            return -1;
        if (Empate())
            return 0;

        if (isMaximizando) {
            int melhorValor = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == VAZIO) {
                        tabuleiro[i][j] = COMPUTADOR;
                        melhorValor = Math.max(melhorValor, minimax(false));
                        tabuleiro[i][j] = VAZIO;
                    }
                }
            }
            return melhorValor;
        } else {
            int melhorValor = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == VAZIO) {
                        tabuleiro[i][j] = JOGADOR;
                        melhorValor = Math.min(melhorValor, minimax(true));
                        tabuleiro[i][j] = VAZIO;
                    }
                }
            }
            return melhorValor;
        }
    }

    // Verifica se há um vencedor
    private static char verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != VAZIO)
                return tabuleiro[i][0];
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != VAZIO)
                return tabuleiro[0][i];
        }
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != VAZIO)
            return tabuleiro[0][0];
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != VAZIO)
            return tabuleiro[0][2];
        return VAZIO;
    }

    // Verifica se o jogo empatou
    private static boolean Empate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO)
                    return false;
            }
        }
        return true;
    }

    // Exibe o resultado do jogo
    private static void exibirResultado(char vencedor) {
        if (vencedor == JOGADOR) {
            System.out.println("Parabéns! Você venceu!");
        } else if (vencedor == COMPUTADOR) {
            System.out.println("Você perdeu! O computador venceu.");
        } else {
            System.out.println("O jogo empatou!");
        }
    }
}

