<<<<<<< HEAD
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int alunos = scanner.nextInt();

        double[] notas = new double[alunos];

        // Laço de repetição para receber as notas dos alunos
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double total = 0;

        // Laço de repetição para verificar qual a maior nota e qual a menor nota
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            total += notas[i];
        }

        double media = total / notas.length;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Media da turma: " + String.format("%.2f", media));

        scanner.close();
    }
=======
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
        int alunos = scanner.nextInt();

        double[] notas = new double[alunos];

        // Laço de repetição para receber as notas dos alunos
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double total = 0;

        // Laço de repetição para verificar qual a maior nota e qual a menor nota
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            total += notas[i];
        }

        double media = total / notas.length;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Media da turma: " + String.format("%.2f", media));

        scanner.close();
    }
>>>>>>> c6bd33984219ad7e2b7dc03960e072b98a542e08
}