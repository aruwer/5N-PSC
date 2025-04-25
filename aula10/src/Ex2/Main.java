/*Proponha um algoritmo em Java para calcular a nota de um candidato em um
concurso. Para isso, você deve ler as três notas do candidato entre 0 e 10.
Em seguida, calcule a nota final dele no concurso, a qual corresponde à
média ponderada, considerando que a primeira nota tem peso 2, a segunda tem
peso 3 e a terceira tem peso 5. Exibir uma mensagem dizendo qual a média do
aluno e se ele foi aprovado ou reprovado. A média para aprovação é 7.*/
package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma nota de 0 a 10");
        System.out.println("Escreva N1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Escreva N2: ");
        double n2 = scanner.nextDouble();
        System.out.println("Escreva N3: ");
        double n3 = scanner.nextDouble();

        double p1 = 2;
        double p2 = 3;
        double p3 = 5;
        double media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
        System.out.printf("Sua média foi: %.2f", media);
        if (media >= 7){
            System.out.println("\nParabéns! Você foi aprovado!");
        } else {
            System.out.println("Sinto muito, você reprovou");
        }
    }
}
