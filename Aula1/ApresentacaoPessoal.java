/*Exercício 1 — Apresentação pessoal. 
Escreva uma classe Apresentacao que declare e imprima o seu nome, idade, 
altura (em metros) e cidade de origem. Use os tipos primitivos adequados.*/
public class ApresentacaoPessoal {
    static String nome = "Leandro";
    static int idade = 29;
    static double altura = 1.89;
    static String cidade = "Nova Veneza";
    public static void main(String[] args) {
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Idade: %d", idade));
        System.out.println(String.format("Altura: %.2f", altura));
        System.out.println(String.format("Cidade: %s", cidade));
    }
}
