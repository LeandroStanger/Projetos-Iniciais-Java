import java.util.Scanner;
public class parOUimpar {
    public void main(String[] args) {
        Scanner superScaner = new Scanner(System.in);
        int numero = 0, soma = 0;

        System.out.println("Escolhi um número!");
        numero = superScaner.nextInt();
        soma = numero % 2;
        if(soma == 0){
            System.out.printf("%d É Par!\n", numero);
        }else{
            System.out.printf("%d É Impar!\n", numero);
        }
    }}

