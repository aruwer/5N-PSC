/*Escreva um algoritmo em Java que leia um número e exiba o próprio número,
seu sucessor e seu antecessor.*/
package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println((num - 1) + " " + num + " " + (num + 1));
    }
}
