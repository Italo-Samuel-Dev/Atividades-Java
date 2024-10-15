<<<<<<< HEAD
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        // Laço de repetição para receber uma nota valida e retornar o conceito com base na nota informada
        do {
            System.out.println("Digite sua nota: ");
            nota = scanner.nextDouble();
            if (nota <= 0 || nota >= 100) {
                System.out.println("Número inválido. Por favor, digite um número entre 0 e 100.");
            }
        } while (nota <= 0 || nota >= 100);

        if (nota > 90) {
            System.out.println("Nota A!! Parabens continue assim!");
        } else if (nota >= 80) {
            System.out.println("Nota B!! Voce esta quase la, mais um pouco e voce consegue!");
        } else if (nota >= 70) {
            System.out.println("Nota C!! Estude um pouco mais.");
        } else if (nota >= 60) {
            System.out.println("Nota D!! Foi por pouco, tenha mais atenção durante as aulas");
        } else {
            System.out.println("Nota E!! Reprovado.");
        }
        scanner.close();
    }
=======
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        // Laço de repetição para receber uma nota valida e retornar o conceito com base na nota informada
        do {
            System.out.println("Digite sua nota: ");
            nota = scanner.nextDouble();
            if (nota <= 0 || nota >= 100) {
                System.out.println("Número inválido. Por favor, digite um número entre 0 e 100.");
            }
        } while (nota <= 0 || nota >= 100);

        if (nota > 90) {
            System.out.println("Nota A!! Parabens continue assim!");
        } else if (nota >= 80) {
            System.out.println("Nota B!! Voce esta quase la, mais um pouco e voce consegue!");
        } else if (nota >= 70) {
            System.out.println("Nota C!! Estude um pouco mais.");
        } else if (nota >= 60) {
            System.out.println("Nota D!! Foi por pouco, tenha mais atenção durante as aulas");
        } else {
            System.out.println("Nota E!! Reprovado.");
        }
        scanner.close();
    }
>>>>>>> c6bd33984219ad7e2b7dc03960e072b98a542e08
}