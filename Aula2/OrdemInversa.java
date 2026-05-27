/*Exercício 2 — Ordem inversa. Leia 5 nomes de cidades para um array de String e imprima-os 
por ordem inversa à da leitura. */
import java.util.Scanner;

public class OrdemInversa {

    public String[] cidades = new String[5];   // 5 posições (índices 0 a 4)

    public void entrada() {
        Scanner SuperScaner = new Scanner(System.in);
        System.out.println("Digite o nome de 5 cidades:");
        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Cidade " + (i + 1) + ": ");
            cidades[i] = SuperScaner.nextLine();
        }
        SuperScaner.close();
    }

    public void processo() {
        System.out.println("==============================");
        System.out.println("Cidades em ordem inversa:");
        for (int i = cidades.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + ": " + cidades[i]);
        }
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        OrdemInversa app = new OrdemInversa();
        app.entrada();
        app.processo();
    }
}