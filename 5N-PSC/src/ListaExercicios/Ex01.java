/*Desenvolva um algoritmo que receba três números, calcule a média aritmética
entre eles e exiba o valor obtido.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Valor de N1: ");
        n1 = scanner.nextDouble();

        System.out.println("Valor de N2: ");
        n2 = scanner.nextDouble();

        System.out.println("Valor de N3: ");
        n3 = scanner.nextDouble();

        media = (n1+n2+n3)/3;

        System.out.println("A média dos números "+n1+", "+n2+" e "+n3+" é "+media);
    }
}
