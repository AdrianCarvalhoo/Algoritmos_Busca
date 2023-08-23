package src.buscalinear;

import java.util.Scanner;

public class Busca_linear {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número você deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int numBuscado = leitor.nextInt();

        boolean encontrou = false;
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == numBuscado){
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("Encontrou");
        }else{
            System.out.println("O número não existe");
        }
    }
}