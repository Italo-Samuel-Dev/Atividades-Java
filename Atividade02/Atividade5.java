<<<<<<< HEAD
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        // Funcao para gerar um numero aleatorio
        Random rnd = new Random();
        int x = rnd.nextInt(11);
        int num;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um numero entre 0 e 10: ");
            num = scanner.nextInt();

            while (num < 0 || num > 10) {
                System.out.println("Número inválido! Digite um número entre 0 e 10: ");
                num = scanner.nextInt();
            }
            if (num > x) {
                System.out.println("O numero é menor.");
            } else if (num < x) {
                System.out.println("O numero é maior.");
            }
            // Laço de repetição para verificar a condição a baixo
        } while (num != x);

        System.out.println("Parabens! voce acertou!");
        scanner.close();
    }
}
=======
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Random;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        // Funcao para gerar um numero aleatorio
        Random rnd = new Random();
        int x = rnd.nextInt(11);
        int num;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um numero entre 0 e 10: ");
            num = scanner.nextInt();

            while (num < 0 || num > 10) {
                System.out.println("Número inválido! Digite um número entre 0 e 10: ");
                num = scanner.nextInt();
            }
            if (num > x) {
                System.out.println("O numero é menor.");
            } else if (num < x) {
                System.out.println("O numero é maior.");
            }
            // Laço de repetição para verificar a condição a baixo
        } while (num != x);

        System.out.println("Parabens! voce acertou!");
        scanner.close();
    }
}
>>>>>>> c6bd33984219ad7e2b7dc03960e072b98a542e08
