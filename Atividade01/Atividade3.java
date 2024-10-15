<<<<<<< HEAD
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite a porcentagem do desconto: ");
        int desconto = scanner.nextInt();
        double total = valor - (valor * desconto / 100);
        System.out.println("O valor final da compra é R$" + String.format("%.2f", total) + " reais");

        scanner.close();

    }
}
=======
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite a porcentagem do desconto: ");
        int desconto = scanner.nextInt();
        double total = valor - (valor * desconto / 100);
        System.out.println("O valor final da compra é R$" + String.format("%.2f", total) + " reais");

        scanner.close();

    }
}
>>>>>>> c6bd33984219ad7e2b7dc03960e072b98a542e08
