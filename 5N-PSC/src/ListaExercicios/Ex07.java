/*Desenvolva um programa que receba 5 valores inteiros, calcule e mostre a soma
e a média dos números informados.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Valor de N1: ");
        n1 = scanner.nextDouble();

        System.out.println("Valor de N2: ");
        n2 = scanner.nextDouble();

        System.out.println("Valor de N3: ");
        n3 = scanner.nextDouble();

        System.out.println("A média dos números é: "+(n1+n2+n3)/3);

    }
}
