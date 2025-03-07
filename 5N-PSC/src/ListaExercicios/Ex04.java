/*Usando a estrutura switch, escreva um programa que leia um inteiro entre 1 e 7
e imprima o dia da semana correspondente a esse número. Isto é, domingo, se
1, segunda-feira, se 2, e assim por diante.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite um número de 1 a 7: ");
        diaSemana = scanner.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um número de 1 a 7");
        }
    }
}
