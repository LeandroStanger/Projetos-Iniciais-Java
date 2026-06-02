   /*
    * exercicio: criar um método que imprima os dados do array usando for,
    * e o resultado da impressao deve estar com a mesma estrutura do metodo
    * processo()
    */ 

   import java.util.Scanner;

public class Tarefa {
    public String[] lista = {"Digite o seu nome: ", "Digite o seu idade: ", "Digite o seu contato: ", "Digite o seu data de nacimento: "};
    public String[] dados = new String[4];
    public String[] data = {"Nome: ", "Idade: ", "Contato: ", "Data de Nacimento: "};

    public void processo(){
        System.out.println("=============================");
        System.out.println("Dados processados!");
        for(int i = 0; i < lista.length; i++){
            System.out.println(data[i] + dados[i]);
        }
        System.out.println("=============================");
    }

    public void entrada(){
        Scanner superScanner = new Scanner(System.in);
        System.out.println("Sistema de catrastro!");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
            dados[i] = superScanner.nextLine();
        }
        superScanner.close();

    }

    public void main(String[] args){
        entrada();
        processo();
    }
}
