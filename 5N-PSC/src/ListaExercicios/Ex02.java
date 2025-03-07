/*Escreva um algoritmo que receba um número inteiro e determine se ele é par ou
ímpar. O programa deve imprimir "Par" se o número for divisível por 2 e "Ímpar"
caso contrário. Lembre-se do operador %.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();


        if (n1 % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
    }
}
