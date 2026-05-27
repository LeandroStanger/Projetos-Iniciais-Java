/*Exercício 5 — Desafio. Modifique o programa MediaNotas para que o número de notas 
seja perguntado ao utilizador no início (em vez de ser fixo em 5). 
Use int n = sc.nextInt(); e double[] notas = new double[n]; */

import java.util.Scanner;

public class Desafio{
    public double soma;
    public int n;
    public double[] notas;
    public double media;

    public void entrada(){
        Scanner SuperScanner = new Scanner(System.in);
        soma = 0;
        for(int i= 0; i < n;i++){
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = SuperScanner.nextDouble();
            soma += notas[i];
        }
            SuperScanner.close();
            media = soma / n;
            System.out.println(String.format("Média das %d notas %.2f%n", n, media));
    }

    public void processo(){
        Scanner SuperScanner = new Scanner(System.in);
        System.out.println("Quantas notas pretende introduzir? ");
        n = SuperScanner.nextInt();
        notas = new double[n];
    }

    public void main(String[] args) {
        Desafio desafio = new Desafio();
        processo();
        entrada();
    }
}
