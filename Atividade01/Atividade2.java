<<<<<<< HEAD
/* 
Italo Samuel Hylario
Desenvolvimento de Aplicações
TCTG241CNTDEV 
*/

import java.util.Scanner;
import java.math.BigInteger;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " É par");
        } else {
            System.out.println(numero + " É Ímpar");
        }

        if (numero > 0) {
            System.out.println(numero + " É positivo");
        } else if (numero == 0) {
            System.out.println(numero + " É nulo");
        } else {
            System.out.println(numero + " É negativo");
        }

        int numeroInt = (int) numero;
        boolean primo = BigInteger.valueOf(numeroInt).isProbablePrime(100);
        if (primo == true) {
            System.out.println(numero + " É primo");
        } else {
            System.out.println(numero + " Não é primo");
        }

        System.out.println("A raiz quadrada de " + numero + " é: " + String.format("%.2f", Math.sqrt(numero)));
        System.out.println(numero + " Elevado a 3 é: " + Math.pow(numero, 3));

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
import java.math.BigInteger;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " É par");
        } else {
            System.out.println(numero + " É Ímpar");
        }

        if (numero > 0) {
            System.out.println(numero + " É positivo");
        } else if (numero == 0) {
            System.out.println(numero + " É nulo");
        } else {
            System.out.println(numero + " É negativo");
        }

        int numeroInt = (int) numero;
        boolean primo = BigInteger.valueOf(numeroInt).isProbablePrime(100);
        if (primo == true) {
            System.out.println(numero + " É primo");
        } else {
            System.out.println(numero + " Não é primo");
        }

        System.out.println("A raiz quadrada de " + numero + " é: " + String.format("%.2f", Math.sqrt(numero)));
        System.out.println(numero + " Elevado a 3 é: " + Math.pow(numero, 3));

        scanner.close();
    }
}
>>>>>>> c6bd33984219ad7e2b7dc03960e072b98a542e08
