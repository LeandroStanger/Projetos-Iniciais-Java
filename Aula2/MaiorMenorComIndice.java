/*Exercício 3 — Maior e menor com índice. Leia 7 temperaturas (uma por dia da semana) e mostre 
não só a maior e a menor, mas também em que dia ocorreram (sugestão: guarde o índice da maior e 
da menor durante o percurso). */
import java.util.Scanner;

public class MaiorMenorComIndice {

    public int[] temperaturas = new int[7];
    public String[] dias = {"Domingo", "Segunda-Feira", "Terça-Feira",
                            "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};

    public void entrada() {
        Scanner SuperScanner = new Scanner(System.in);
        System.out.println("Insira as 7 temperaturas da semana:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(dias[i] + ": ");
            temperaturas[i] = SuperScanner.nextInt();
        }
        SuperScanner.close();
    }

    public void processo() {
        System.out.println("==============================");
        System.out.println("Temperaturas da semana:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(dias[i] + ": " + temperaturas[i] + "°");
        }
        System.out.println("==============================");

        int maior = temperaturas[0];
        int menor = temperaturas[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                indiceMaior = i;
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
                indiceMenor = i;
            }
        }

        System.out.println("Maior temperatura: " + maior + "° (" + dias[indiceMaior] + ")");
        System.out.println("Menor temperatura: " + menor + "° (" + dias[indiceMenor] + ")");
    }

    public void main(String[] args) {
        MaiorMenorComIndice programa = new MaiorMenorComIndice();
        programa.entrada();
        programa.processo();
    }
}