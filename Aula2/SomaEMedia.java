/*Exercício 2 — Ordem inversa. 
Leia 5 nomes de cidades para um array de String e imprima-os por ordem inversa à da leitura. */

import java.util.Scanner;

public class SomaEMedia {

    public int[] numeros = new int[10];
    public int soma;
    public double media;

    public void entrada() {
        Scanner SuperScaner = new Scanner(System.in);
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = SuperScaner.nextInt();
        }
        SuperScaner.close();
    }

    public void processo() {
        soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        media = (double) soma / numeros.length;   // divisão real

        System.out.println("==================================");
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("==================================");
    }

    public void main(String[] args) {
        SomaEMedia programa = new SomaEMedia();
        programa.entrada();
        programa.processo();
    }
}