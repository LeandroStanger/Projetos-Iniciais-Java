
import java.util.Scanner;

public class Aula2Parte2 {

    public String[] lista = new String[4];

    public void processo() {
        String data = "Nome: " + lista[0] + "\n";
        data += "Idade: " + lista[1] + "\n";
        data += "Contato: " + lista[2] + "\n";
        data += "Data de Nacimento: " + lista[3];
        System.out.println("=============");
        System.out.println("Processed data!");
        System.out.println(data);
        System.out.println("=============");
    }

    public void entrada() {
        Scanner esseScanner = new Scanner(System.in);
        System.out.println("Sistema de catrastro!");
        System.out.println("Digite o seu nome: ");
        lista[0] = esseScanner.nextLine();
        System.out.println("Digite o seu idade: ");
        lista[1] = esseScanner.nextLine();
        System.out.println("Digite o seu contato: ");
        lista[2] = esseScanner.nextLine();
        System.out.println("Digite o seu data de nacimento: ");
        lista[3] = esseScanner.nextLine();
        esseScanner.close();
    }

    public void main(String[] args) {
        entrada();
        processo();
    }
}
