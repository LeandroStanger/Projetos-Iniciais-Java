
import java.util.Scanner;

public class Aula2 {

    public String nome;
    public int idade;
    public String contato;
    public String dataDeNacimento;

    public void processo() {
        String data = "Nome: " + nome + "\n";
        data += "Idade: " + idade + "\n";
        data += "Contato: " + contato + "\n";
        data += "Data de Nacimento: " + dataDeNacimento;
        System.out.println("=============");
        System.out.println("Processed data:");
        System.out.println(data);
        System.out.println("=============");
    }

    public void entrada() {
        Scanner esseScanner = new Scanner(System.in);
        System.out.println("Sistema de catrastro!");
        System.out.println("Nome: ");
        nome = esseScanner.nextLine();
        System.out.println("Idade: ");
        idade = esseScanner.nextInt();
        esseScanner.nextLine();
        System.out.println("Contato: ");
        contato = esseScanner.nextLine();
        System.out.println("Data de nacimento: ");
        dataDeNacimento = esseScanner.nextLine();
        esseScanner.close();
    }

    public void main(String[] args) {
        entrada();
        processo();
    }
}
