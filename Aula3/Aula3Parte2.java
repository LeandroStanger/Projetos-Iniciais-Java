import java.util.Scanner;

public class Aula3Parte2{
public void main(String[] args) {
    Scanner SuperScanner = new Scanner(System.in);
    int menu = 0;
    int[] numero = new int[2];
    int soma = 0;
    System.out.println("Calculadora!!!");
    System.out.println("Menu:");
    System.out.println("1: Soma");
    System.out.println("2: Subritaçao");
    System.out.println("3: Mutipicasao");
    System.out.println("4: Divisao");
    menu = SuperScanner.nextInt();
    switch (menu){
        case 1:
            System.out.println("Digite o primeiro numero: ");
            numero[0] = SuperScanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            numero[1] = SuperScanner.nextInt();
            soma = numero[0] + numero[1];
            System.out.printf("%d + %d = %d\n", numero[0], numero[1], soma);           
            SuperScanner.close();
            break;
            case 2:
            System.out.println("Digite o primeiro numero: ");
            numero[0] = SuperScanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            numero[1] = SuperScanner.nextInt();
            soma = numero[0] - numero[1];
            System.out.printf("%d - %d = %d\n", numero[0], numero[1], soma);
            SuperScanner.close();
            break;
            case 3:
            System.out.println("Digite o primeiro numero: ");
            numero[0] = SuperScanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            numero[1] = SuperScanner.nextInt();
            soma = numero[0] * numero[1];
            System.out.printf("%d x %d = %d\n", numero[1], numero[1], soma);
            SuperScanner.close();
            break;
            case 4:
            System.out.println("Digite o primeiro numero: ");
            numero[0] = SuperScanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            numero[1] = SuperScanner.nextInt();
            soma = numero[0] / numero[1];
            System.out.printf("%d / %d = %d\n", numero[0], numero[1], soma);
            SuperScanner.close();
            break;
    }
}}
