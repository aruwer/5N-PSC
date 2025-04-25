/*Proponha um programa em Java que lê uma variável n, inteira e maior que zero,
que representa o número de linhas da figura que segue o padrão a seguir:
n= 5
*
**
***
****
******/
package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = scanner.nextInt();

        for (int linha = 1; linha <= numero; linha++){
            for (int asterisco = 1; asterisco <= linha; asterisco++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
