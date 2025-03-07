/*Desenvolva um algoritmo que leia a idade de uma pessoa e a classifique
conforme as seguintes faixas etárias: "Criança" para idades de 0 a 12 anos,
"Adolescente" para idades entre 13 e 17 anos e "Adulto" para 18 anos ou mais.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Escreva a idade: ");
        idade = scanner.nextInt();

        if (idade <= 12){
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        }
    }
}
