import java.util.Scanner;

public class anoBissexto {
    public void main(String[] args) {
        Scanner superScanner = new Scanner(System.in);
        int ano = 0;
        System.out.println("Verificador de ano bissexto.");
        ano = superScanner.nextInt();

        if (ano % 4 == 0 || ano % 100 == 0 && ano % 400 != 0) {
            System.out.printf("O ano %d é um ano bissexto\n", ano);
        } else {
            System.out.printf("O ano %d não é um ano bissexto\n", ano);
        }
    }
}
