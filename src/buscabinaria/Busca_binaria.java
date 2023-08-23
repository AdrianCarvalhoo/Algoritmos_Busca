package src.buscabinaria;

import java.util.Scanner;

public class Busca_binaria {
    public static void main(String[] args) {
        int[] vetor = new int[100];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            //System.out.println(vetor[i]);
        }

        System.out.println("Qual número você deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int numBuscado = leitor.nextInt();

        int contador = 0;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = inicio + (fim - inicio) / 2;
            contador++;
            if (vetor[meio] == numBuscado) {
                System.out.println("Quantidade de testes realizados: " + contador);
                System.out.println("Encontrou");
                return;
            } else if (vetor[meio] < numBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Quantidade de testes realizados: " + contador);
        System.out.println("O número não existe");
    }
}
