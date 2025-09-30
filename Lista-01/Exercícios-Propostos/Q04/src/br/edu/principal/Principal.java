package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();

        double somaPesos = 2 + 3;
        double mediaPonderada = (n1 * 2 + n2 * 3) / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
