
/*Exercício 2 — Tipos primitivos. Crie um programa que declare uma variável de cada um dos 8 tipos 
primitivos e as imprima usando printf com os marcadores apropriados (uma linha por variável).*/

public class Exercicio2{
    static Byte idade = 29;
    static Short ano = 1996;
    static int populacao = 157_017_163;
    static long distanciaDoSol = 149_600_000L;
    static float preco = 101.89f;
    static double pi = 3.14159265358979;
    static char letra = 'A';
    static boolean  ativo = true;

    public static void main (String [] args){
        System.out.println(String.format("Byte: %d", idade));
        System.out.println(String.format("Short: %d", ano));
        System.out.println(String.format("Int: %d", populacao));
        System.out.println(String.format("Long: %d", distanciaDoSol));
        System.out.println(String.format("Float: %f", preco));
        System.out.println(String.format("Double: %f", pi));
        System.out.println(String.format("Char: %c", letra));
        System.out.println(String.format("Boolean: %b", ativo));
        
    }
}
