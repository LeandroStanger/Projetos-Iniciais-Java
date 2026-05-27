/*Exercício 4 — Pesquisa linear. Leia 10 inteiros para um array. 
Em seguida, peça ao utilizador um valor adicional e verifique se esse valor existe no array. 
Mostre "Encontrado na posição i" ou "Não encontrado". */
import java.util.Scanner;

public class PesquisaLinear {

    public int[] pesquisa = new int[10];
    public int alvo;

    public void main(String[] args) {

        Scanner SuperScanner = new Scanner(System.in);
        for (int i = 0; i < pesquisa.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            pesquisa[i] = SuperScanner.nextInt();
        }
        System.out.println("Pesquisa linear");
        System.out.println("Valor a procurar: ");
        alvo = SuperScanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < pesquisa.length; i++) {
            if (pesquisa[i] == alvo) {
                System.out.println("Encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado");
        }
        SuperScanner.close();
    }
}
